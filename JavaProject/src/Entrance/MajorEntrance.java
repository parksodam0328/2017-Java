package Entrance;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

import Main.SelectMenu;

public class MajorEntrance extends JFrame{
	private JTextArea dbShow;

	private JLabel []dbIntro;
	private JButton backbtn = new JButton("");
	private Image back_img = new ImageIcon(SelectMenu.class.getResource("/back_white.png")).getImage();
	private JButton entrancebtn[]=new JButton[3];
	private String[] entranceImg = {"/experience_1.png", "/experience_2.png","/experience_3.png"};
	private Image[] btnimg = new Image[3];
	String major[] = new String[] { "���ͷ�Ƽ��̵��","���̵�������","���̵��ַ��"};
	private String image_name[];
	int row;
	private String[] sub;
	private String[] sub2;
	private JLabel entranceLabel=new JLabel("");
	int grade_num; // �а� �����ϴ� ����
	public MajorEntrance(int grade_num) {
		this.grade_num = grade_num;
		setTitle("���� - �а� �Ұ�");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //â �߾ӿ� ����
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		JPanel p = new JPanel() { // �ǳ��� ����̹��� ����
			public void paintComponent(Graphics g) {
			    g.drawImage(img, 0, 0, null);
			     Dimension d = getSize();
			    g.drawImage(img, 0, 0, d.width, d.height, null);
			    setOpaque(false);
			    super.paintComponent(g);
			}
		};
		for(int i=0;i<3;i++) {
			entrancebtn[i] = new JButton("");
			btnimg[i] = new ImageIcon(this.getClass().getResource(entranceImg[i])).getImage();
		}
		p.setBorder(new EmptyBorder(0, 0, 0, 0));
		p.setLayout(null);
		dbShow=new JTextArea();
	    JScrollPane scroll = new JScrollPane(dbShow); //�ؽ�Ʈ���� ��ũ�Ѻ��̱�, �ʿ�� ��ũ�ѹ� ���̵���
	    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
	    scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    p.add(scroll);
		getContentPane().add(BorderLayout.CENTER,p);
		scroll.setBounds(650,200,500,481);
		getContentPane().add(p);
		entrancebtn[0].setBounds(250, 70, 214, 93);
		entrancebtn[1].setBounds(550, 70, 214, 93);
		entrancebtn[2].setBounds(850, 70, 214, 93);
		for(int i=0;i<3;i++) {
			entrancebtn[i].setIcon(new ImageIcon(btnimg[i]));
			entrancebtn[i].setBorderPainted(false);
			entrancebtn[i].setContentAreaFilled(false);
			entrancebtn[i].setFocusPainted(false);
			p.add(entrancebtn[i]);
		}
		entrancebtn[0].addActionListener(new ActionListener() {// �ι�
	        public void actionPerformed(ActionEvent e) {
	        	entrancebtn[0].setVisible(false);
	            setVisible(false);
	            MajorEntrance fs = new MajorEntrance(0);
	            fs.setVisible(true);
	            
	        }
	    });
		entrancebtn[1].addActionListener(new ActionListener() { //����
	        public void actionPerformed(ActionEvent e) {
	        	entrancebtn[1].setVisible(false);
	            setVisible(false);
	            MajorEntrance fs = new MajorEntrance(1);
	            fs.setVisible(true);
	        }
	    });
		entrancebtn[2].addActionListener(new ActionListener() { //����
	        public void actionPerformed(ActionEvent e) {
	        	entrancebtn[2].setVisible(false);
	            setVisible(false);
	            MajorEntrance fs = new MajorEntrance(2);
	            fs.setVisible(true);
	        }
	    });
		setBackbtn(backbtn, p);
		dbShow.setBackground(Color.WHITE);
		dbShow.setEditable(false);
		dbShow.setLineWrap(true);
		
		try {
			String DBName = "MirimGuideBook";
			String dbURL = "jdbc:mysql://localhost:3306/"+DBName+"?autoReconnect=true&useSSL=false"; // URL ����
			String SQL = "select major, major_intro, imgae_location from entrance1 where major='"+major[grade_num]+"';";

			Connection con  = DriverManager.getConnection(dbURL,"root","mirim546"); // ����
			System.out.println("��񿬰�Ϸ�");
			Statement stmt = con.createStatement();
			
			stmt.execute("use "+DBName+";");
			ResultSet result = stmt.executeQuery(SQL);
			//String all="";
			java.sql.ResultSetMetaData rsmd = result.getMetaData();
			result.last();
			row = result.getRow();
			result.beforeFirst();
			sub = new String[row];
			sub2 = new String[row];
			image_name = new String[row];
			dbIntro = new JLabel[row];

			int i=0;
			while(result.next()) {
				sub[i]=result.getString("major");
				sub2[i]=result.getString("major_intro");
				image_name[i]=result.getString("imgae_location");
				
				entrancebtn[i] = new JButton(sub[i]);
				entrancebtn[i].setBounds(60, 75*(3+i), 200, 50);
				entrancebtn[i].setFont(new Font("KoPub����ü Medium", Font.PLAIN,30));
				//majorbtn[i].addActionListener(this);
				entranceLabel.add(entrancebtn[i]);
			i++;
			}   
			result.close();
			stmt.close();
			con.close();
			
		}catch(SQLException sqle) {
			System.out.println("SQLException: "+sqle.getMessage());
			System.out.println("SQLState: "+sqle.getSQLState());
		}
		for(int j=0;j<row;j++){
			dbShow.append("\n\n�а� : "+sub[j]+"\n\n�а� �Ұ� : "+sub2[j]+"\n");
			dbShow.setFont(new Font("KoPub����ü Medium", Font.PLAIN,15));
			Image image = new ImageIcon(this.getClass().getResource("/"+image_name[j])).getImage();
			dbIntro[j]=new JLabel(sub[j]);
			dbIntro[j].setIcon(new ImageIcon(image));
			dbIntro[j].setBounds(70, 200*(j+1), 500, 481);
			p.add(dbIntro[j]);
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