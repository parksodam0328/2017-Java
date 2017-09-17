package mirimguidebook;

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

public class SelectMenu extends JFrame implements ActionListener{
	private JLabel label;
	private JPanel jp;
	private JButton menubtn1;
	private JButton menubtn2;
	private JButton menubtn3;
	private JButton menubtn4;
	private JButton menubtn5;
	private JButton menubtn6;
	private JButton menubtn7;
	private JButton menubtn8;
	
	public SelectMenu() {
		
		//mbutton.setVisible(false);
		setTitle("미림가이드북");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(850, 630);
		jp = new JPanel();
		jp.setBorder(new EmptyBorder(0, 0, 0, 0));
		jp.setLayout(null);
		getContentPane().add(jp);
		
		label = new JLabel("");
		menubtn1 = new JButton("");
		menubtn2 = new JButton("");
		menubtn3 = new JButton("");
		menubtn4 = new JButton("");
		menubtn5 = new JButton("");
		menubtn6 = new JButton("");
		menubtn7 = new JButton("");
		menubtn8 = new JButton("");
		
		// 크기 조절
		label.setSize(850,600);
		menubtn1.setBounds(3,50,214,93);
		menubtn2.setBounds(3,190,214,93);
		menubtn3.setBounds(3,330,214,93);
		menubtn4.setBounds(3,465,214,93);
		menubtn5.setBounds(630,50,214,93);
		menubtn6.setBounds(630,190,214,93);
		menubtn7.setBounds(630,330,214,93);
		menubtn8.setBounds(630,465,214,93);
		
		//이미지
		Image lbimg = new ImageIcon(this.getClass().getResource("/MenuSelect.png")).getImage();
		Image btnimg1 = new ImageIcon(this.getClass().getResource("/button_subject.png")).getImage();
		Image btnimg2 = new ImageIcon(this.getClass().getResource("/button_rule.png")).getImage();
		Image btnimg3 = new ImageIcon(this.getClass().getResource("/button_club.png")).getImage();
		Image btnimg4 = new ImageIcon(this.getClass().getResource("/button_location.png")).getImage();
		Image btnimg5 = new ImageIcon(this.getClass().getResource("/button_entrance.png")).getImage();
		Image btnimg6 = new ImageIcon(this.getClass().getResource("/button_experience.png")).getImage();
		Image btnimg7 = new ImageIcon(this.getClass().getResource("/button_ employment.png")).getImage();
		Image btnimg8 = new ImageIcon(this.getClass().getResource("/button_ event.png")).getImage();
		
		jp.add(menubtn1);
		jp.add(menubtn2);
		jp.add(menubtn3);
		jp.add(menubtn4);
		jp.add(menubtn5);
		jp.add(menubtn6);
		jp.add(menubtn7);
		jp.add(menubtn8);
		jp.add(label);
		
		//이미지 넣기, 버튼 설정
		label.setIcon(new ImageIcon(lbimg));
		menubtn1.setIcon(new ImageIcon(btnimg1));
		menubtn1.setBorderPainted(false);
		menubtn1.setContentAreaFilled(false);
		menubtn1.setFocusPainted(false);
		
		menubtn2.setIcon(new ImageIcon(btnimg2));
		menubtn2.setBorderPainted(false);
		menubtn2.setContentAreaFilled(false);
		menubtn2.setFocusPainted(false);
		
		menubtn3.setIcon(new ImageIcon(btnimg3));
		menubtn3.setBorderPainted(false);
		menubtn3.setContentAreaFilled(false);
		menubtn3.setFocusPainted(false);
		
		menubtn4.setIcon(new ImageIcon(btnimg4));
		menubtn4.setBorderPainted(false);
		menubtn4.setContentAreaFilled(false);
		menubtn4.setFocusPainted(false);
		
		menubtn5.setIcon(new ImageIcon(btnimg5));
		menubtn5.setBorderPainted(false);
		menubtn5.setContentAreaFilled(false);
		menubtn5.setFocusPainted(false);
		
		menubtn5.setIcon(new ImageIcon(btnimg6));
		menubtn5.setBorderPainted(false);
		menubtn5.setContentAreaFilled(false);
		menubtn5.setFocusPainted(false);
		
		menubtn6.setIcon(new ImageIcon(btnimg7));
		menubtn6.setBorderPainted(false);
		menubtn6.setContentAreaFilled(false);
		menubtn6.setFocusPainted(false);
		
		menubtn7.setIcon(new ImageIcon(btnimg8));
		menubtn7.setBorderPainted(false);
		menubtn7.setContentAreaFilled(false);
		menubtn7.setFocusPainted(false);
		
		menubtn8.setIcon(new ImageIcon(btnimg1));
		menubtn8.setBorderPainted(false);
		menubtn8.setContentAreaFilled(false);
		menubtn8.setFocusPainted(false);
		
		menubtn6.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { // 버튼 클릭시 취업으로 이동
		menubtn6.setVisible(false);
		MirimEmployment me = new MirimEmployment();
		me.setVisible(true);
		setVisible(false);
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
