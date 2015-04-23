package graphique;
import java.sql.SQLException;

import javax.swing.JFrame;

public class Frame extends JFrame  {
	
	public Frame(String frame){

		if(frame.equalsIgnoreCase("menu")){
			setTitle("Hello world !");
			setSize(600,330);
			Menu menu = new Menu();
			this.add(menu);
		}
		else if (frame.equalsIgnoreCase("gestionU"))
		{
			setTitle("Hello world !");
			setSize(600,330);
			GestionUtilisateurs gestionU = new GestionUtilisateurs();
			this.add(gestionU);
			
		}
		
	}
	
	
}
