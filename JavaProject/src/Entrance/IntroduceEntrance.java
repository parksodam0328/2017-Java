<<<<<<< HEAD
//�⵵���� ���м���ȸ ������ �ٸ� �� �����Ƿ� ��ȸ�ϴ��� db���� �� ��������!!
package Entrance;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.SelectMenu;

public class IntroduceEntrance extends JFrame{
	private JPanel contentPane;
	private JLabel label;
	private JButton backbtn;
	private JLabel notice;
	private Image back_img = new ImageIcon(SelectMenu.class.getResource("/back_white.png")).getImage();
	private JButton Introducing[]=new JButton[6];
	public IntroduceEntrance(){
		//mbutton.setVisible(false);
		setTitle("���м���ȸ");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //â �߾ӿ� ����
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		
		label = new JLabel("");
		label.setSize(1280,720);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		
		JLabel button=new JLabel("");
		button.setBounds(250,200,800,400);
		button.setLayout(new GridLayout(2,3));
		
		notice = new JLabel("");
		notice.setBounds(300,35,700,140);
		Image img2 = new ImageIcon(this.getClass().getResource("/entrance_notice.png")).getImage();
		
		//��ư��ġ �ٽ� �����ϱ�
		for(int i=0; i<6; i++) {
			Introducing[i]=new JButton((i+1)+"ȸ");
			//Introducing[i].setBounds(100*i,50,50,50);
			button.add(Introducing[i]);
		}
		contentPane.add(notice);
		contentPane.add(button);
		contentPane.add(label);
		label.setIcon(new ImageIcon(img));
		notice.setIcon(new ImageIcon(img2));
		
		backbtn = new JButton("");
		setBackbtn(backbtn);
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
                MirimEntrance me = new MirimEntrance();
                me.setVisible(true);
            }
        });
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
=======
//�⵵���� ���м���ȸ ������ �ٸ� �� �����Ƿ� ��ȸ�ϴ��� db���� �� ��������!!
package Entrance;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.SelectMenu;

public class IntroduceEntrance extends JFrame{
	private JPanel contentPane;
	private JLabel label;
	private JButton backbtn;
	private JLabel notice;
	private Image back_img = new ImageIcon(SelectMenu.class.getResource("/back_white.png")).getImage();
	private JButton Introducing[]=new JButton[6];
	public IntroduceEntrance(){
		//mbutton.setVisible(false);
		setTitle("���м���ȸ");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //â �߾ӿ� ����
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		
		label = new JLabel("");
		label.setSize(1280,720);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		
		JLabel button=new JLabel("");
		button.setBounds(250,200,800,400);
		button.setLayout(new GridLayout(2,3));
		
		notice = new JLabel("");
		notice.setBounds(300,35,700,140);
		Image img2 = new ImageIcon(this.getClass().getResource("/entrance_notice.png")).getImage();
		
		//��ư��ġ �ٽ� �����ϱ�
		for(int i=0; i<6; i++) {
			Introducing[i]=new JButton((i+1)+"ȸ");
			//Introducing[i].setBounds(100*i,50,50,50);
			button.add(Introducing[i]);
		}
		contentPane.add(notice);
		contentPane.add(button);
		contentPane.add(label);
		label.setIcon(new ImageIcon(img));
		notice.setIcon(new ImageIcon(img2));
		
		backbtn = new JButton("");
		setBackbtn(backbtn);
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
                MirimEntrance me = new MirimEntrance();
                me.setVisible(true);
            }
        });
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
>>>>>>> c8fa47adcdb9180287854cf3e4c18d6bd908f34b
