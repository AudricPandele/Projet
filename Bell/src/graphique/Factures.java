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

public class Factures extends JPanel implements ActionListener {
	private Dimension buttonConnDim;

	public Factures(){		
		setLayout(null);
		JLabel facture =new JLabel("Facture");
		JLabel client =new JLabel("Client");
		JLabel contrat =new JLabel("Contrat");
		JLabel prix =new JLabel("Prix");
		JButton details = new JButton("Détails");
		
        add(facture);
        add(client);
        add(contrat);
        add(prix);
        add(details);
        
        buttonConnDim = facture.getPreferredSize();
        facture.setBounds(10, 10, 100, 20);
        buttonConnDim = client.getPreferredSize();
        client.setBounds(110, 10, 100, 20);
        buttonConnDim = contrat.getPreferredSize();
        contrat.setBounds(210,10,100,25);
		buttonConnDim = prix.getPreferredSize();
		prix.setBounds(500,10,50,25);
		details.setBounds(550,35,110,25);
		
		
		
	}

	public void actionPerformed1(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

