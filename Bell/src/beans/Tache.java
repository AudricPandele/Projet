package beans;

import graphique.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.mysql.jdbc.Statement;

public class Tache {
	
	private String nom;
	private float prixUnitaire;
	private int quantite;
	private float prixHT;
	
	//Constructeur
	public Tache(String nom, float prixUnitaire, int quantite, float prixHT) {
		this.nom = nom;
		this.prixUnitaire = prixUnitaire;
		this.quantite = quantite;
		this.prixHT = prixHT;
	}
	//GET - SET
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public float getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(float prixHT) {
		this.prixHT = prixHT;
	}
	
	public static ArrayList selectAllTacheNom() throws SQLException, ClassNotFoundException
	{
		ArrayList allTacheNom = new ArrayList();
		Conn conn = new Conn();
		Connection connection = conn.getConnect();

		Statement statement = (Statement) connection.createStatement();
		ResultSet resultat = statement.executeQuery( "SELECT *  FROM tache;" );

		while ( resultat.next() ) {
		    String nom = resultat.getString( "nom" );
		    allTacheNom.add(nom);
		    return allTacheNom;
		}
		return allTacheNom;
	}
	public static ArrayList selectAllTachePrix() throws SQLException, ClassNotFoundException
	{
		ArrayList allTachePrix = new ArrayList();
		Conn conn = new Conn();
		Connection connection = conn.getConnect();

		Statement statement = (Statement) connection.createStatement();
		ResultSet resultat = statement.executeQuery( "SELECT *  FROM tache;" );

		while ( resultat.next() ) {
		    float prix = resultat.getInt("prix");
		    allTachePrix.add(prix);
		    return allTachePrix;
		}
		return allTachePrix;
	}
	public static ArrayList selectAllTacheQuantite() throws SQLException, ClassNotFoundException
	{
		ArrayList allTacheQuantite = new ArrayList();
		Conn conn = new Conn();
		Connection connection = conn.getConnect();

		Statement statement = (Statement) connection.createStatement();
		ResultSet resultat = statement.executeQuery( "SELECT *  FROM tache;" );

		while ( resultat.next() ) {
		    int quantite = resultat.getInt("quantite");
		    allTacheQuantite.add(quantite);
		    return allTacheQuantite;
		}
		return allTacheQuantite;
	}
	public static ArrayList selectAllTachePrixHT() throws SQLException, ClassNotFoundException
	{
		ArrayList allTachePrixHT = new ArrayList();
		Conn conn = new Conn();
		Connection connection = conn.getConnect();

		Statement statement = (Statement) connection.createStatement();
		ResultSet resultat = statement.executeQuery( "SELECT *  FROM tache;" );

		while ( resultat.next() ) {
		    float prixHT = resultat.getInt("prixHT");
		    allTachePrixHT.add(prixHT);
		    return allTachePrixHT;
		}
		return allTachePrixHT;
	}
	public static ArrayList selectAllTache() throws SQLException, ClassNotFoundException
	{
		ArrayList allTache = new ArrayList();
		Conn conn = new Conn();
		Connection connection = conn.getConnect();

		Statement statement = (Statement) connection.createStatement();
		ResultSet resultat = statement.executeQuery( "SELECT *  FROM tache;" );

		while ( resultat.next() ) {
		    float prixHT = resultat.getInt("prixHT");
		    allTache.add(prixHT);
		    return allTache;
		}
		return allTache;
	}
	
	//TODO DeleteTache()
	//TODO CalculPrixHT()
	
}
