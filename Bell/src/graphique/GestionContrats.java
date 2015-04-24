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

public class GestionContrats extends JPanel implements ActionListener {
	private Dimension buttonConnDim;

	public GestionContrats(){		
		setLayout(null);
		JLabel contrat =new JLabel("Contrat");
		JLabel client =new JLabel("Client");
		JLabel prix =new JLabel("Prix");
		JButton details = new JButton("Détails");
		
        add(client);
        add(contrat);
        add(prix);
        add(details);
        
        buttonConnDim = contrat.getPreferredSize();
        contrat.setBounds(10, 10, 100, 20);
        buttonConnDim = client.getPreferredSize();
        client.setBounds(110, 10, 100, 20);
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

