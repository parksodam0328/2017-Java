package Employment;

import java.awt.Font;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class IntroEmployment extends JFrame {
	private JLabel label;
	private JPanel contentPane;
	private JLabel introTitle;
	private JLabel[] intro = new JLabel[4];
	private JLabel[] dbIntro = new JLabel[4];
	private Image[] introImg = new Image[4];
	private String[] img = { "/introEmploy_1.png", "/introEmploy_2.png" };
	String str[] = new String[2];
	int year[] = new int[2];
	int id;
	String name_sub;

	public IntroEmployment(int key, String sub) {
		this.id = key;
		this.name_sub = sub;
		try {
			String DBName = "MirimGuideBook";
			String dbURL = "jdbc:mysql://localhost:3306/" + DBName + "?autoReconnect=true&useSSL=false";
			String SQL = "select year, employ_now from employment1 where id=" + id + "";

			Connection con = DriverManager.getConnection(dbURL, "root", "mirim546"); // ����
			System.out.println("��񿬰�Ϸ�");
			Statement stmt = con.createStatement();

			stmt.execute("use " + DBName + ";");
			ResultSet result = stmt.executeQuery(SQL);

			while (result.next()) {
				for (int i = 0; i < 2; i++) {
					str[i] = result.getString(i + 1);
				}
			}

			result.close();
			stmt.close();
			con.close();
		} catch (SQLException sqle) {
			System.out.println("SQLException: " + sqle.getMessage());
			System.out.println("SQLState: " + sqle.getSQLState());
		}

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);
		setLocationRelativeTo(null); // â �߾ӿ� ����

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);

		for (int i = 0; i < 2; i++) {
			intro[i] = new JLabel("");
			introImg[i] = new ImageIcon(this.getClass().getResource(img[i])).getImage();
			intro[i].setIcon(new ImageIcon(introImg[i]));
			intro[i].setBounds(10, 120 * (i + 1), 200, 100);
			contentPane.add(intro[i]);
		}

		for (int i = 0; i < 2; i++) {
			dbIntro[i] = new JLabel(str[i]);
			dbIntro[i].setBounds(230, 120 * (i + 1), 200, 100);
			dbIntro[i].setFont(new Font("KoPub����ü Medium", Font.PLAIN, 20));
			contentPane.add(dbIntro[i]);
		}
		// �÷��� �̹���
		introTitle = new JLabel("");
		introTitle.setBounds(100, 8, 200, 100);
		Image title = new ImageIcon(this.getClass().getResource("/employIntro.png")).getImage();
		contentPane.add(introTitle);
		introTitle.setIcon(new ImageIcon(title));

		label = new JLabel("");
		label.setSize(400, 400);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		contentPane.add(label);
		label.setIcon(new ImageIcon(img));

	}

	public static void main(String[] args) {
	}

}