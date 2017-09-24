package MirimGuideBook;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MirimLocation extends JFrame{
	private JLabel label;
	private JButton[] locationbtn = new JButton[3];
	private String[] img = {"/location_1.png", "/location_2.png"
			};
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
		for(int i=0;i<2;i++) {
		locationbtn[i] = new JButton("");
		btnimg[i] = new ImageIcon(this.getClass().getResource(img[i])).getImage();
		}
		label.setSize(1280,720);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		contentPane.add(label);
		label.setIcon(new ImageIcon(img));
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
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
