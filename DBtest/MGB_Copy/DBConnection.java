package MGB_Copy;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DBConnection {
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public DBConnection() {
		try {
			Class.forName("comm.mysql.jdbc.Driver");
			con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tutorial","root","mirim546");
			st=(Statement) con.createStatement();
			
		}catch(Exception e) {
			System.out.println("�����ͺ��̽� �������: "+e.getMessage());
		}
	}
	public boolean isAdmin(String adminId, String adminPW) {
		try {
			String SQL="SELECT * FROM adminID = "+adminId+" and adminPW = "+adminPW;
			rs=st.executeQuery(SQL);
			if(rs.next()) {
				return true;
			}
		}catch(Exception e) {
			System.out.println("�����ͺ��̽� �˻�����: "+e.getMessage());
		}
		return false;
	}

}
