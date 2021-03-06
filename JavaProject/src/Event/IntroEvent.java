package Event;

import java.awt.Color;
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

public class IntroEvent extends JFrame {
	private JLabel label;
	private JPanel contentPane;
	private JLabel introTitle;
	private JLabel[] intro = new JLabel[3];
	private JTextArea[] dbIntro = new JTextArea[3];
	private Image[] introImg = new Image[3];
	private String[] img = { "/introEvent_1.png", "/introEvent_2.png", "/introEvent_3.png" };
	String str[] = new String[5];
	int id;
	String name_sub;
	private JScrollPane scroll[] = new JScrollPane[3];
	public IntroEvent(int key, String sub) {
		this.id = key;
		this.name_sub = sub;
		try {
			String DBName = "MirimGuideBook";
			String dbURL = "jdbc:mysql://localhost:3306/" + DBName + "?autoReconnect=true&useSSL=false";
			String SQL = "select event_name, date, content, event_image from event where id=" + id + "";

			Connection con = DriverManager.getConnection(dbURL, "root", "mirim546"); // 연결
			System.out.println("디비연결완료");
			Statement stmt = con.createStatement();

			stmt.execute("use " + DBName + ";");
			ResultSet result = stmt.executeQuery(SQL);

			while (result.next()) {
				for (int i = 0; i < 4; i++) {
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
		setSize(540, 720);
		setVisible(true);
		setLocationRelativeTo(null); // 창 중앙에 띄우기

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);

		for (int i = 0; i < 3; i++) {
			intro[i] = new JLabel("");
			introImg[i] = new ImageIcon(this.getClass().getResource(img[i])).getImage();
			intro[i].setIcon(new ImageIcon(introImg[i]));
			intro[i].setBounds(10, 110 * (i + 1), 200, 100);
			contentPane.add(intro[i]);
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(str[i]);
			dbIntro[i] = new JTextArea(str[i]);
			dbIntro[i].setOpaque(false);
			dbIntro[i].setEditable(false);
			dbIntro[i].setLineWrap(true);
			dbIntro[i].setFont(new Font("KoPub돋움체 Medium", Font.PLAIN, 17));
			contentPane.add(dbIntro[i]);
			scroll[i] = new JScrollPane(dbIntro[i]);
			scroll[i].setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
			scroll[i].setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			contentPane.add(scroll[i]);
			scroll[i].setOpaque(false);
			scroll[i].getViewport().setOpaque(false);
		}
		
		
		JLabel event_img = new JLabel("");
		// 디비에 저장된 이미지 이름 불러오기
		Image event_image = new ImageIcon(this.getClass().getResource("/" + str[3])).getImage();
		event_img.setIcon(new ImageIcon(event_image));
		event_img.setBounds(100, 460, 300, 210);
		contentPane.add(event_img);
		scroll[0].setBounds(230, 145, 280, 70);
		scroll[1].setBounds(230, 257, 280, 70);
		scroll[2].setBounds(230, 350, 280, 70);

		introTitle = new JLabel("");
		introTitle.setBounds(170, 8, 200, 100);
		Image title = new ImageIcon(this.getClass().getResource("/eventIntro.png")).getImage();
		contentPane.add(introTitle);
		introTitle.setIcon(new ImageIcon(title));
		
		label = new JLabel("");
		label.setSize(540, 720);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		contentPane.add(label);
		label.setIcon(new ImageIcon(img));

	}

	public static void main(String[] args) {
	}

}