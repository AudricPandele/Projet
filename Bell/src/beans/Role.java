package beans;

public class Role {
	private String nom;
	private String description;
	
	public Role(String nom, String description) {
		
		this.nom = nom;
		this.description = description;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

	
	
}
