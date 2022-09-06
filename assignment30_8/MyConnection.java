package assignment30_8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	
	public static Connection connect() throws SQLException, ClassNotFoundException {
		// we write a logic to connect to mysql database
				
		Connection connection=null;
		String url="jdbc:mysql://localhost:3306/jdbc_sameer";
		String username="root";
		String password="root";
		connection=DriverManager.getConnection(url,username,password);
		return connection;
	}
}
