package graphique;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import com.mysql.jdbc.Statement;

import beans.User;

public class GestionUtilisateurs extends JFrame implements ActionListener {
	private Dimension buttonConnDim;
	private ArrayList<String> tableaux = new ArrayList<String>();

	public GestionUtilisateurs() throws ClassNotFoundException, SQLException{	
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
		// Je stocke tous les noms et pr√©noms dans les arrayList
		
		Object data[][]= new String [size][6];
		int i =0;
		String toto = "toto";
		while (resultat.next()) {
			int j=0;
			while(j<6){
					data[i][j]=resultat.getString(j+1);
					j++;
			}
		}
		this.setLayout(new BorderLayout());		
		String title[] = {"ID", "Nom","PrÈnom","Age","Login"," "};		
		JTable table = new JTable(data,title);
		this.getContentPane().add(new JScrollPane(table),BorderLayout.CENTER);
		JPanel button=new JPanel();
		button.setLayout(new FlowLayout());
		JButton delete = new JButton("Supprimer");
		JButton add= new JButton("Ajouter");
		button.add(delete);
		button.add(add);
		this.getContentPane().add(button,BorderLayout.SOUTH);
	}

	public void actionPerformed1(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

