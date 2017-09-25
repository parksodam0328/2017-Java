package Rule;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SchoolRule extends JFrame{
	private JLabel label;
	public SchoolRule(){
		//mbutton.setVisible(false);
		setTitle("학교 내 규정");
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

}
