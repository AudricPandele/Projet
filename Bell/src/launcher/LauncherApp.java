package launcher;
import java.sql.SQLException;
import javax.swing.JFrame;
import beans.*;
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import graphique.*;
import Connection.*;

public class LauncherApp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// instanciation d'un objet MaFrame
		Frame frame = new Frame();
		// action a adopter quand on ferme la fenetre
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
