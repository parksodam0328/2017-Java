package Subject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
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
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

import Main.SelectMenu;

public class secondSubject extends JFrame{
	private JButton backbtn = new JButton("");
	private Image back_img = new ImageIcon(SelectMenu.class.getResource("/back_white.png")).getImage();
	private JButton majorbtn[]=new JButton[3];
	private String[] majorImg = {"/experience_1.png", "/experience_2.png","/experience_3.png"};
	private Image[] btnimg = new Image[3];
	private String SQL=null;
	private JButton subjectBtn[]=new JButton[12];
	private JLabel subjectLabel=new JLabel("");
//	private String subjectImg ="/buttonWall.png";
//	private Image subImg;
	public secondSubject(){
		setTitle("과목 - 2학년");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //창 중앙에 띄우기
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		JPanel p = new JPanel() {
			public void paintComponent(Graphics g) {
			    g.drawImage(img, 0, 0, null);
			     Dimension d = getSize();
			    g.drawImage(img, 0, 0, d.width, d.height, null);
			    setOpaque(false);
			    super.paintComponent(g);
			}
		};
		for(int i=0;i<3;i++) {
			majorbtn[i] = new JButton("");
			btnimg[i] = new ImageIcon(this.getClass().getResource(majorImg[i])).getImage();
		}
		p.setBorder(new EmptyBorder(0, 0, 0, 0));
		p.setLayout(null);
		getContentPane().add(p);
		majorbtn[0].setBounds(250, 70, 214, 93);
		majorbtn[1].setBounds(550, 70, 214, 93);
		majorbtn[2].setBounds(850, 70, 214, 93);
		for(int i=0;i<3;i++) {
			majorbtn[i].setIcon(new ImageIcon(btnimg[i]));
			majorbtn[i].setBorderPainted(false);
			majorbtn[i].setContentAreaFilled(false);
			majorbtn[i].setFocusPainted(false);
			p.add(majorbtn[i]);
		}
		setBackbtn(backbtn, p);
		majorbtn[0].addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	//db쿼리문바꾸기
	            SQL="select * from subject where grade=2 and major='인터랙티브미디어';";
	        }
	    });
		majorbtn[1].addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	SQL="select * from subject where grade=2 and major='뉴미디어디자인';";
	        	System.out.println(SQL);
	        }
	    });
		majorbtn[2].addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	SQL="select * from subject where grade=2 and major='뉴미디어솔루션';";
	        	
	        }
	    });
		subjectLabel.setBounds(180,250,900,300);
		subjectLabel.setLayout(new GridLayout(3,4));
		p.add(subjectLabel); 
		try {
			String driverName = "com.mysql.jdbc.Driver"; // 드라이버 이름 지정
			String DBName = "MirimGuideBook";
			String dbURL = "jdbc:mysql://10.96.122.177:3306/"+DBName+"?autoReconnect=true&useSSL=false"; // URL 지정
			SQL = "select * from subject where grade=2 and major='인터랙티브미디어';";
			//Class.forName(driverName); // 드라이버 로드

			Connection con  = DriverManager.getConnection(dbURL,"root","mirim546"); // 연결
			System.out.println("디비연결완료");
			Statement stmt = con.createStatement();
			
			stmt.execute("use "+DBName+";");
			ResultSet result = stmt.executeQuery(SQL);
			//String all="";
			String[] str=new String[96];
			int i=0;
			//subImg = new ImageIcon(this.getClass().getResource(subjectImg)).getImage();
			while(result.next()) {
				str[i] = result.getString("name_sub");
				subjectBtn[i]=new JButton(str[i]);
				subjectBtn[i].setContentAreaFilled(false);
			//	subjectBtn[i].setIcon(new ImageIcon(subImg));
				subjectBtn[i].setFont(new Font("맑은 고딕", Font.BOLD, 20));
				subjectLabel.add(subjectBtn[i]);
				
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
	
	public void setBackbtn(JButton j, JPanel p) {
		
		j.setIcon(new ImageIcon(back_img));
		j.setBounds(5,5,100,70);
		j.setBorderPainted(false);
		j.setContentAreaFilled(false);
		j.setFocusPainted(false);
		p.add(j);
		
		backbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                backbtn.setVisible(false);
                setVisible(false);
                MirimSubject ms = new MirimSubject();
                ms.setVisible(true);
            }
        });
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}