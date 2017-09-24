package MirimGuideBook;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MirimExperience extends JFrame {
	private JLabel label;
	private JButton[] majorbtn = new JButton[3];
	private String[] img = {"/experience_1.png", "/experience_2.png","/experience_3.png"};
	Image[] btnimg = new Image[3];
	public MirimExperience() {
		//mbutton.setVisible(false);
		setTitle("Ãë¾÷");
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
			majorbtn[i] = new JButton("");
			btnimg[i] = new ImageIcon(this.getClass().getResource(img[i])).getImage();
		}
		label.setSize(1280,720);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		contentPane.add(label);
		label.setIcon(new ImageIcon(img));
		//mbutton.addActionListener(this);
		majorbtn[0].setBounds(250, 535, 214, 93);
		majorbtn[1].setBounds(550, 535, 214, 93);
		majorbtn[2].setBounds(850, 535, 214, 93);
		
		for(int i=0;i<3;i++) {
			majorbtn[i].setIcon(new ImageIcon(btnimg[i]));
			majorbtn[i].setBorderPainted(false);
			majorbtn[i].setContentAreaFilled(false);
			majorbtn[i].setFocusPainted(false);
			label.add(majorbtn[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
