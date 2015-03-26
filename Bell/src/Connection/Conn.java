package Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conn {
	private Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/bellino","projet", "");

	public Conn() throws ClassNotFoundException, SQLException {
		//Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/bellino","projet", "");
		
	}
	
	public Connection getConnect() {
		return connect;
	}
}
