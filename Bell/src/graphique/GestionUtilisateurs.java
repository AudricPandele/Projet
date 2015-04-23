package graphique;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import beans.User;

public class GestionUtilisateurs extends JPanel implements ActionListener {
	private Dimension buttonConnDim;

	public GestionUtilisateurs(){		
		setLayout(null);	
		JCheckBox onglet1 = new JCheckBox();
		JCheckBox onglet2 = new JCheckBox();
		JCheckBox onglet3 = new JCheckBox();
		JCheckBox onglet4 = new JCheckBox();
		JLabel flname =new JLabel("Nom - Prénom");
		JLabel member =new JLabel("Membre");
		JLabel employee =new JLabel("Employee");
		JLabel moderator =new JLabel("Moderateur");
		JLabel admin =new JLabel("Admin");
		JLabel name =new JLabel("Auguste Laulho");
		JButton submit = new JButton("Enregistrer");
		
        add(onglet1);
        add(onglet2);
        add(onglet3);
        add(onglet4);
        add(flname);
        add(member);
        add(employee);
        add(moderator);
        add(admin);
        add(name);
        add(submit);
        
		buttonConnDim = onglet1.getPreferredSize();
		onglet1.setBounds(200, 60, 20, 20);
		
		buttonConnDim = onglet2.getPreferredSize();
		onglet2.setBounds(300, 60, 20, 20);
		
		buttonConnDim = onglet3.getPreferredSize();
		onglet3.setBounds(400, 60, 20, 20);
		
		buttonConnDim = onglet4.getPreferredSize();
		onglet4.setBounds(500, 60, 20, 20);
		
		buttonConnDim = submit.getPreferredSize();
		submit.setBounds(600, 60, 100, 30);
		
		flname.setBounds(10,10,150,25);
		member.setBounds(200,10,150,25);
		employee.setBounds(300,10,150,25);
		moderator.setBounds(400,10,150,25);
		admin.setBounds(500,10,150,25);
		name.setBounds(10,60,150,25);
		
	}

	public void actionPerformed1(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

