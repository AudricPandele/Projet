package beans;

import graphique.AddClient;
import graphique.Conn;
import graphique.Frame;
import graphique.swing_sample;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.mysql.jdbc.Statement;

public class User {
		
	public static JTable selectAll() throws ClassNotFoundException, SQLException{
		Conn conn = new Conn();
		Connection connection = conn.getConnect();

		Statement statement = (Statement) connection.createStatement();
		Statement statement2 = (Statement) connection.createStatement();
		ResultSet resultat = statement.executeQuery( "SELECT *  FROM user;" );
		ResultSet count = statement2.executeQuery( "SELECT *  FROM user;" );
		int size = 0;
		while (count.next()){
			size++;
		}
		// Je stocke tous les noms et prénoms dans les arrayList
		
		Object data[][]= new String [size][5];
		int i =0;
		while (resultat.next()) {
			int j=0;
			while(j<5){
					data[i][j]=resultat.getString(j+1);
					j++;
			}
			i++;
		}	
		String title[] = {"ID", "Nom","Pr�nom","Age","Login"};		
		JTable table = new JTable(data,title);
		return table;
	}
	
	public static void deleteUser(JTable table){
		int[] selection=table.getSelectedRows();
		int selected = selection[0];
		Object value = table.getValueAt(selected, 0);
		String value2 = (String)value;
		int id = Integer.parseInt(value2);
		for(int i=selection.length-1;i>=0;i--)
		{
			deleteUser db = new deleteUser();
			db.checkLogin(id);
		}
	}
	
	public static JTable selectAllClient() throws ClassNotFoundException, SQLException{
		Conn conn = new Conn();
		Connection connection = conn.getConnect();

		Statement statement = (Statement) connection.createStatement();
		Statement statement2 = (Statement) connection.createStatement();
		ResultSet resultat = statement.executeQuery( "SELECT *  FROM entreprise;" );
		ResultSet count = statement2.executeQuery( "SELECT *  FROM entreprise;" );
		int size = 0;
		while (count.next()){
			size++;
		}
		// Je stocke tous les noms et prénoms dans les arrayList
		
		Object data[][]= new String [size][5];
		int i =0;
		while (resultat.next()) {
			int j=0;
			while(j<5){
					data[i][j]=resultat.getString(j+1);
					j++;
			}
			i++;
		}	
		String title[] = {"ID", "Nom","SIRET","Adresse","Telephone"};		
		JTable table = new JTable(data,title);
		return table;
	}
	public static void deleteClient(JTable table){
		int[] selection=table.getSelectedRows();
		int selected = selection[0];
		Object value = table.getValueAt(selected, 0);
		String value2 = (String)value;
		int id = Integer.parseInt(value2);
		for(int i=selection.length-1;i>=0;i--)
		{
			deleteClient db = new deleteClient();
			db.checkLogin(id);
		}
	}
	public static void addClient(JTextField t_phone, JTextField t_sociale, JTextField t_adresse, JTextField t_siret){
        int phone = Integer.parseInt(t_phone.getText());
        insertClient db;
        db=new insertClient();        
        System.out.println(t_sociale.getText()+" "+t_siret.getText()+" "+t_adresse.getText()+" "+phone);
        if(db.checkLogin(t_sociale.getText(), t_siret.getText(), t_adresse.getText(),phone))
        {
                //a pop-up box
        	JOptionPane.showMessageDialog(null, "Client ajout�","Success",
            JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
                //a pop-up box
            JOptionPane.showMessageDialog(null, "Inscription failed!","Failed!!",
            JOptionPane.ERROR_MESSAGE);
        }
	}
	public static void inscription(JPasswordField t_pass, JTextField t_age, JTextField t_login, JTextField t_name, JTextField t_prenom){
		 insert db = new insert();
		// Récupère mdp
        char[] temp_pwd=t_pass.getPassword();
        String pwd=null;
        pwd=String.copyValueOf(temp_pwd);
        
        // Récupère age
        int age = Integer.parseInt(t_age.getText());
        
        System.out.println(age+" "+t_name.getText()+" "+pwd+" "+t_prenom.getText()+" "+t_login.getText());

        //The entered username and password are sent via "checkLogin()" which return boolean
        if(db.checkLogin(t_name.getText(), pwd, t_prenom.getText(), age, t_login.getText()))
        {
            //a pop-up box
            JOptionPane.showMessageDialog(null, "You have logged in successfully","Success",
                                JOptionPane.INFORMATION_MESSAGE);
            swing_sample sample = new swing_sample();
        }
        else
        {
            //a pop-up box
            JOptionPane.showMessageDialog(null, "Inscription failed!","Failed!!",
                                JOptionPane.ERROR_MESSAGE);
        }
	}
	public static void connexion(JTextField t_name, JPasswordField t_pass) throws ClassNotFoundException, SQLException{
		database db=new database();
		char[] temp_pwd=t_pass.getPassword();
        String pwd=null;
        pwd=String.copyValueOf(temp_pwd);
        System.out.println("Username,Pwd:"+t_name.getText()+","+pwd);

        //The entered username and password are sent via "checkLogin()" which return boolean
        if(db.checkLogin(t_name.getText(), pwd))
        {
        	Frame menu = new Frame("menu");
	        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	menu.setVisible(true);
	    	menu.setLocationRelativeTo(null);
        }
        else
        {
            //a pop-up box
            JOptionPane.showMessageDialog(null, "Login failed!","Failed!!",
            JOptionPane.ERROR_MESSAGE);
        }
	}
}	

