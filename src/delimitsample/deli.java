package delimitsample;
import java.sql.*;

public class deli {

	public static void main(String[] args) throws ClassNotFoundException {
		
		
//		select all table
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/delims?autoReconnect=true&useSSL=false",
//				"root", "Qwerty120995!");
//		CallableStatement statement = conn.prepareCall("{call get1information()}");
//		ResultSet rs = statement.executeQuery();
//		while(rs.next()) {
//			
//			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
//			
//		} 
		
		
//		update table with delimeter
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/delims?autoReconnect=true&useSSL=false",
				"root", "Qwerty120995!");
		CallableStatement statement = conn.prepareCall("{call getcount1()}");
		ResultSet rs = statement.executeQuery();
		while(rs.next()) {
			
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
		} 
//		
//		add table
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/delims?autoReconnect=true&useSSL=false",
//					"root", "Qwerty120995!");
//			
//			
//			CallableStatement statement = conn.prepareCall("{call InsertData(?,?)}");
//			statement.setString(1,"rico");
//			statement.setString(2,"makati");
//			statement.executeUpdate();
			
		
//		delete
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/delims?autoReconnect=true&useSSL=false","root", "Qwerty120995!");
//			CallableStatement statement = conn.prepareCall("{call getdelete1()}");
//			statement.execute();
//			
			
			
			
		
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
