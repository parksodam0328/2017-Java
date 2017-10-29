package Employment;

import java.awt.Image;
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

import Main.SelectMenu;

public class ConditionEmployment extends JFrame{
	private JLabel label;
	private JButton backbtn = new JButton("");
	private JLabel year[]=new JLabel[5];
	private Image[] yearImg = new Image[5];
	private Image back_img = new ImageIcon(SelectMenu.class.getResource("/back_white.png")).getImage();
	private JLabel dbYear[]=new JLabel[5];
	
	public ConditionEmployment(){
		//mbutton.setVisible(false);
		setTitle("취업현황");
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
		for(int i=0;i<5;i++) {
			year[i] = new JLabel("");
			yearImg[i] = new ImageIcon(this.getClass().getResource("/condiEmpoyment_"+(i+1)+".png")).getImage();
			contentPane.add(year[i]);
			year[i].setIcon(new ImageIcon(yearImg[i]));
		}
		year[0].setBounds(235,80,225,100);
		year[1].setBounds(235,200,225,100);
		year[2].setBounds(235,320,225,100);
		year[3].setBounds(235,440,225,100);
		year[4].setBounds(235,560,225,100);
		contentPane.add(label);
		label.setIcon(new ImageIcon(img));
		setBackbtn(backbtn);
		try {
			String driverName = "com.mysql.jdbc.Driver"; // 드라이버 이름 지정
			String DBName = "MirimGuideBook";
			String dbURL = "jdbc:mysql://10.96.122.177:3306/"+DBName+"?autoReconnect=true&useSSL=false"; // URL 지정
			String SQL = "select employ_now from employment1";
			//Class.forName(driverName); // 드라이버 로드

			Connection con  = DriverManager.getConnection(dbURL,"root","mirim546"); // 연결
			System.out.println("디비연결완료");
			Statement stmt = con.createStatement();
			
			stmt.execute("use "+DBName+";");
			ResultSet result = stmt.executeQuery(SQL);
			//String all="";
			String[] str=new String[5];
			
			int i=0;
			while(result.next()) {
				str[i] = result.getString("employ_now");
				System.out.println(str[i]);
				i++;
			}
			result.close();
			stmt.close();
			con.close();
			
		}catch(SQLException sqle) {
			System.out.println("SQLException: "+sqle.getMessage());
			System.out.println("SQLState: "+sqle.getSQLState());
		}
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
	                MirimEmployment me = new MirimEmployment();
	                me.setVisible(true);
	            }
	        });
	}
public static void main(String[] args) {
		
	}

}
