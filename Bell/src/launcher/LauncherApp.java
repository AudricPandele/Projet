package launcher;
import javax.swing.JFrame;

import graphique.*;

public class LauncherApp {
	public static void main(String[] args) {
		// instanciation d'un objet MaFrame
		Frame frame = new Frame();
		// action a adopter quand on ferme la fenetre
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
