package Location;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Entrance.MirimEntrance;

public class outLocation extends JFrame{
	private JLabel label;
	private JLabel label_img;
	private JButton[] locationbtn = new JButton[3];
	private String[] img = {"/location_1.png", "/location_2.png"};
	Image[] btnimg = new Image[3];
	public outLocation(){
		//mbutton.setVisible(false);
		setTitle("외부위치");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //창 중앙에 띄우기
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		label = new JLabel("");
		label_img = new JLabel("");
		label_img.setLocation(50, 150);
		Image intro_img = new ImageIcon(this.getClass().getResource("/public_location.png")).getImage();
		label.setSize(1280,720);
		label_img.setSize(457,370);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		//contentPane.add(label_img);
		//contentPane.add(label);
		label.setIcon(new ImageIcon(img));
		label_img.setIcon(new ImageIcon(intro_img));
		
		/* 소담이가할거
		JTextArea textArea = new JTextArea("outLocation",30,40);
		
		textArea.setLocation(100,0);
		label.add(textArea);
		*/

	}
	public static void main(String[] args) {
		
	}

}
