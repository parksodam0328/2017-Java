package Experience;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.SelectMenu;

public class MirimExperience extends JFrame {
	private JLabel label;
	private JLabel label_img;
	private JButton[] experbtn = new JButton[3];
	private String[] img = { "/major_software.png", "/major_design.png" };
	Image[] btnimg = new Image[2];
	private JButton backbtn = new JButton("");
	private Image back_img = new ImageIcon(SelectMenu.class.getResource("/back_white.png")).getImage();

	public MirimExperience() {
		setTitle("ü��");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); // â �߾ӿ� ����
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		label = new JLabel("");
		label_img = new JLabel("");
		label_img.setLocation(270, 0);
		Image title_img = new ImageIcon(this.getClass().getResource("/experience_title.png")).getImage();
		for (int i = 0; i < 2; i++) {
			experbtn[i] = new JButton("");
			btnimg[i] = new ImageIcon(this.getClass().getResource(img[i])).getImage();
		}
		label.setSize(1280, 720);
		label_img.setSize(756, 550);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		contentPane.add(label_img);
		contentPane.add(label);

		label.setIcon(new ImageIcon(img));
		label_img.setIcon(new ImageIcon(title_img));

		experbtn[0].setBounds(410, 565, 214, 93);
		experbtn[1].setBounds(660, 565, 214, 93);

		for (int i = 0; i < 2; i++) {
			experbtn[i].setIcon(new ImageIcon(btnimg[i]));
			experbtn[i].setBorderPainted(false);
			experbtn[i].setContentAreaFilled(false);
			experbtn[i].setFocusPainted(false);
			label.add(experbtn[i]);
		}
		setBackbtn(backbtn);
		// ��ư�� Ŭ�� �̺�Ʈ �־��ֱ�
		experbtn[0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				experbtn[0].setVisible(false);
				setVisible(false);
				SoftwareExper se = new SoftwareExper();
				se.setVisible(true);
			}
		});

		experbtn[1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				experbtn[1].setVisible(false);
				setVisible(false);
				DesignExper de = new DesignExper();
				de.setVisible(true);
			}
		});
	}

	// �ڷΰ��� ��ư
	public void setBackbtn(JButton j) {

		j.setIcon(new ImageIcon(back_img));
		j.setBounds(5, 5, 100, 70);
		j.setBorderPainted(false);
		j.setContentAreaFilled(false);
		j.setFocusPainted(false);
		label.add(j);

		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				backbtn.setVisible(false);
				setVisible(false);
				SelectMenu sm = new SelectMenu();
				sm.setVisible(true);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}