package zoo.beans;

public abstract class Animal {
	private String nom;
	private int poids;

	public Animal(String nom, int poids) {
		this.nom = nom;
		this.poids = poids;
	}
	
	public abstract double mangeLegumes();
	
	public abstract double mangeViande();

	public String getNom() {
		return nom;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	
	public String toString(){
		return String.format(getClass().getSimpleName()+": "+getNom()+" ("+getPoids()+" kg )");
	}
	
	
}
