package MirimGuideBook;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MirimClub extends JFrame {
	private JLabel label;
	private JButton[] clubbtn = new JButton[3];
	private String[] img = {"/club_1.png", "/club_2.png","/club_3.png"
			};
	Image[] btnimg = new Image[3];
	public MirimClub() {
		//mbutton.setVisible(false);
		setTitle("µ¿¾Æ¸®");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //Ã¢ Áß¾Ó¿¡ ¶ç¿ì±â
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		label = new JLabel("");
		for(int i=0;i<3;i++) {
		clubbtn[i] = new JButton("");
		btnimg[i] = new ImageIcon(this.getClass().getResource(img[i])).getImage();
		}
		label.setSize(1280,720);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		contentPane.add(label);
		label.setIcon(new ImageIcon(img));
		//mbutton.addActionListener(this);
		clubbtn[0].setBounds(250, 535, 214, 93);
		clubbtn[1].setBounds(550, 535, 214, 93);
		clubbtn[2].setBounds(850, 535, 214, 93);
		
		for(int i=0;i<3;i++) {
			clubbtn[i].setIcon(new ImageIcon(btnimg[i]));
			clubbtn[i].setBorderPainted(false);
			clubbtn[i].setContentAreaFilled(false);
			clubbtn[i].setFocusPainted(false);
			label.add(clubbtn[i]);
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
