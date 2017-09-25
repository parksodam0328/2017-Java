package Subject;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Entrance.MirimEntrance;

public class firstSubject extends JFrame{
	private JLabel label;
	private JButton[] locationbtn = new JButton[3];
	private String[] img = {"/location_1.png", "/location_2.png"};
	Image[] btnimg = new Image[3];
	public firstSubject(){
		//mbutton.setVisible(false);
<<<<<<< HEAD:JavaProject/src/Location/inLocation.java
		setTitle("내부위치");
=======
		setTitle("1학년");
>>>>>>> d896090899d8a4ff4b23d260eba55d9245c77a05:JavaProject/src/Subject/firstSubject.java
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //창 중앙에 띄우기
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		label = new JLabel("");
		label.setSize(1280,720);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		contentPane.add(label);
		label.setIcon(new ImageIcon(img));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
