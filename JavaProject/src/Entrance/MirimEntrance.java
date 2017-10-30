package Entrance;

import java.awt.Image;
import java.net.URI; 
import java.net.URISyntaxException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Employment.ConditionEmployment;
import Employment.EnterpriseEmployment;
import Main.SelectMenu;
import Main.StartMain;
import Subject.MirimSubject;
import java.awt.Desktop;
public class MirimEntrance extends JFrame {
	private JLabel label;
	private JLabel label_img;
	private JButton[] entrancebtn = new JButton[4];
	private String[] img = {"/entrance_1.png", "/entrance_2.png","/entrance_3.png","/entrance_4.png"};
	Image[] btnimg = new Image[4];
	private JButton backbtn = new JButton("");
	private Image back_img = new ImageIcon(SelectMenu.class.getResource("/back_white.png")).getImage();
	public int key[];
	public MirimEntrance() {
		//mbutton.setVisible(false);
		setTitle("����");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //â �߾ӿ� ����
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		label = new JLabel("");
		label_img = new JLabel("");
		label_img.setLocation(270, 0);
		Image title_img = new ImageIcon(this.getClass().getResource("/entrance_title.png")).getImage();
		for(int i=0;i<4;i++) {
			entrancebtn[i] = new JButton("");
			btnimg[i] = new ImageIcon(this.getClass().getResource(img[i])).getImage();
		}
		label.setSize(1280,720);
		label_img.setSize(756,550);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		contentPane.add(label_img);
		contentPane.add(label);
		
		label.setIcon(new ImageIcon(img));
		label_img.setIcon(new ImageIcon(title_img));
		
		//mbutton.addActionListener(this);
		entrancebtn[0].setBounds(165, 565, 214, 93);
		entrancebtn[1].setBounds(415, 565, 214, 93);
		entrancebtn[2].setBounds(665, 565, 214, 93);
		entrancebtn[3].setBounds(915, 565, 214, 93);
		
		for(int i=0;i<4;i++) {
			entrancebtn[i].setIcon(new ImageIcon(btnimg[i]));
			entrancebtn[i].setBorderPainted(false);
			entrancebtn[i].setContentAreaFilled(false);
			entrancebtn[i].setFocusPainted(false);
			label.add(entrancebtn[i]);
		}
		setBackbtn(backbtn);
		
		//��ư�� Ŭ�� �̺�Ʈ �־��ֱ�
		entrancebtn[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	entrancebtn[0].setVisible(false);
                setVisible(false);
                MajorEntrance me = new  MajorEntrance(0);
                me.setVisible(true);
            }
        });
		entrancebtn[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	entrancebtn[1].setVisible(false);
                setVisible(false);
                IntroduceEntrance ie= new IntroduceEntrance();
                ie.setVisible(true);
            }
        });
		//���ϴٿ�ε�ް��ϱ�
		entrancebtn[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	//entrancebtn[2].setVisible(false);
                //setVisible(false);
                try { 
                	Desktop.getDesktop().browse(new URI("https://e-mirim.hs.kr/renewal/admission/down/2018/2018%20sungjuk%20program.zip"));
                } catch (IOException ioioe) {
                	ioioe.printStackTrace(); 
                	} catch (URISyntaxException ue){ 
                		ue.printStackTrace(); 
                } 

            }
        });
		entrancebtn[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	entrancebtn[3].setVisible(false);
                setVisible(false);
                FaqEntrance fe = new  FaqEntrance();
                fe.setVisible(true);
            }
        });

		

	}
	
public void setBackbtn(JButton j) {
		
		j.setIcon(new ImageIcon(back_img));
		j.setBounds(5,5,100,70);
		j.setBorderPainted(false);
		j.setContentAreaFilled(false);
		j.setFocusPainted(false);
		label.add(j);
		
		backbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                backbtn.setVisible(false);
                setVisible(false);
                SelectMenu sm = new SelectMenu();
                sm.setVisible(true);
            }
        });
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
