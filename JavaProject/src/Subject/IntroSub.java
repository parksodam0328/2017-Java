package Subject;

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

public class IntroSub extends JFrame{
	private JLabel label;
	private JPanel contentPane;
	private JLabel introTitle;
	private JLabel[] intro=new JLabel[6];
	//private JLabel[] dbIntro=new JLabel[6];
	private JTextArea[] dbIntro=new JTextArea[6];
	private Image[] introImg = new Image[6];
	private String[] img = {"/introSub_1.png", "/introSub_2.png","/introSub_3.png",
			"/introSub_4.png","/introSub_5.png","/introSub_6.png"};
	String str[]=new String[6];
	int id;
	private JScrollPane scroll[] = new JScrollPane[6];
	String name_sub;
	public IntroSub(int key, String sub) {
		this.id=key;
		this.name_sub=sub;
		try {
			String DBName = "MirimGuideBook";
			String dbURL = "jdbc:mysql://localhost:3306/"+DBName+"?autoReconnect=true&useSSL=false";
			String SQL = "select grade ,major, name_sub, intro_sub, teacher, room from subject where id="+id+"";

			Connection con  = DriverManager.getConnection(dbURL,"root","mirim546"); // 연결
			System.out.println("디비연결완료");
			Statement stmt = con.createStatement();
			
			stmt.execute("use "+DBName+";");
			ResultSet result = stmt.executeQuery(SQL);

			while(result.next()) {
				for(int i=0;i<6;i++) {
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
		for(int i=0;i<6;i++)
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(540, 720);
		setVisible(true);
		setLocationRelativeTo(null); //창 중앙에 띄우기
		
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
		for(int i=0;i<6;i++) {
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
		
		// 위치 조정
		scroll[0].setBounds(200, 115, 260, 50);
		scroll[1].setBounds(200, 220, 260, 50);
		scroll[2].setBounds(200, 315, 260, 50);
		scroll[3].setBounds(200, 410, 260, 50);
		scroll[4].setBounds(200, 520, 260, 50);
		scroll[5].setBounds(200, 618, 260, 50);

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
		
	}
	
	public static void main(String[] args) {

	}

}