package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcURl = "jdbc:mysql://localhost:3306/caso1?useSSL=false";
		String user = "root";
		String pass = "123456";
		
		try {
			System.out.println("Connecting to db: " + jdbcURl);
			
			Connection myConn = DriverManager.getConnection(jdbcURl, user, pass);
			
			System.out.println("Connection succesful");
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
