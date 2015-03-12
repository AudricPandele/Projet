package launcher.gui;
import graphique.gui.ZooFrame;

import javax.swing.JFrame;

public class TestZooGraphique {
	public static void main(String[] args) {
		// instanciation d'un objet MaFrame
		ZooFrame frame = new ZooFrame();
		// action a adopter quand on ferme la fenetre
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
