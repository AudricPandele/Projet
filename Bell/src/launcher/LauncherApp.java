package launcher;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

import com.sun.xml.internal.ws.api.server.Adapter.Toolkit;

import graphique.*;

public class LauncherApp {
	public static void main(String[] args) {
		
		// Premier Panel
		//JFrame frame = new JFrame("Hi");
        //frame.addWindowListener(new WindowAdapter() {
        //    public void windowClosing(WindowEvent e) {
        //    	System.exit(0);}
        //});

		// Onglets
        //frame.getContentPane().add(new JTabbed(), BorderLayout.CENTER);
        //frame.setSize(400, 125);
        //frame.setVisible(true);
        
        
	     // instanciation d'un objet MaFrame
	     //		Frame frame = new Frame();
	     //		// action a adopter quand on ferme la fenetre
	     //		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     //		frame.setVisible(true);
		
		// Login 
		swing_sample sample = new swing_sample();
		sample.setSize(250,125);
		sample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sample.setVisible(true);
		sample.setResizable(false);
		sample.setLocationRelativeTo(null);
	}
}
