package graphique;
import javax.swing.JFrame;

public class Frame extends JFrame {
	public Frame()
	{
		// titre + taille
		setTitle("Hello world !");
		setSize(600,400);
		
		// instanciation d'un objet MonPanel
		Menu panel = new Menu();
		this.add(panel);
	}
}
