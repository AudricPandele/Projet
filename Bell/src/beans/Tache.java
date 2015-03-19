package beans;

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
	
	//TODO DeleteTache()
	//TODO CalculPrixHT()
	
}
