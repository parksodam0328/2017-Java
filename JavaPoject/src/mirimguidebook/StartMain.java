package mirimguidebook;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

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
		setTitle("�̸����̵��");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(850, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		
		JLabel label = new JLabel("");
		label.setSize(850,600);
		JButton mbutton = new JButton("");
		Image img = new ImageIcon(this.getClass().getResource("/MainImage.png")).getImage();
		mbutton.setSize(850,600);
		contentPane.add(mbutton);
		mbutton.setIcon(new ImageIcon(img));
		contentPane.add(label);
	}

}
