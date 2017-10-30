package Entrance;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
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

public class MajorEntrance extends JFrame{
	private JLabel dbShow;
	private JButton backbtn = new JButton("");
	private Image back_img = new ImageIcon(SelectMenu.class.getResource("/back_white.png")).getImage();
	private JButton majorbtn[]=new JButton[3];
	private String[] majorImg = {"/experience_1.png", "/experience_2.png","/experience_3.png"};
	private Image[] btnimg = new Image[3];
	public MajorEntrance(){
		//mbutton.setVisible(false);
		setTitle("���� - �а� �Ұ�");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //â �߾ӿ� ����
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		JPanel p = new JPanel() {
			public void paintComponent(Graphics g) {
			    g.drawImage(img, 0, 0, null);
			    // Approach 2: Scale image to size of component
			     Dimension d = getSize();
			    g.drawImage(img, 0, 0, d.width, d.height, null);
			    // Approach 3: Fix the image position in the scroll pane
			    // Point p = scrollPane.getViewport().getViewPosition();
			    // g.drawImage(icon.getImage(), p.x, p.y, null);
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
		dbShow=new JLabel("");
	    JScrollPane scroll = new JScrollPane(dbShow);
	    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
	    scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    p.add(scroll);
		getContentPane().add(BorderLayout.CENTER,p);
		scroll.setBounds(650,210,500,450);
		//p.add(dbShow);
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
		dbShow.setBackground(Color.BLUE);
		majorbtn[0].addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	//db�������ٲٱ�
	            
	        }
	    });
		majorbtn[1].addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	//db�������ٲٱ�
	        }
	    });
		majorbtn[2].addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	//db�������ٲٱ�
	        }
	    });
		
		try {
			String driverName = "com.mysql.jdbc.Driver"; // ����̹� �̸� ����
			String DBName = "MirimGuideBook";
			String dbURL = "jdbc:mysql://10.96.122.177:3306/"+DBName+"?autoReconnect=true&useSSL=false"; // URL ����
			String SQL = "select * from entrance1 where major='"+major[]+"';";
			//Class.forName(driverName); // ����̹� �ε�

			Connection con  = DriverManager.getConnection(dbURL,"root","mirim546"); // ����
			System.out.println("��񿬰�Ϸ�");
			Statement stmt = con.createStatement();
			
			stmt.execute("use "+DBName+";");
			ResultSet result = stmt.executeQuery(SQL);
			//String all="";
			String[] str=new String[96];
			
			int i=0;
			while(result.next()) {
				str[i] = result.getString("major");
				System.out.println(str[i]);
				//dbShow.setText(str[i]);
				str[i] = result.getString("major_intro");
			//	dbShow.setText(str[i]);
			//	all+=str[i]+"\t";
			//	dbShow.setText(all);
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
                MirimEntrance me = new MirimEntrance();
                me.setVisible(true);
            }
        });
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}