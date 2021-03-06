package Employment;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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

public class ConditionEmployment extends JFrame implements ActionListener{
	private int id=0;
	public static int key[];
	private JButton backbtn = new JButton("");
	private Image back_img = new ImageIcon(SelectMenu.class.getResource("/back_white.png")).getImage();
	private String SQL=null;
	private JButton employBtn[];
	private JLabel EmployLabel=new JLabel("");
	private String[] str;
	int i=0;
	int row;
	public ConditionEmployment(){
		setTitle("취업현황");
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
		p.setBorder(new EmptyBorder(0, 0, 0, 0));
		p.setLayout(null);
		getContentPane().add(p);

		setBackbtn(backbtn, p);
		try {
			String DBName = "MirimGuideBook";
			String dbURL = "jdbc:mysql://localhost:3306/"+DBName+"?autoReconnect=true&useSSL=false"; // URL 지정
			SQL = "select * from employment1 order by year asc;";

			Connection con  = DriverManager.getConnection(dbURL,"root","mirim546"); // 연결
			System.out.println("디비연결완료");
			Statement stmt = con.createStatement();
			
			stmt.execute("use "+DBName+";");
			ResultSet result = stmt.executeQuery(SQL);
			java.sql.ResultSetMetaData rsmd = result.getMetaData();
			result.last();
			row = result.getRow();
			result.beforeFirst();
			str = new String[row]; // 레코드 수
			employBtn = new JButton[row];
			key = new int[row];
			int i=0;
			
			// 디비의 값들 불러오기
			while(result.next()) {
				id=result.getInt("id");
				str[i] = result.getString("year");
				employBtn[i]=new JButton(str[i]);
				employBtn[i].setFont(new Font("KoPub돋움체 Medium", Font.PLAIN,25));
				employBtn[i].setBackground(new Color(166,165,160));
				employBtn[i].addActionListener(this);
				EmployLabel.add(employBtn[i]);
				key[i]=id;
				i++;
			}
			
			result.close();
			stmt.close();
			con.close();
			
		}catch(SQLException sqle) {
			System.out.println("SQLException: "+sqle.getMessage());
			System.out.println("SQLState: "+sqle.getSQLState());
		}
		EmployLabel.setBounds(360,200,600,300);
		EmployLabel.setLayout(new GridLayout(2,3)); //버튼들 그리드로 레이아웃
		p.add(EmployLabel); 
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
                MirimEmployment mc = new MirimEmployment ();
                mc.setVisible(true);
            }
        });
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//각 버튼마다 이벤트
	@Override
	public void actionPerformed(ActionEvent e) { 
		for(int j=0;j<row;j++)
			if(e.getSource()==employBtn[j]){
			IntroEmployment ic = new IntroEmployment(key[j], str[j]);
			System.out.println(str[j]);
			  ic.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			  ic.setTitle(employBtn[j].getText());
			  ic.addWindowListener(new WindowAdapter() {
				  public void windowClosing(WindowEvent e) {
					  ic.setVisible(false);
					  ic.dispose();	
				  }
			  });
			  
		 }
		}
}