package zoo.launches;
import java.util.ArrayList;

import zoo.beans.*;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal lion = new Carnivore("Lion", 150, 30);
		Animal lapin = new Vegetarien("Lapin", 3, 3);
		Animal tortue = new Omnivore("Tortue", 5, 3, 5);
		
		ArrayList<Animal> ListeAnimal = new ArrayList<Animal>();
		ListeAnimal.add(lion);
		ListeAnimal.add(lapin);
		ListeAnimal.add(tortue);
		
		for (Animal animal: ListeAnimal) {
			System.out.println(animal);
		}
		double totalViande = lion.mangeViande()+tortue.mangeViande();
		double totalLegumes = lapin.mangeLegumes()+tortue.mangeLegumes();
		
		System.out.println("Il faut commander "+totalViande+" kg de viande et "+totalLegumes+" kg de legumes");
		
	}

}
