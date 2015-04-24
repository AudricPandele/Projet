package graphique;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

import com.mysql.jdbc.Statement;

import beans.User;

public class GestionUtilisateurs extends JPanel implements ActionListener {
	private Dimension buttonConnDim;
	private ArrayList<String> noms = new ArrayList<String>();
	private ArrayList<String> prenoms = new ArrayList<String>();

	public GestionUtilisateurs() throws ClassNotFoundException, SQLException{	
		Conn conn = new Conn();
		Connection connection = conn.getConnect();

		Statement statement = (Statement) connection.createStatement();
		ResultSet resultat = statement.executeQuery( "SELECT *  FROM user;" );
		
		// Je stocke tous les noms et prénoms dans les arrayList
		while (resultat.next()) {
			
			noms.add(resultat.getString(2));
			prenoms.add(resultat.getString(3));
		} // IMPOSSIBLE D'UTILISER LES ELEMENT .GET  		
		
		setLayout(null);		
		JLabel flname =new JLabel("Nom - Pr�nom");
		JLabel member =new JLabel("Membre");
		JLabel employee =new JLabel("Employee");
		JLabel moderator =new JLabel("Moderateur");
		JLabel admin =new JLabel("Admin");
		int i=0;
		while(i<noms.size()){
			JLabel name =new JLabel(prenoms.get(i));
			JButton submit = new JButton("Enregistrer");
	        add(name);
	        add(submit);
	        name.setBounds(10,i*30+60,100,20);
	        submit.setBounds(600,i*30+60,100,20);
	        JCheckBox onglet1 = new JCheckBox();
			JCheckBox onglet2 = new JCheckBox();
			JCheckBox onglet3 = new JCheckBox();
			JCheckBox onglet4 = new JCheckBox();
			add(onglet1);
		    add(onglet2);
		    add(onglet3);
		    add(onglet4);

			buttonConnDim = onglet1.getPreferredSize();
			onglet1.setBounds(200, i*30+60, 20, 20);
			
			buttonConnDim = onglet2.getPreferredSize();
			onglet2.setBounds(300, i*30+60, 20, 20);
			
			buttonConnDim = onglet3.getPreferredSize();
			onglet3.setBounds(400, i*30+60, 20, 20);
			
			buttonConnDim = onglet4.getPreferredSize();
			onglet4.setBounds(500, i*30+60, 20, 20);
			i++;
		}
		// MAIS JE N'Y ARRIVE PAS (enculé)
		
       
        add(flname);
        add(member);
        add(employee);
        add(moderator);
        add(admin);
        //add(submit);
       
		
		//buttonConnDim = submit.getPreferredSize();
		//submit.setBounds(600, 60, 100, 30);
		
		flname.setBounds(10,10,150,25);
		member.setBounds(200,10,150,25);
		employee.setBounds(300,10,150,25);
		moderator.setBounds(400,10,150,25);
		admin.setBounds(500,10,150,25);
		
		
	}

	public void actionPerformed1(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

