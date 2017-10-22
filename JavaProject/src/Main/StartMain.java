package Main;

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

import Subject.MirimSubject;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;


public class StartMain extends JFrame{
	private JPanel contentPane;
	private JLabel wallpaper;
	private JButton main;
	private JButton admin;
	//private JLabel label;
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
		
		wallpaper=new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		wallpaper.setSize(1280,720);
		
		main=new JButton("");
		Image mainImg = new ImageIcon(this.getClass().getResource("/MainImage.png")).getImage();
		main.setBounds(155, 15, 951, 680);
		
		admin=new JButton("");
		Image adminImg = new ImageIcon(this.getClass().getResource("/adminMode.png")).getImage();
		admin.setBounds(1120, 5, 138, 80);
		
		contentPane.add(admin);
		contentPane.add(main);
		contentPane.add(wallpaper);
		
		wallpaper.setIcon(new ImageIcon(img));
		main.setBorderPainted(false);
		main.setContentAreaFilled(false);
		main.setFocusPainted(false);
		main.setIcon(new ImageIcon(mainImg));
		//main.addActionListener(this);
		
		admin.setBorderPainted(false);
		admin.setContentAreaFilled(false);
		admin.setFocusPainted(false);
		admin.setIcon(new ImageIcon(adminImg));
		//admin.addActionListener(this);
	

		main.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            main.setVisible(false);
	            setVisible(false);
	            SelectMenu sm = new SelectMenu();
	            sm.setVisible(true);
	        }
	        
	    });
		
		//관리자모드페이지로 이동하게 수정하기
		admin.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            admin.setVisible(false);
	            setVisible(false);
	            SelectMenu sm = new SelectMenu();
	            sm.setVisible(true);
	        }
	        
	    });
	
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
