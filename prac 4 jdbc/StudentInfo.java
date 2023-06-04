import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInfo {
	static final String DB_URL = "jdbc:mysql://localhost:3306/tsd";
	static final String USER = "root";
	static final String PASS = "root";
	public static void main(String[] args) throws SQLException {
		 
		 Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		 Statement stmt = conn.createStatement();
		 
		 String sql = "INSERT INTO new_table VALUES ( 1,'Zara', 'Khan', 'Lucknow')";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO new_table VALUES ( 2,'Tina','Khanna', 'Punjab')";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO new_table VALUES ( 3,'Mohan','Kumar', 'Delhi')";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO new_table VALUES(4,'Sumit','Swami', 'Banglore')";
         stmt.executeUpdate(sql);
         System.out.println("Inserted records into the table...");
		       
	      ResultSet rs = stmt.executeQuery("Select * from new_table");
	      while(rs.next()) {
	         System.out.println("RollNo: "+rs.getString("rollno")+", ");
	         System.out.println("FirstName: "+rs.getString("FirstName")+", ");
	         System.out.println("LastName: "+rs.getString("LastName")+", ");
	         System.out.println("Location: "+rs.getString("City"));
		 

	}

}
}
