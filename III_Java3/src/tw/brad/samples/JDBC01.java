package tw.brad.samples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBC01 {
	public static void main(String[] args) {
		try {
		    Class.forName("com.mysql.jdbc.Driver").newInstance();
		    Properties connectionProps = new Properties();
		    connectionProps.put("user", "root");
		    connectionProps.put("password", "root");
		    Connection conn = DriverManager.getConnection(
	                   "jdbc:mysql://127.0.0.1:3306/",
	                   connectionProps);
		    System.out.println("OK");
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
