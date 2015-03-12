package graphique.gui;
import javax.swing.JFrame;

public class ZooFrame extends JFrame {
	public ZooFrame()
	{
		// titre + taille
		setTitle("Mon zoo");
		setSize(400,350);
		
		// instanciation d'un objet MonPanel
		ZooPanel panel = new ZooPanel();
		this.add(panel);
	}
}
