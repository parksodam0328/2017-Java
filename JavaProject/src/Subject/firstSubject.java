package Subject;

import java.awt.GridLayout;
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

import Subject.MirimSubject;
import Main.SelectMenu;

public class firstSubject extends JFrame {
	private JLabel label;
	private JLabel label_img;
	private JButton[] gradebtn = new JButton[3];
	private JButton[] subjectBtn=new JButton[13];
	private String[] img = {"/experience_1.png", "/experience_2.png","/experience_3.png"};
	Image[] btnimg = new Image[3];
	private JButton backbtn = new JButton("");
	private Image back_img = new ImageIcon(SelectMenu.class.getResource("/back_white.png")).getImage();
	private String[] sub = new String[13]; //과목 이름
	public firstSubject() {
		//mbutton.setVisible(false);
		setTitle("인터랙티브미디어 과목");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //창 중앙에 띄우기
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		label = new JLabel("");
		label_img = new JLabel("");

		label_img.setLocation(270, 0);
		for(int i=0;i<3;i++) {
			gradebtn[i] = new JButton("");
			btnimg[i] = new ImageIcon(this.getClass().getResource(img[i])).getImage();
		}
		label.setSize(1280,720);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		contentPane.add(label_img);
		contentPane.add(label);
		
		label.setIcon(new ImageIcon(img));
		//mbutton.addActionListener(this);
		gradebtn[0].setBounds(250, 70, 214, 93);
		gradebtn[1].setBounds(550, 70, 214, 93);
		gradebtn[2].setBounds(850, 70, 214, 93);
		
		for(int i=0;i<3;i++) {
			gradebtn[i].setIcon(new ImageIcon(btnimg[i]));
			gradebtn[i].setBorderPainted(false);
			gradebtn[i].setContentAreaFilled(false);
			gradebtn[i].setFocusPainted(false);
			label.add(gradebtn[i]);
		}
		setBackbtn(backbtn);
		
	gradebtn[0].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	gradebtn[0].setVisible(false);
            setVisible(false);
            firstSubject fs = new firstSubject();
            fs.setVisible(true);
            
        }
    });
	gradebtn[1].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	gradebtn[1].setVisible(false);
            setVisible(false);
            secondSubject ss = new secondSubject();
            ss.setVisible(true);
        }
    });
	gradebtn[2].addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	gradebtn[2].setVisible(false);
            setVisible(false);
            thirdSubject ts = new thirdSubject();
            ts.setVisible(true);
        }
    });
	try {
		String driverName = "com.mysql.jdbc.Driver"; // 드라이버 이름 지정
		String DBName = "MirimGuideBook";
		String dbURL = "jdbc:mysql://localhost:3306/"+DBName; // URL 지정
		String SQL = "select name_sub from subject";
		//Class.forName(driverName); // 드라이버 로드
		
		Connection con  = DriverManager.getConnection(dbURL,"root","mirim546"); // 연결
		System.out.println("디비연결완료");
		Statement stmt = con.createStatement();
		
		stmt.execute("use "+DBName+";");
		ResultSet result = stmt.executeQuery(SQL);
		
		while(result.next()) {
			int i=0, j=1;
			sub[i]=result.getString(j++);
			System.out.println(sub[i++]+"얍");
		}
		
		//버튼에 값 넘기기
		for(int i=0; i<13; i++) {
			subjectBtn[i]=new JButton(sub[i]);
			subjectBtn[i].setBounds(60, 300+50*i, 100, 50);
			label.add(subjectBtn[i]);
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
                MirimSubject ms = new MirimSubject();
                ms.setVisible(true);
            }
        });


	
}
	public static void main(String[] args) {
	}

}
