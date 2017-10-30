package Rule;

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
 
public class CostumeRule extends JFrame{
	private JLabel label;
	private JTextArea dbShow;
	int row;
	private String[] str; //���� ����
	private int[] num; //���� ��ȣ
	private JButton backbtn = new JButton("");
	private Image back_img = new ImageIcon(SelectMenu.class.getResource("/back_white.png")).getImage();
	public CostumeRule(){ 
		//mbutton.setVisible(false);
		setTitle("�б� �� ����");
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
		p.setBorder(new EmptyBorder(0, 0, 0, 0));
		p.setLayout(null);
		dbShow=new JTextArea();
	    JScrollPane scroll = new JScrollPane(dbShow);
	    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
	    scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    p.add(scroll);
		getContentPane().add(BorderLayout.CENTER,p);
		scroll.setBounds(136,60,980,600);
		//p.add(dbShow);
		getContentPane().add(p);
		setBackbtn(backbtn, p);
		dbShow.setBackground(Color.WHITE);
		dbShow.setEditable(false);
		try {
			String driverName = "com.mysql.jdbc.Driver"; // ����̹� �̸� ����
			String DBName = "MirimGuideBook";
			String dbURL = "jdbc:mysql://10.96.122.177:3306/"+DBName+"?autoReconnect=true&useSSL=false";
			String SQL = "select * from rule where division_number=2 order by number asc;";
			//Class.forName(driverName); // ����̹� �ε�
			
			Connection con  = DriverManager.getConnection(dbURL,"root","mirim546"); // ����
			System.out.println("��񿬰�Ϸ�");
			Statement stmt = con.createStatement();
			
			stmt.execute("use "+DBName+";");
			ResultSet result = stmt.executeQuery(SQL);
			java.sql.ResultSetMetaData rsmd = result.getMetaData();
			result.last();
			row = result.getRow();
			result.beforeFirst();
			str = new String[row];
			num = new int[row];
			int i=0;
			while(result.next()) {
				num[i] = result.getInt("number");
				str[i] = result.getString("content");
			//	dbShow.setContentAreaFilled(false);
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
				dbShow.append(num[j]+"��\n"+str[j]+"\n\n");
				dbShow.setFont(new Font("KoPub����ü Medium", Font.PLAIN,15));
			//	System.out.println(dbShow.getText());
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
                MirimRule mr = new MirimRule();
                mr.setVisible(true);
            }
        });
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}