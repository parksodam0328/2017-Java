package Main;

import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class StartMain extends JFrame{
	private JPanel contentPane;
	private JLabel wallpaper;
	private JButton main;
	private JButton admin;
	public StartMain() {
		setTitle("�̸����̵��");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //â �߾ӿ� ����
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
		
		admin.setBorderPainted(false);
		admin.setContentAreaFilled(false);
		admin.setFocusPainted(false);
		admin.setIcon(new ImageIcon(adminImg));

		main.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            main.setVisible(false);
	            setVisible(false);
	            SelectMenu sm = new SelectMenu();
	            sm.setVisible(true);
	        }
	        
	    });
		
		//�����ڸ���������� �̵��ϰ� �����ϱ�
		admin.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            try { 
                	Desktop.getDesktop().browse(new URI("http://10.96.122.177/php_admin.php"));
                } catch (IOException ioioe) {
                	ioioe.printStackTrace(); 
                	} catch (URISyntaxException ue){ 
                		ue.printStackTrace(); 
                } 

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
