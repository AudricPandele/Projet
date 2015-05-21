package beans;

import graphique.Conn;
import graphique.swing_sample;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.sql.Connection;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.mysql.jdbc.Statement;

public class Contrat {
	
	public static JTable selectContrat() throws SQLException, ClassNotFoundException{
		Conn conn = new Conn();
		Connection connection = conn.getConnect();

		Statement statement = (Statement) connection.createStatement();
		Statement statement2 = (Statement) connection.createStatement();
		ResultSet resultat = statement.executeQuery( "SELECT *  FROM contrat ORDER BY client;" );
		ResultSet count = statement2.executeQuery( "SELECT *  FROM contrat ORDER BY client;" );
		int size = 0;
		while (count.next()){
			size++;
		}
		// Je stocke tous les noms et pr√©noms dans les arrayList
		
		Object data[][]= new String [size][8];
		int i =0;
		while (resultat.next()) {
			int j=0;
			while(j<8){
				data[i][j]=resultat.getString(j+1);
				j++;
			}
			i++;
		}	
		String title[] = {"ID", "Titre","T‚che","Description","Prix","Date","Fournisseur","Client"};		
		JTable table = new JTable(data,title);
		return table;	
	}
	
	public static void addContrat(JTextField t_bonus, JTextField t_client, JTextField t_fournisseur, JTextField t_prix, JTextField t_tache, JTextField t_desc, JTextField t_titre){
		insertContrat db = new insertContrat();
		int fournisseur = Integer.parseInt(t_fournisseur.getText());
    	int client = Integer.parseInt(t_client.getText());
    	int tache = Integer.parseInt(t_tache.getText());
    	float prix = Float.parseFloat(t_prix.getText());
    	float bonus = Float.parseFloat(t_bonus.getText());
    	prix = prix + bonus;
    	//date
    	java.text.SimpleDateFormat formater;
        String format = "dd-MM-yy";
		formater = new java.text.SimpleDateFormat( format  );
        java.util.Date date = new java.util.Date();                 
        String days="";// cette variable recevra la date entiËre
        days+=formater.format(date);
        
        System.out.println(t_titre.getText()+" "+fournisseur+" "+client+" "+tache+" "+t_desc.getText()+" "+prix+" "+days);

        //The entered username and password are sent via "checkLogin()" which return boolean
        if(db.checkLogin(t_titre.getText(), fournisseur, client, tache, t_desc.getText(), prix, days));
        { 
            //a pop-up box
            JOptionPane.showMessageDialog(null, "Contrat ajoutÈ","Success",
                                JOptionPane.INFORMATION_MESSAGE);
        }
	}
}
