package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class User {
	private String nom;
	private String prenom;
	private int age;
	private String login;
	private String password;
	
	public User(String nom, String prenom, int age, String login, String password) 
	{
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.login = login;
		this.password = password;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public static ResultSet selectAll(){
		try{
            
            //MAKE SURE YOU KEEP THE mysql_connector.jar file in java/lib folder
            //ALSO SET THE CLASSPATH
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bellino","projet", "");
            PreparedStatement pst = con.prepareStatement("select * from user");
            ResultSet rs = pst.executeQuery();
            return rs;
             
           }
        catch (Exception e) 
        {
            System.out.println(e);
        }
		return null;
	}
	
	
}
