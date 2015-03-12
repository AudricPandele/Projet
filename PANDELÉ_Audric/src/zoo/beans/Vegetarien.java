package zoo.beans;

public class Vegetarien extends Animal {
	private double quantiteLegumes;

	public Vegetarien(String nom, int poids, double quantiteLegumes) {
		super(nom, poids);
		// TODO Auto-generated constructor stub
		this.setQuantiteLegumes(quantiteLegumes);
	}

	@Override
	public double mangeLegumes() {
		// TODO Auto-generated method stub
		return this.getQuantiteLegumes()*super.getPoids();
	}

	@Override
	public double mangeViande() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getQuantiteLegumes() {
		return quantiteLegumes;
	}

	public void setQuantiteLegumes(double quantiteLegumes) {
		this.quantiteLegumes = quantiteLegumes;
	}
	
	public String toString(){
		return super.toString()+" mange "+getQuantiteLegumes()+" kg de legumes";
	}

}
