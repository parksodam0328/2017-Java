package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysql {
	public static void main(String[] args) {
        Connection connection = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:�ּ�:��Ʈ/DB��" , "username", "password");
            st = connection.createStatement();
 
            String sql;
            sql = "select * FROM table;";
 
            ResultSet rs = st.executeQuery(sql);
 
            while (rs.next()) {
                String sqlRecipeProcess = rs.getString("column��");
            }
 
            rs.close();
            st.close();
            connection.close();
        } catch (SQLException se1) {
            se1.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (st != null)
                    st.close();
            } catch (SQLException se2) {
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }    
    }

}