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

import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
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
		
		// Je stocke tous les noms et prÃ©noms dans les arrayList
		while (resultat.next()) {
			
			noms.add(resultat.getString(2));
			prenoms.add(resultat.getString(3));
		}
		
		 //On crée nos différents conteneurs de couleur différente
	    JPanel cell1 = new JPanel();
	    cell1.setBackground(Color.YELLOW);
	    cell1.setPreferredSize(new Dimension(100, 20));		
	    JPanel cell2 = new JPanel();
	    cell2.setBackground(Color.red);
	    cell2.setPreferredSize(new Dimension(100, 20));
	    JPanel cell3 = new JPanel();
	    cell3.setBackground(Color.green);
	    cell3.setPreferredSize(new Dimension(100, 20));
	    JPanel cell4 = new JPanel();
	    cell4.setBackground(Color.black);
	    cell4.setPreferredSize(new Dimension(100, 20));
	    JPanel cell5 = new JPanel();
	    cell5.setBackground(Color.cyan);
	    cell5.setPreferredSize(new Dimension(100, 20));
	    JPanel cell6 = new JPanel();
	    cell6.setBackground(Color.BLUE);
	    cell6.setPreferredSize(new Dimension(500, 300));
			
	    //Le conteneur principal
	    //On définit le layout manager
	    setLayout(new GridBagLayout());
			
	    //L'objet servant à positionner les composants
	    GridBagConstraints gbc = new GridBagConstraints();
	    //Start
	    gbc.gridx=0;
	    gbc.gridy=0;
		gbc.gridheight = 1;
	    gbc.gridwidth = 1;
	    add(cell1,gbc);
	    //--
	    gbc.gridx=1;
	    add(cell2,gbc);
	    
	    gbc.gridx=2;
	    add(cell3,gbc);
	    
	    gbc.gridx=3;
	    add(cell4,gbc);
	    
	    gbc.gridx=4;
	    add(cell5,gbc);
	    		
		JLabel flname =new JLabel("Nom - Prénom");
		cell1.add(flname);
		JLabel member =new JLabel("Membre");
		cell2.add(member);
		JLabel employee =new JLabel("Employee");
		cell3.add(employee);
		JLabel moderator =new JLabel("Moderateur");
		cell4.add(moderator);
		JLabel admin =new JLabel("Admin");
		cell5.add(admin);
		int i=0;
		while(i<noms.size()){
			JPanel mini = new JPanel();
			mini.setPreferredSize(new Dimension(500, 300));	
			JLabel name =new JLabel(prenoms.get(i));
			mini.add(name);
			JButton submit = new JButton("Enregistrer");
			mini.add(name);
	        JRadioButton onglet1 = new JRadioButton();
	        JRadioButton onglet2 = new JRadioButton();
	        JRadioButton onglet3 = new JRadioButton();
	        JRadioButton onglet4 = new JRadioButton();
	        ButtonGroup bg = new ButtonGroup();
			bg.add(onglet1);
		    bg.add(onglet2);
		    bg.add(onglet3);
		    bg.add(onglet4);
		    onglet1.setSelected(true);
		    mini.add(onglet1);
		    mini.add(onglet2);
		    mini.add(onglet3);
		    mini.add(onglet4);
	        mini.add(submit);
		    i++;
		
		}
		// MAIS JE N'Y ARRIVE PAS (enculé)
        //add(submit);
       
		
		//buttonConnDim = submit.getPreferredSize();
		//submit.setBounds(600, 60, 100, 30);
		
		
		
	}

	public void actionPerformed1(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

