package Event;

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
import static Subject.firstSubject.key;

public class introEvent extends JFrame{
	private JLabel label;
	private JPanel contentPane;
	private JLabel introTitle;
	private JLabel[] intro=new JLabel[3];
	private JLabel[] dbIntro=new JLabel[4];
	private Image[] introImg = new Image[3];
	private String[] img = {"/introEvent_1.png", "/introEvent_2.png","/introClub_3.png"};
	String str[]=new String[4];
	int id;
	String name_sub;
	private Image image;
	public introEvent(int key, String sub) {
		this.id=key;
		this.name_sub=sub;
		try {
			String driverName = "com.mysql.jdbc.Driver"; // ����̹� �̸� ����
			String DBName = "MirimGuideBook";
			String dbURL = "jdbc:mysql://10.96.122.177:3306/"+DBName+"?autoReconnect=true&useSSL=false";
			String SQL = "select event_name, date, content, event_image from event where id="+id+"";
			//Class.forName(driverName); // ����̹� �ε�

			Connection con  = DriverManager.getConnection(dbURL,"root","mirim546"); // ����
			System.out.println("��񿬰�Ϸ�");
			Statement stmt = con.createStatement();
			
			stmt.execute("use "+DBName+";");
			ResultSet result = stmt.executeQuery(SQL);

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
		
		for(int i=0; i<3; i++) {
			intro[i]=new JLabel("");
			introImg[i] = new ImageIcon(this.getClass().getResource(img[i])).getImage();
			intro[i].setIcon(new ImageIcon(introImg[i]));
			intro[i].setBounds(10, 110*(i+1), 200, 100);
			contentPane.add(intro[i]);
		}
		for(int i=0;i<3;i++) {
			System.out.println(str[i]);
			dbIntro[i]=new JLabel(str[i]);
			dbIntro[i].setBounds(230, 110*(i+1), 300, 100);
			dbIntro[i].setFont(new Font("KoPub����ü Medium", Font.PLAIN,17));
			contentPane.add(dbIntro[i]);
		}
		image = new ImageIcon(this.getClass().getResource("/"+str[3])).getImage();
		dbIntro[3]=new JLabel(str[3]);
		dbIntro[3].setIcon(new ImageIcon(image));
		dbIntro[3].setBounds(125, 110*(3+1), 300, 230);
		contentPane.add(dbIntro[3]);
		introTitle=new JLabel("");
		introTitle.setBounds(170,8,200,100);
		Image title = new ImageIcon(this.getClass().getResource("/eventIntro.png")).getImage();
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