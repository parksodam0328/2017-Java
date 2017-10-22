package test;

import java.sql.*;
 
public class DBConnectionTest {
	public static void main(String[] args) {
		try {
			String driverName = "com.mysql.jdbc.Driver"; // ����̹� �̸� ����
			String DBName = "MirimGuideBook";
			String dbURL = "jdbc:mysql://localhost:3306/"+DBName; // URL ����
			String SQL = "select * from location_out;";
			//String SQL = "select * from student;";
			/* DB���� ������
			String sqlCT = "CREATE TABLE STUDENT (" + "id varchar(20) NOT NULL, " + "name varchar(20) NOT NULL, " +
						"snum int NOT NULL, " + "dept varchar(20) NOT NULL, " +"PRIMARY KEY(id) " +");";
			*/
			//String sqlCT="create";
			Class.forName(driverName); // ����̹� �ε�
			
			Connection con  = DriverManager.getConnection(dbURL,"root","mirim546"); // ����
			System.out.println("��񿬰�");
			Statement stmt = con.createStatement();
			
			//DB ����
			/*
			stmt.executeUpdate(sqlCT);
			System.out.println("Table Created");
			*/   
			//db �μ�Ʈ��
			/*
			stmt.executeUpdate("insert into STUDENT values('01','Noon',20100909,'Security');");
			stmt.executeUpdate("insert into STUDENT values('02','Bom',20100909,'IT');");
			stmt.executeUpdate("insert into STUDENT values('03','Rye',20100909,'Devel');");
			stmt.executeUpdate("insert into STUDENT values('04','Kim',20100909,'Random');");
			System.out.println("������ insert�Ϸ�");
            */
			
			stmt.executeQuery(SQL);
			ResultSet result = stmt.executeQuery(SQL);
			System.out.println(result.next());
			for(int i=2; i<=10; i++) {
				System.out.println(result.getString(i)+"\t");
			}
			/*while(result.next()) {
				System.out.print(result.getString(1)+"\t");
				System.out.print(result.getString(2)+"\t");
				System.out.print(result.getString(3)+"\t");      
				System.out.print(result.getString(4)+"\n");
				System.out.print("��¿Ϸ�");
            }*/
			result.close();
			stmt.close();
			con.close();
		}
		catch(Exception e){
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                }
        }
       
}