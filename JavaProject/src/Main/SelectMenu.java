package Main;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Club.MirimClub;
import Employment.MirimEmployment;
import Entrance.MirimEntrance;
import Event.MirimEvent;
import Experience.MirimExperience;
import Location.MirimLocation;
import Rule.MirimRule;
import Subject.MirimSubject;

public class SelectMenu extends JFrame{
	private JLabel label;
	private JPanel jp;
	private JButton menubtn[] = new JButton[8];
	
	private String[] img = {"/button_subject.png","/button_rule.png","/button_club.png",
			"/button_location.png", "/button_entrance.png", "/button_experience.png", 
			"/button_ employment.png","/button_ event.png"
			};
	private Image[] btnimg = new Image[8];
	
	private JButton backbtn = new JButton("");
	private Image back_img = new ImageIcon(SelectMenu.class.getResource("/back_white.png")).getImage();
	
	public SelectMenu() {
		setTitle("�޴�����");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //â �߾ӿ� ����
		jp = new JPanel();
		jp.setBorder(new EmptyBorder(0, 0, 0, 0));
		jp.setLayout(null);
		getContentPane().add(jp);
		
		label = new JLabel(""); // ���̺� ����
		for(int i=0;i<8;i++) { // ��ư ����
		menubtn[i] = new JButton("");
		btnimg[i] = new ImageIcon(SelectMenu.class.getResource(img[i])).getImage();
		}
		
		// ���̺� ũ�� �� ��ư ��ġ, ũ�� ����
		label.setSize(1280,720);
		menubtn[0].setBounds(50,85,214,93);
		menubtn[1].setBounds(50,235,214,93);
		menubtn[2].setBounds(50,385,214,93);
		menubtn[3].setBounds(50,535,214,93);
		menubtn[4].setBounds(1000,85,214,93);
		menubtn[5].setBounds(1000,235,214,93);
		menubtn[6].setBounds(1000,385,214,93);
		menubtn[7].setBounds(1000,535,214,93);
		
		//�� �̹���
		Image lbimg = new ImageIcon(SelectMenu.class.getResource("/MenuSelect.png")).getImage();
		
		jp.add(label); // �ǳڿ� ���̺� �߰�
		
		//���̺� �̹��� �ֱ�
		label.setIcon(new ImageIcon(lbimg));
		
		//��ư�� �̹��� �ְ�, ����
		for(int i=0;i<8;i++) {
			menubtn[i].setIcon(new ImageIcon(btnimg[i]));
			menubtn[i].setBorderPainted(false);
			menubtn[i].setContentAreaFilled(false);
			menubtn[i].setFocusPainted(false);
			label.add(menubtn[i]);
		}
		setBackbtn(backbtn);
		//��ư�� Ŭ�� �̺�Ʈ �־��ֱ�
		menubtn[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menubtn[0].setVisible(false);
                setVisible(false);
                MirimSubject ms = new MirimSubject();
                ms.setVisible(true);
            }
        });
		menubtn[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menubtn[1].setVisible(false);
                setVisible(false);
                MirimRule mr = new MirimRule();
                mr.setVisible(true);
            }
        });
		menubtn[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menubtn[2].setVisible(false);
                setVisible(false);
                MirimClub mc = new MirimClub();
                mc.setVisible(true);
            }
        });
		menubtn[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menubtn[3].setVisible(false);
                setVisible(false);
                MirimLocation ml = new MirimLocation();
                ml.setVisible(true);
            }
        });
		menubtn[4].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menubtn[4].setVisible(false);
                setVisible(false);
                MirimEntrance met = new MirimEntrance();
                met.setVisible(true);
            }
        });
		menubtn[5].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menubtn[5].setVisible(false);
                setVisible(false);
                MirimExperience mex = new MirimExperience();
                mex.setVisible(true);
            }
        });
		menubtn[6].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menubtn[6].setVisible(false);
                setVisible(false);
                MirimEmployment mem = new MirimEmployment();
                mem.setVisible(true);
            }
        });
		menubtn[7].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menubtn[7].setVisible(false);
                setVisible(false);
                MirimEvent mev = new MirimEvent();
                mev.setVisible(true);
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
                StartMain sm = new StartMain();
                sm.setVisible(true);
            }
        });
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectMenu frame1 = new SelectMenu();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}