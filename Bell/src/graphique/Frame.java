package graphique;
import javax.swing.JFrame;

public class Frame extends JFrame  {
	
	public Frame(String frame){

		if(frame.equalsIgnoreCase("menu")){
			setTitle("Hello world !");
			setSize(600,330);
		
			// instanciation d'un objet MonPanel
			Menu panel = new Menu();
			this.add(panel);
		}
		
	}
	
}
