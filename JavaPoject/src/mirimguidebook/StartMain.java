package mirimguidebook;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class StartMain extends JFrame implements ActionListener{

	private JPanel contentPane;
	//private JLabel label;
	private JButton mbutton;
	private JButton menubtn1;
	private JButton menubtn2;
	private JButton menubtn3;
	private JButton menubtn4;
	private JButton menubtn5;
	private JButton menubtn6;
	private JButton menubtn7;
	private JButton menubtn8;
	public StartMain() {
		
		setTitle("�̸����̵��");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(850, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		
		//label = new JLabel("");
		//label.setSize(850,600);
		mbutton = new JButton("");
		Image img = new ImageIcon(this.getClass().getResource("/MainImage.png")).getImage();
		//Image img2 = new ImageIcon(this.getClass().getResource("/MenuSelect.png")).getImage();
		mbutton.setSize(850,600);
		contentPane.add(mbutton);
		mbutton.setIcon(new ImageIcon(img));
		//contentPane.add(label);
		//label.setIcon(new ImageIcon(img2));
		mbutton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		mbutton.setVisible(false);
		SelectMenu sm = new SelectMenu();
		
	}
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
	

}
