package Location;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class InLocation extends JFrame{
	private JLabel label;
	public InLocation(){
		//mbutton.setVisible(false);
		setTitle("내부위치");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //창 중앙에 띄우기
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		label = new JLabel("");
		label.setSize(1280,720);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		contentPane.add(label);
		label.setIcon(new ImageIcon(img));
	}
	public static void main(String[] args) {
		try {
			String driverName = "com.mysql.jdbc.Driver"; // 드라이버 이름 지정
			String DBName = "MirimGuideBook";
			String dbURL = "jdbc:mysql://localhost:3306/"+DBName; // URL 지정
			String SQL = "select * from location_out;";
			//String SQL = "select * from student;";
			/* DB생성 쿼리문
			String sqlCT = "CREATE TABLE STUDENT (" + "id varchar(20) NOT NULL, " + "name varchar(20) NOT NULL, " +
						"snum int NOT NULL, " + "dept varchar(20) NOT NULL, " +"PRIMARY KEY(id) " +");";
			*/
			//String sqlCT="create";
			Class.forName(driverName); // 드라이버 로드
			
			Connection con  = DriverManager.getConnection(dbURL,"root","mirim546"); // 연결
			System.out.println("디비연결");
			Statement stmt = con.createStatement();
			
			//DB 생성
			/*
			stmt.executeUpdate(sqlCT);
			System.out.println("Table Created");
			*/   
			//db 인서트문
			/*
			stmt.executeUpdate("insert into STUDENT values('01','Noon',20100909,'Security');");
			stmt.executeUpdate("insert into STUDENT values('02','Bom',20100909,'IT');");
			stmt.executeUpdate("insert into STUDENT values('03','Rye',20100909,'Devel');");
			stmt.executeUpdate("insert into STUDENT values('04','Kim',20100909,'Random');");
			System.out.println("데이터 insert완료");
            */
			
			stmt.executeQuery(SQL);
			ResultSet result = stmt.executeQuery(SQL);
			System.out.println(result.next());
			for(int i=2; i<=10; i++) {
				System.out.println(result.getString(i)+"\t");
			}
			/*while(result.next()) {
				System.out.print(result.getString(1)+"\t");
				System.out.print(result.getString(2)+"\t");
				System.out.print(result.getString(3)+"\t");
				System.out.print(result.getString(4)+"\n");
				System.out.print("출력완료");
            }*/
			con.close();
		}
		catch(Exception e){
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                }
        }

}
