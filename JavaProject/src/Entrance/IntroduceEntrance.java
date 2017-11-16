package Entrance;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Main.SelectMenu;
import static Subject.FirstSubject.key;

public class IntroduceEntrance extends JFrame implements ActionListener {
	private int id = 0;
	private JPanel contentPane;
	private JLabel label;
	private JButton backbtn;
	private JLabel notice;
	int i = 0;
	int row;
	private String[] sub;
	private Image back_img = new ImageIcon(SelectMenu.class.getResource("/back_white.png")).getImage();
	private JButton Introducing[] = new JButton[6];

	public IntroduceEntrance() {
		setTitle("���м���ȸ");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); // â �߾ӿ� ����
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);

		label = new JLabel("");
		label.setSize(1280, 720);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();

		JLabel button = new JLabel("");
		button.setBounds(250, 200, 800, 400);
		button.setLayout(new GridLayout(2, 3));

		notice = new JLabel("");
		notice.setBounds(300, 35, 700, 140);
		Image img2 = new ImageIcon(this.getClass().getResource("/entrance_notice.png")).getImage();

		contentPane.add(notice);
		contentPane.add(button);
		contentPane.add(label);
		label.setIcon(new ImageIcon(img));
		notice.setIcon(new ImageIcon(img2));

		backbtn = new JButton("");
		setBackbtn(backbtn);
		try {
			String DBName = "MirimGuideBook";
			String dbURL = "jdbc:mysql://localhost:3306/" + DBName + "?autoReconnect=true&useSSL=false";
			String SQL = "select id, date, apply, image_location from entrance2;";
			System.out.println(SQL);
			Connection con = DriverManager.getConnection(dbURL, "root", "mirim546"); // ����
			System.out.println("��񿬰�Ϸ�");
			Statement stmt = con.createStatement();

			stmt.execute("use " + DBName + ";");
			ResultSet result = stmt.executeQuery(SQL);
			java.sql.ResultSetMetaData rsmd = result.getMetaData();
			result.last();
			row = result.getRow(); //���ڵ� ��
			result.beforeFirst();
			sub = new String[row];
			Introducing = new JButton[row];
			key = new int[row];
			
			// ����� ���� �ҷ�����
			while (result.next()) {
				id = result.getInt("id");
				sub[i] = result.getString("date");
				Introducing[i] = new JButton((i + 1) + "ȸ");
				Introducing[i].setBounds(60, 75 * (3 + i), 200, 50);
				Introducing[i].setFont(new Font("KoPub����ü Medium", Font.PLAIN, 15));
				Introducing[i].addActionListener(this);
				Introducing[i].setBackground(new Color(166, 165, 160));
				button.add(Introducing[i]);
				key[i] = id;
				i++;
			}
			result.close();
			stmt.close();
			con.close();

		} catch (SQLException sqle) {
			System.out.println("SQLException: " + sqle.getMessage());
			System.out.println("SQLState: " + sqle.getSQLState());
		}
	}
	//�� ��ư���� �̺�Ʈ����
	@Override
	public void actionPerformed(ActionEvent e) {
		for (int j = 0; j < row; j++)
			if (e.getSource() == Introducing[j]) {
				IntroMiddle is = new IntroMiddle(key[j], sub[j]);
				System.out.println(sub[j]);
				is.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				is.setTitle(Introducing[j].getText());
				is.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						is.setVisible(false);
						is.dispose();
					}
				});

			}
	}
	//�ڷ� ���� ��ư
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
				MirimEntrance me = new MirimEntrance();
				me.setVisible(true);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}