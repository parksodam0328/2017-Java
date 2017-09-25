package MirimGuideBook_170925ver;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MirimSubject extends JFrame {
	private JLabel label;
	private JLabel label_img;
	private JButton[] gradebtn = new JButton[3];
	private String[] img = {"/subject_1.png", "/subject_2.png","/subject_3.png"};
	Image[] btnimg = new Image[3];
	public MirimSubject() {
		//mbutton.setVisible(false);
		setTitle("°ú¸ñ");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //Ã¢ Áß¾Ó¿¡ ¶ç¿ì±â
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		label = new JLabel("");
		label_img = new JLabel("");
		label_img.setLocation(270, 0);
		Image title_img = new ImageIcon(this.getClass().getResource("/subject_title.png")).getImage();
		for(int i=0;i<3;i++) {
			gradebtn[i] = new JButton("");
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
		gradebtn[0].setBounds(250, 535, 214, 93);
		gradebtn[1].setBounds(550, 535, 214, 93);
		gradebtn[2].setBounds(850, 535, 214, 93);
		
		for(int i=0;i<3;i++) {
			gradebtn[i].setIcon(new ImageIcon(btnimg[i]));
			gradebtn[i].setBorderPainted(false);
			gradebtn[i].setContentAreaFilled(false);
			gradebtn[i].setFocusPainted(false);
			label.add(gradebtn[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
