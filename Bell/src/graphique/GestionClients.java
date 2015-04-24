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

public class GestionClients extends JPanel implements ActionListener {
	private Dimension buttonConnDim;

	public GestionClients(){		
		setLayout(null);
		JCheckBox onglet1 = new JCheckBox();
		JLabel flname =new JLabel("Nom - Prénom");
		JLabel delete =new JLabel("Supprimer");
		JButton contrats = new JButton("Voir Contrat");
		JButton addClient = new JButton("Ajouter client");
		
        add(onglet1);
        add(flname);
        add(contrats);
        add(delete);
        add(addClient);
        
        buttonConnDim = onglet1.getPreferredSize();
        onglet1.setBounds(500, 60, 20, 20);
        buttonConnDim = contrats.getPreferredSize();
        contrats.setBounds(600, 60, 110, 20);
        buttonConnDim = flname.getPreferredSize();
		flname.setBounds(10,10,100,25);
		buttonConnDim = delete.getPreferredSize();
		delete.setBounds(500,10,110,25);
		addClient.setBounds(500,300,110,25);
		
		addClient.addActionListener( new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent arg0) {
            	AddClient addClient = new AddClient();
            	addClient.setVisible(true);
            	addClient.setSize(420, 400);
            	addClient.setResizable(false);
            	addClient.setLocationRelativeTo(null);
            }
        });
		
		contrats.addActionListener( new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent arg0) {
            	Frame contrats = new Frame("contrats");
            	contrats.setSize(420,400);
            	contrats.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            	contrats.setVisible(true);
            	contrats.setLocationRelativeTo(null);
            }
        });
		
		
		
		
		
	}

	public void actionPerformed1(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

