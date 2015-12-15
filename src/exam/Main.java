package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		/*
		 * ElectronicProduct[] ep= new ElectronicProduct[4]; ep[0]=new
		 * ElectronicProduct("ASUS", "678", 700.0); ep[1]=new
		 * ElectronicProduct("DELL", "668", 300.0); ep[2]=new
		 * ElectronicProduct("DELL", "668", 300.0); ep[3]=new
		 * ElectronicProduct("DELL", "668", 800.0); double maxPrice=0.0;
		 * for(ElectronicProduct e:ep) { if(maxPrice<e.getPrice()) {
		 * maxPrice=e.getPrice(); }
		 * 
		 * } System.out.println(maxPrice); Service s1= new Service("Lenevo",
		 * "666", 12, 65); Service s2= new Service("Lenevo", "666", 12, 65);
		 * System.out.println(s1.equals(s2)); double a=7.8;
		 * System.out.println(Double.hashCode(a));
		 */

		String driver = "com.mysql.jdbc.Driver";
		String connection = "jdbc:mysql://localhost:3306/translator";
		String user = "root";
		String password = "";
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(connection, user, password);
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM tbl_english WHERE Word= ?";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setString(1, "Bad");
			ResultSet rs = preparedStmt.executeQuery();
			while(rs.next())
			{
		System.out.println(rs.getString("Word"));
			}	//System.out.println(rs.getString("ID"));
			rs.getRow();
			

			/*while (rs.next()) {
				int id = rs.getInt("ID");
				String someValue = rs.getString("Word");
				System.out.println(id + "");
				System.out.println(someValue);
			}*/

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

/*
 * String query = " insert into tbl_english (Word)" + " values (?)";
 * 
 * PreparedStatement preparedStmt = con.prepareStatement(query);
 * preparedStmt.setString(1, "Bad");
 * 
 * preparedStmt.execute();
 */
