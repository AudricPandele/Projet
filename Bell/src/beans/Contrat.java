package beans;

import graphique.Conn;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.sql.Connection;

import com.mysql.jdbc.Statement;

public class Contrat {
	
	private int id;
	private String fournisseur;
	private String client;
	private String titre;
	private float prix;
	private Date date;
	
	public Contrat(int id, String fournisseur, String client, String titre,
					float prix, Date date) 
	{
		this.id = id;
		this.fournisseur = fournisseur;
		this.client = client;
		this.titre = titre;
		this.prix = prix;
		this.date = date;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	} 
	
	public static void main(String[] argv) throws SQLException, ClassNotFoundException {
		
		Conn conn = new Conn();
		Connection connection = conn.getConnect();

		Statement statement = (Statement) connection.createStatement();
		ResultSet resultat = statement.executeQuery( "SELECT *  FROM contrat;" );

		while ( resultat.next() ) {
		    String fournisseur = resultat.getString( "titre" );
		    System.out.println(fournisseur);

		}
	  }
}
