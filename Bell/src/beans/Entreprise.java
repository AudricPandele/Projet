package beans;

public class Entreprise {

	private String nom;
	private String siret;
	private String addresse;
	private int telephone;
	
	
	//Constructeur
	public Entreprise(String nom, String siret, String addresse, int telephone) {
		this.nom = nom;
		this.siret = siret;
		this.addresse = addresse;
		this.telephone = telephone;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getSiret() {
		return siret;
	}


	public void setSiret(String siret) {
		this.siret = siret;
	}


	public String getAddresse() {
		return addresse;
	}


	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}


	public int getTelephone() {
		return telephone;
	}


	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	
	
	
	//TODO DeleteEntreprise(){ }
	
	
}
