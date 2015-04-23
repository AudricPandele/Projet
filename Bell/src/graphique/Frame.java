package graphique;
import java.sql.SQLException;

import javax.swing.JFrame;

public class Frame extends JFrame  {
	
	public Frame(String frame){
		setResizable(false);
		setLocationRelativeTo(null);
		if(frame.equalsIgnoreCase("menu")){
			setTitle("LOGIGEST");
			setSize(600,330);
			Menu menu = new Menu(this);
			this.add(menu);
		}
		else if (frame.equalsIgnoreCase("gestionU"))
		{
			setTitle("Gestion Utilisateurs");
			GestionUtilisateurs gestionU = new GestionUtilisateurs();
			this.add(gestionU);
			
		}		
		else if (frame.equalsIgnoreCase("GestionC"))
		{
			setTitle("Gestion Clients");
			GestionClients gestionC = new GestionClients();
			this.add(gestionC);
		}
		
		else if (frame.equalsIgnoreCase("addClient"))
		{
			setTitle("Ajouter un client");
			AddClient addclient = new AddClient();
			this.add(addclient);
		}
		
		else if (frame.equalsIgnoreCase("GestionF"))
		{
			setTitle("Gestion Factures");
			Factures factures = new Factures();
			this.add(factures);
		}
		
	}
	
}
