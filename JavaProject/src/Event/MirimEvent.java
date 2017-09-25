package Event;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MirimEvent extends JFrame {
	private JLabel label;
	private JButton eventbtn;
	private String img = "/event.png";
	Image btnimg;
	public MirimEvent() {
		//mbutton.setVisible(false);
		setTitle("Çà»ç");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //Ã¢ Áß¾Ó¿¡ ¶ç¿ì±â
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		label = new JLabel("");
		eventbtn = new JButton("");
		btnimg = new ImageIcon(this.getClass().getResource(img)).getImage();
		label.setSize(1280,720);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		contentPane.add(label);
		label.setIcon(new ImageIcon(img));
		//mbutton.addActionListener(this);
		eventbtn.setBounds(530, 565, 214, 93);

		
			eventbtn.setIcon(new ImageIcon(btnimg));
			eventbtn.setBorderPainted(false);
			eventbtn.setContentAreaFilled(false);
			eventbtn.setFocusPainted(false);
			label.add(eventbtn);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
