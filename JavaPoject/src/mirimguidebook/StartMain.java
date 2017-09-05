package mirimguidebook;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class StartMain extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartMain frame = new StartMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StartMain() {
		JFrame frame = new JFrame("미림가이드북");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(850, 698);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new FlowLayout(0, 0, 0));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("");
		label.setSize(850,600);
		Image img = new ImageIcon(this.getClass().getResource("/MainImage.png")).getImage();
		label.setIcon(new ImageIcon(img));
		JButton mbutton = new JButton("New button");
		mbutton.setSize(100,200);
		mbutton.setBounds(300,250,300);
		contentPane.add(mbutton);
		contentPane.add(label);
	}

}
