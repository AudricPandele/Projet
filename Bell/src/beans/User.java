package beans;

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
	
	
}
