package Connection;
 
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
 
public class Connect {
 
  public static void main(String[] argv) throws SQLException {
 
	System.out.println("-------- MySQL JDBC Connection Testing ------------");
 
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}
 
	System.out.println("MySQL JDBC Driver Registered!");
	Connection connection = null;
 
	try {
		connection = DriverManager
		.getConnection("jdbc:mysql://localhost/bellino","projet", "");
 
	} catch (SQLException e) {
		System.out.println("Connection Failed! Check output console");
		e.printStackTrace();
		return;
	}
 
	if (connection != null) {
		System.out.println("You made it, take control your database now!");
	} else {
		System.out.println("Failed to make connection!");
	}
	
	Statement statement = (Statement) connection.createStatement();
	
	ResultSet resultat = statement.executeQuery( "SELECT fournisseur  FROM contrat;" );

	/* Récupération des données du résultat de la requête de lecture */
	while ( resultat.next() ) {
	    String fournisseur = resultat.getString( "fournisseur" );
	    System.out.println(fournisseur);


	    /* Traiter ici les valeurs récupérées. */
	}
  }
}