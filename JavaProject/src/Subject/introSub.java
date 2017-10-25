package Subject;

import java.awt.Image;
import java.awt.Label;
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


public class introSub extends JFrame{
	private JLabel label;
	private JPanel contentPane;
	private JLabel introTitle;
	private JLabel[] intro=new JLabel[6];
	private JLabel[] dbIntro=new JLabel[6];
	private Image[] introImg = new Image[6];
	private String[] img = {"/introSub_1.png", "/introSub_2.png","/introSub_3.png",
			"/introSub_4.png","/introSub_5.png","/introSub_6.png"};
	String str[]=new String[8];
	public introSub() {
		setTitle("����Ұ�");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(540, 720);
		setVisible(true);
		setLocationRelativeTo(null); //â �߾ӿ� ����
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		
		
		for(int i=0; i<6; i++) {
			intro[i]=new JLabel("");
			introImg[i] = new ImageIcon(this.getClass().getResource(img[i])).getImage();
			intro[i].setIcon(new ImageIcon(introImg[i]));
			intro[i].setBounds(10, 100*(i+1), 140, 70);
			contentPane.add(intro[i]);
		}
		
		for(int i=0; i<6; i++) {
			dbIntro[i]=new JLabel("db���� �� ������");
			dbIntro[i].setBounds(200, 100*(i+1), 140, 70);
			contentPane.add(dbIntro[i]);
		}
		
		introTitle=new JLabel("");
		introTitle.setBounds(170,8,200,100);
		Image title = new ImageIcon(this.getClass().getResource("/subIntro.png")).getImage();
		contentPane.add(introTitle);
		introTitle.setIcon(new ImageIcon(title));
		
		label = new JLabel("");
		label.setSize(540,720);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		contentPane.add(label);
		label.setIcon(new ImageIcon(img));
		
		try {
			String driverName = "com.mysql.jdbc.Driver"; // ����̹� �̸� ����
			String DBName = "MirimGuideBook";
			String dbURL = "jdbc:mysql://10.96.122.177:3306/"+DBName; // URL ����
			String SQL = "select * from subject;";
			//Class.forName(driverName); // ����̹� �ε�
			
			Connection con  = DriverManager.getConnection(dbURL,"root","mirim546"); // ����
			System.out.println("��񿬰�Ϸ�");
			Statement stmt = con.createStatement();
			
			stmt.execute("use "+DBName+";");
			ResultSet result = stmt.executeQuery(SQL);
			while(result.next()) {
				for(int i=1;i<8;i++) {
					str[i] = result.getString(i);
					System.out.println(str[i]);
				}
				
			}
			
			result.close();
			stmt.close();
			con.close();
			
		}catch(SQLException sqle) {
			System.out.println("SQLException: "+sqle.getMessage());
			System.out.println("SQLState: "+sqle.getSQLState());
		}
	}
	
	public static void main(String[] args) {
		new introSub();

	}

}