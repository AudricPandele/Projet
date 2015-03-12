package zoo.beans;

public class Omnivore extends Animal {
	private double quantiteLegumes;
	private double quantiteViande;

	public Omnivore(String nom, int poids, double quantiteLegumes, double quantiteViande) {
		super(nom, poids);
		this.quantiteLegumes = quantiteLegumes;
		this.quantiteViande = quantiteViande;
	}

	@Override
	public double mangeLegumes() {
		// TODO Auto-generated method stub
		return this.getQuantiteLegumes()*super.getPoids();
	}

	@Override
	public double mangeViande() {
		// TODO Auto-generated method stub
		return getQuantiteViande()*super.getPoids();
	}

	
	public double getQuantiteLegumes() {
		return quantiteLegumes;
	}

	public void setQuantiteLegumes(double quantiteLegumes) {
		this.quantiteLegumes = quantiteLegumes;
	}

	public double getQuantiteViande() {
		return quantiteViande;
	}

	public void setQuantiteViande(double quantiteViande) {
		this.quantiteViande = quantiteViande;
	}
	
	public String toString(){
		return super.toString()+" mange "+getQuantiteViande()+" kg de viande et "+getQuantiteLegumes()+" kg de légumes";
	}

}
