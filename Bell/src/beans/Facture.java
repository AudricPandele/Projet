package beans;

import graphique.Conn;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTable;

import com.mysql.jdbc.Statement;

public class Facture {
	
	public static void payer(JTable table){
		int[] selection=table.getSelectedRows();
		int selected = selection[0];
		Object value = table.getValueAt(selected, 0);
		String value2 = (String)value;
		int id = Integer.parseInt(value2);				
		for(int i=selection.length-1;i>=0;i--)
		{
			Payer db = new Payer();
			db.checkLogin(1,id);
		}
	}
	
	public static JTable selectFacture() throws SQLException, ClassNotFoundException{
		Conn conn = new Conn();
		Connection connection = conn.getConnect();

		Statement statement = (Statement) connection.createStatement();
		Statement statement2 = (Statement) connection.createStatement();
		ResultSet resultat = statement.executeQuery( "SELECT *  FROM facture;" );
		ResultSet count = statement2.executeQuery( "SELECT *  FROM facture;" );
		int size = 0;
		while (count.next()){
			size++;
		}
		// Je stocke tous les noms et pr√©noms dans les arrayList
		
		Object data[][]= new String [size][4];
		int i =0;
		while (resultat.next()) {
			int j=0;
			while(j<4){
				if(j==3){
					if(Integer.parseInt(resultat.getString(j+1))==0){
						data[i][j]="Non payÈ";
					}
					else{
						data[i][j]="PayÈ";
					}
					j++;
				}
				else{
					data[i][j]=resultat.getString(j+1);
					j++;
				}
			}
			i++;
		}	
		String title[] = {"ID", "Fournisseur","Client","Statut"};		
		JTable table = new JTable(data,title);
		return table;	
	}
	
	public static void addFacture(Object fournisseur,Object client){
		insertFacture db = new insertFacture();
		String fournisseur2 = (String)fournisseur;
		int fournisseurS =Integer.parseInt(fournisseur2);
		String client2 = (String) client;
		int clientS = Integer.parseInt(client2);
        java.util.Date date = new java.util.Date();        
        System.out.println(fournisseur2+" "+client2);

        //The entered username and password are sent via "checkLogin()" which return boolean
        if(db.checkLogin(fournisseurS, clientS));
        { 
            //a pop-up box
            JOptionPane.showMessageDialog(null, "Facture ajoutÈ","Success",
                                JOptionPane.INFORMATION_MESSAGE);
        }
	}
}
