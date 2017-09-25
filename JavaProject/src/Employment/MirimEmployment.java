package Employment;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Location.InLocation;
import Location.OutLocation;

public class MirimEmployment extends JFrame{
	private JLabel label;
	private JLabel label_img;
	private JButton[] employmentbtn = new JButton[3];
	private String[] img = {"/employment_1.png", "/employment_2.png"};
	Image[] btnimg = new Image[3];
	public MirimEmployment() {
		//mbutton.setVisible(false);
		setTitle("���");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //â �߾ӿ� ����
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		label = new JLabel("");
		label_img = new JLabel("");
		label_img.setLocation(270, 0);
		Image title_img = new ImageIcon(this.getClass().getResource("/employment_title.png")).getImage();
		for(int i=0;i<2;i++) {
			employmentbtn[i] = new JButton("");
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
		employmentbtn[0].setBounds(300, 565, 214, 93);
		employmentbtn[1].setBounds(800, 565, 214, 93);
		
		for(int i=0;i<2;i++) {
			employmentbtn[i].setIcon(new ImageIcon(btnimg[i]));
			employmentbtn[i].setBorderPainted(false);
			employmentbtn[i].setContentAreaFilled(false);
			employmentbtn[i].setFocusPainted(false);
			label.add(employmentbtn[i]);
		}
		
		//��ư�� Ŭ�� �̺�Ʈ �־��ֱ�
		employmentbtn[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				employmentbtn[0].setVisible(false);
				setVisible(false);
				ConditionEmployment ce = new ConditionEmployment();
				ce.setVisible(true);
			}
		});
		
		employmentbtn[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				employmentbtn[1].setVisible(false);
				setVisible(false);
				EnterpriseEmployment ee = new EnterpriseEmployment();
				ee.setVisible(true);
			}
		});
	}		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
