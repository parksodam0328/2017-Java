package Experience;

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
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class IntroExper2 extends JFrame {
	private JLabel label;
	private JPanel contentPane;
	private JLabel introTitle;
	private JTextArea dbIntro;
	String str;
	int id;
	String name_sub;

	public IntroExper2(int key, String sub) {
		this.id = key;
		this.name_sub = sub;
		try {
			String DBName = "MirimGuideBook";
			String dbURL = "jdbc:mysql://localhost:3306/" + DBName + "?autoReconnect=true&useSSL=false";
			String SQL = "select coding from experience2 where id=" + id + ";";

			Connection con = DriverManager.getConnection(dbURL, "root", "mirim546"); // ����
			System.out.println("��񿬰�Ϸ�");
			Statement stmt = con.createStatement();

			stmt.execute("use " + DBName + ";");
			ResultSet result = stmt.executeQuery(SQL);

			while (result.next()) {
				for (int i = 0; i < 1; i++)
					str = result.getString(i + 1);
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
		setSize(700, 400);
		setVisible(true);
		setLocationRelativeTo(null); // â �߾ӿ� ����

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);

		for (int i = 0; i < 1; i++) {
			System.out.println(str);
			dbIntro = new JTextArea(str);
			dbIntro.setFont(new Font("KoPub����ü Medium", Font.PLAIN, 17));
			dbIntro.setOpaque(false);
			dbIntro.setEditable(false);
			dbIntro.setLineWrap(true);
			contentPane.add(dbIntro);
		}
		dbIntro.setBounds(100, 120, 550, 300);

		introTitle = new JLabel("");
		introTitle.setBounds(250, 8, 200, 100);
		Image title = new ImageIcon(this.getClass().getResource("/expIntro.png")).getImage();
		introTitle.setIcon(new ImageIcon(title));

		label = new JLabel("");
		label.setSize(700, 400);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		contentPane.add(introTitle);
		contentPane.add(label);
		label.setIcon(new ImageIcon(img));

	}

	public static void main(String[] args) {
	}

}
