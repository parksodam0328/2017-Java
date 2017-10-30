package Location;

import java.awt.Image;
import java.awt.TextArea;
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
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Entrance.MirimEntrance;
import Main.SelectMenu;

public class OutLocation extends JFrame{
	private JLabel label;
	private JLabel label_img;
	private JButton[] locationbtn = new JButton[3];
	private String[] img = {"/location_1.png", "/location_2.png"};
	private Image[] btnimg = new Image[3];
	private JButton backbtn = new JButton("");
	private Image back_img = new ImageIcon(SelectMenu.class.getResource("/back_white.png")).getImage();
	private JLabel[] menuLabel=new JLabel[3];
	private JLabel[] dbShow=new JLabel[3];
	private Image intro_img;
	public OutLocation(){
		setTitle("�ܺ���ġ");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //â �߾ӿ� ����
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		label = new JLabel("");
		label_img = new JLabel("");
		label_img.setLocation(120, 150);
		label.setSize(1280,720);
		label_img.setSize(457,370);
		Image img = new ImageIcon(this.getClass().getResource("/Wallpaper.png")).getImage();
		contentPane.add(label_img);
		Image[] menuImg=new Image[3];
		for(int i=0; i<3; i++) {
			menuImg[i]= new ImageIcon(this.getClass().getResource("/outLocation_"+(i+1)+".png")).getImage();
			menuLabel[i]=new JLabel("");
			menuLabel[i].setBounds(640,150*(i+1),225,100);
			menuLabel[i].setIcon(new ImageIcon(menuImg[i]));
			contentPane.add(menuLabel[i]);
		}
		try {
			String driverName = "com.mysql.jdbc.Driver"; // ����̹� �̸� ����
			String DBName = "MirimGuideBook";
			String dbURL = "jdbc:mysql://10.96.122.177:3306/"+DBName+"?autoReconnect=true&useSSL=false"; // URL ����
			String SQL = "select address, subway, bus, image_location from location1;";
			Connection con = null;
			con = DriverManager.getConnection(dbURL,"root","mirim546");
			java.sql.Statement st = null;
			ResultSet result = null;
			st = con.createStatement();
			st.execute("use mirimguidebook;");
			result = st.executeQuery(SQL);
			
			//Class.forName(driverName); // ����̹� �ε�
			
			con  = DriverManager.getConnection(dbURL,"root","mirim546"); // ����
			System.out.println("��񿬰�Ϸ�");
			Statement stmt = con.createStatement();
			
			stmt.execute("use "+DBName+";");
			result = stmt.executeQuery(SQL);
			String str=null;
			int i=0; 
			while(result.next()) {
				str = result.getString("address");
				dbShow[i++]=new JLabel(str);
				str = result.getString("subway");
				dbShow[i++]=new JLabel(str);
				str = result.getString("bus");
				dbShow[i++]=new JLabel(str);
				str = result.getString("image_location");
				System.out.println(str);
				str="10.96.122.177/upload/location1/"+str;
				System.out.println(str);
				intro_img = new ImageIcon(this.getClass().getResource(str)).getImage();
			}
			result.close();
			stmt.close();
			con.close();
		}catch(SQLException sqle) {
			System.out.println("SQLException: "+sqle.getMessage());
			System.out.println("SQLState: "+sqle.getSQLState());
		}	
		for(int i=0; i<3; i++) {
			dbShow[i].setBounds(900,150*(i+1),225,100);
			contentPane.add(dbShow[i]);
		}
		contentPane.add(label);
		label.setIcon(new ImageIcon(img));
		label_img.setIcon(new ImageIcon(intro_img));
		
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
                MirimLocation ml = new MirimLocation();
                ml.setVisible(true);
            }
        });
	}
	
	public static void main(String[] args) {
		
	}

}
