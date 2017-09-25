package MirimGuideBook_170925ver;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MirimEntrance extends JFrame {
	private JLabel label;
	private JLabel label_img;
	private JButton[] entrancebtn = new JButton[4];
	private String[] img = {"/entrance_1.png", "/entrance_2.png","/entrance_3.png","/entrance_4.png"};
	Image[] btnimg = new Image[4];
	public MirimEntrance() {
		//mbutton.setVisible(false);
		setTitle("ÀÔÇÐ");
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
		entrancebtn[0].setBounds(165, 535, 214, 93);
		entrancebtn[1].setBounds(415, 535, 214, 93);
		entrancebtn[2].setBounds(665, 535, 214, 93);
		entrancebtn[3].setBounds(915, 535, 214, 93);
		
		for(int i=0;i<4;i++) {
			entrancebtn[i].setIcon(new ImageIcon(btnimg[i]));
			entrancebtn[i].setBorderPainted(false);
			entrancebtn[i].setContentAreaFilled(false);
			entrancebtn[i].setFocusPainted(false);
			label.add(entrancebtn[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
