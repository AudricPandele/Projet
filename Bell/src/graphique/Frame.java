package graphique;
import javax.swing.JFrame;

public class Frame extends JFrame {
	public Frame()
	{
		// titre + taille
		setTitle("Hello world !");
		setSize(400,350);
		
		// instanciation d'un objet MonPanel
		Panel panel = new Panel();
		this.add(panel);
	}
}
