package Club;

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

public class IntroClub extends JFrame{
	private JLabel label;
	private JPanel contentPane;
	private JLabel introTitle;
	private JLabel[] intro=new JLabel[5];
	private JTextArea[] dbIntro=new JTextArea[5];
	private Image[] introImg = new Image[5];
	private String[] img = {"/introClub_1.png", "/introClub_2.png","/introClub_3.png", "/introClub_4.png"};
	String str[]=new String[5];
	int id;
	String name_sub;
	public IntroClub(int key, String sub) {
		this.id=key;
		this.name_sub=sub;
		try {
			String driverName = "com.mysql.jdbc.Driver"; // ����̹� �̸� ����
			String DBName = "MirimGuideBook";
			String dbURL = "jdbc:mysql://localhost:3306/"+DBName+"?autoReconnect=true&useSSL=false";
			String SQL = "select club_name, club_room, teacher, intro from club where id="+id+"";

			Connection con  = DriverManager.getConnection(dbURL,"root","mirim546"); // ����
			System.out.println("��񿬰�Ϸ�");
			Statement stmt = con.createStatement();
			
			stmt.execute("use "+DBName+";");
			ResultSet result = stmt.executeQuery(SQL);
			
			//db�÷� ���� ��������
			while(result.next()) {
				for(int i=0;i<4;i++) {
				str[i] = result.getString(i+1);
				}
			}
			
			result.close();
			stmt.close();
			con.close();	
		}catch(SQLException sqle) {
			System.out.println("SQLException: "+sqle.getMessage());
			System.out.println("SQLState: "+sqle.getSQLState());
		}
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(540, 720);
		setVisible(true); 
		setLocationRelativeTo(null); //â �߾ӿ� ����
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		
		//db�ʵ��
		for(int i=0; i<4; i++) {
			intro[i]=new JLabel("");
			introImg[i] = new ImageIcon(this.getClass().getResource(img[i])).getImage();
			intro[i].setIcon(new ImageIcon(introImg[i]));
			intro[i].setBounds(10, 135*(i+1), 200, 100);
			contentPane.add(intro[i]);
		}
		
		//db���� ��������
		for(int i=0;i<4;i++) {
			System.out.println(str[i]);
			dbIntro[i]=new JTextArea(str[i]);
			dbIntro[i].setFont(new Font("KoPub����ü Medium", Font.PLAIN,17));
			dbIntro[i].setOpaque(false);
			dbIntro[i].setEditable(false);
			dbIntro[i].setLineWrap(true);
			contentPane.add(dbIntro[i]);
		}
		//��ġ����
		dbIntro[0].setBounds(230, 175, 280, 100);
		dbIntro[1].setBounds(230, 302, 280, 100);
		dbIntro[2].setBounds(230, 440, 280, 100);
		dbIntro[3].setBounds(230, 565, 280, 100);
		introTitle=new JLabel("");
		introTitle.setBounds(170,8,200,100);
		Image title = new ImageIcon(this.getClass().getResource("/clubIntro.png")).getImage();
		contentPane.add(introTitle);
		introTitle.setIcon(new ImageIcon(title));
		
		label = new JLabel("");
		label.setSize(540,720);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		contentPane.add(label);
		label.setIcon(new ImageIcon(img));
		
	}
	
	public static void main(String[] args) {
	}

}