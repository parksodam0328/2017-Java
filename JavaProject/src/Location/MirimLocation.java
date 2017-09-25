package Location;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Subject.MirimSubject;

import java.sql.*;

public class MirimLocation extends JFrame{
	private JLabel label;
	private JLabel label_img;
	private JButton[] locationbtn = new JButton[3];
	private String[] img = {"/location_1.png", "/location_2.png"};
	Image[] btnimg = new Image[3];
	public MirimLocation() {
		//mbutton.setVisible(false);
		setTitle("��ġ");
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
		Image title_img = new ImageIcon(this.getClass().getResource("/location_title.png")).getImage();
		for(int i=0;i<2;i++) {
			locationbtn[i] = new JButton("");
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
		locationbtn[0].setBounds(300, 535, 214, 93);
		locationbtn[1].setBounds(800, 535, 214, 93);
		
		for(int i=0;i<2;i++) {
			locationbtn[i].setIcon(new ImageIcon(btnimg[i]));
			locationbtn[i].setBorderPainted(false);
			locationbtn[i].setContentAreaFilled(false);
			locationbtn[i].setFocusPainted(false);
			label.add(locationbtn[i]);
			}
		
		//��ư�� Ŭ�� �̺�Ʈ �־��ֱ�
		locationbtn[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				locationbtn[0].setVisible(false);
				setVisible(false);
				outLocation ol = new outLocation();
				ol.setVisible(true);
			}
		});
		
		locationbtn[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				locationbtn[0].setVisible(false);
				setVisible(false);
				inLocation il = new inLocation();
				il.setVisible(true);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
