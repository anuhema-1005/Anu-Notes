// You are using Java
import java.sql.*;
import java.util.*;

 class Main{
	public static void main(String args[]) throws Exception{
		String url="jdbc:mysql://localhost/ri_db";
		String username ="test";
		String password ="test123";
		
		String query = "select lower(Department_Name) from department";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement st = con.prepareStatement(query);
		
		ResultSet rs =  st.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getString(1));
		}
	}
}