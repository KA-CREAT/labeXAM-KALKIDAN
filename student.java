import java.sql.*;
public class student {
	public static void main(String[] args)throws SQLException {
		String jdbcURL = "jdbc:mysql://localhost:3306/hotel_managment";
		String username = "root";
		String pwd = "1234567890";
		Connection connection = DriverManager.getConnection(jdbcURL,
		username, pwd);
		Statement statement = connection.createStatement();
		String query = "Select * from teachers";
		String createTableSQL = "CREATE TABLE student (" +
		"id int auto_increment primary key," +
		"first_name varchar(255)," +
		"last_name varchar(255)," +
		"email varchar(255)," 
		;
		statement.executeUpdate(createTableSQL);
		System.out.println("Ttable ‘student’ created successfully.");

}
	}
