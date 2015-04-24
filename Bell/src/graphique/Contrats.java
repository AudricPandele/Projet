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

public class Contrats extends JPanel implements ActionListener {
	private Dimension buttonConnDim;

	public Contrats(){		
		setLayout(null);
		JLabel contrat =new JLabel("Contrat");
		JLabel prix =new JLabel("Prix");
		JLabel add =new JLabel("Ajouter Facture");
		JCheckBox check = new JCheckBox();
		JButton submit = new JButton("Creer Facture");
		JButton addC = new JButton("Ajouter Contrat");
		
        add(check);
        add(contrat);
        add(prix);
        add(add);
        add(addC);
        add(submit);
        
        
        buttonConnDim = contrat.getPreferredSize();
        contrat.setBounds(10, 10, 100, 20);
        add.setBounds(180, 10, 150, 20);
		buttonConnDim = prix.getPreferredSize();
		prix.setBounds(310,10,50,25);
		buttonConnDim = check.getPreferredSize();
        check.setBounds(210, 30, 20, 20);
        addC.setBounds(10, 340, 150, 20);
        submit.setBounds(250, 340, 150, 20);
        
        addC.addActionListener( new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent arg0) {
            	AddContrats addC = new AddContrats();
            	addC.setVisible(true);
            	addC.setSize(420, 400);
            	addC.setResizable(false);
            	addC.setLocationRelativeTo(null);
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

