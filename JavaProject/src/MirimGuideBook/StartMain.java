package MirimGuideBook;

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
	
	public StartMain() {
		setTitle("미림가이드북");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //창 중앙에 띄우기
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		
		mbutton = new JButton("");
		Image img = new ImageIcon(this.getClass().getResource("/MainImage.png")).getImage();
		mbutton.setSize(1280,720);
		
		contentPane.add(mbutton);
		mbutton.setIcon(new ImageIcon(img));
		mbutton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) { //버튼 클릭시 메뉴 화면으로 이동
		mbutton.setVisible(false);
		SelectMenu sm = new SelectMenu();
		sm.setVisible(true);
		setVisible(false);
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
