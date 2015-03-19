package beans;

public class Facture {
	
	private int id;
	private String fournisseur;
	private String client;
	private boolean estPaye;
	
	public Facture(int id, String fournisseur, String client, boolean estPaye) 
	{
		this.id = id;
		this.fournisseur = fournisseur;
		this.client = client;
		this.estPaye = estPaye;
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

	public boolean isEstPaye() {
		return estPaye;
	}

	public void setEstPaye(boolean estPaye) {
		this.estPaye = estPaye;
	}
	
	
	
	
}
