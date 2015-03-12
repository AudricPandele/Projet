package zoo.beans;

public class Carnivore extends Animal{
	private double quantiteViande;

	public Carnivore(String nom, int poids, double quantiteViande) {
		super(nom, poids);
		this.setQuantiteViande(quantiteViande);
	}

	@Override
	public double mangeLegumes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double mangeViande() {
		// TODO Auto-generated method stub
		return getQuantiteViande()*super.getPoids();
	}

	public double getQuantiteViande() {
		return quantiteViande;
	}

	public void setQuantiteViande(double quantiteViande) {
		this.quantiteViande = quantiteViande;
	}
	
	public String toString(){
		return super.toString()+" mange "+getQuantiteViande()+" kg de viande";
	}
	

}
