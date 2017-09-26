package Subject;

import java.awt.Image;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

import Entrance.MirimEntrance;
import Main.SelectMenu;
import Main.StartMain;

public class firstSubject extends JFrame{
	private JLabel label;

	private JButton[] locationbtn = new JButton[3];
	private String[] img = {"/location_1.png", "/location_2.png"};
	Image[] btnimg = new Image[3];
	private JButton backbtn = new JButton("");
	private Image back_img = new ImageIcon(SelectMenu.class.getResource("/back_white.png")).getImage();
	private List hymnList = new List();
	public firstSubject(){
		//공통과목: 1
		//인미+솔루: 2
		//디자인:3
		//인미:4
		//솔루:5
		setTitle("1학년");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //창 중앙에 띄우기
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		label = new JLabel("");
		hymnList.setBounds(600,100,400,500);
		label.add(hymnList);
		label.setSize(1280,720);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		contentPane.add(label);
		label.setIcon(new ImageIcon(img));
		setBackbtn(backbtn);
	}
	
	public void setBackbtn(JButton j) {
		
		j.setIcon(new ImageIcon(back_img));
		j.setBounds(5,5,100,70);
		j.setBorderPainted(false);
		j.setContentAreaFilled(false);
		j.setFocusPainted(false);
		label.add(j);
		
		backbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                backbtn.setVisible(false);
                setVisible(false);
                MirimSubject ms = new MirimSubject();
                ms.setVisible(true);
            }
        });

	try {
		String driverName = "com.mysql.jdbc.Driver"; // 드라이버 이름 지정
		String DBName = "MirimGuideBook";
		String dbURL = "jdbc:mysql://localhost:3306/"+DBName; // URL 지정
		String SQL = "select * from subject;";
		
		//Class.forName(driverName); // 드라이버 로드
		
		Connection con  = DriverManager.getConnection(dbURL,"root","mirim546"); // 연결
		System.out.println("디비연결완료");
		Statement stmt = con.createStatement();
		
		stmt.execute("use "+DBName+";");
		ResultSet result = stmt.executeQuery(SQL);
		
		while(result.next()) {
			for(int i=1;i<=7;i++) {
			String str = result.getString(i);
			hymnList.add(str);
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
		// TODO Auto-generated method stub

	}

}
