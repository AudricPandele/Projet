package graphique;

import graphique.*;

import java.awt.*;

import javax.swing.*;

import beans.Contrat;
import beans.Facture;
import beans.insertContrat;

import java.awt.event.*;
import java.sql.Date;
import java.util.Calendar;
public class AddContrats extends JFrame
{
    //declaring our swing components
	JLabel l_titre ,l_fournisseur,l_client, l_tache, l_desc, l_prix, l_bonus;
    JTextField t_titre, t_tache, t_desc, t_prix, t_bonus,t_fournisseur,t_client;
    JButton button;
 
    //a separate class for processing database connection and authentication
 
    public AddContrats()
    {
        super("Ajouter un contrat");
        
            setLayout(null);
                //swing components
            l_titre = new JLabel("Titre");
            l_fournisseur = new JLabel("Fourisseur");
            l_client = new JLabel("Client");
            l_tache = new JLabel("Tache");
            l_desc = new JLabel("Description");
            l_prix = new JLabel("Prix");
            l_bonus = new JLabel("Bonus / Malus");
            t_titre = new JTextField();
            t_fournisseur = new JTextField();
            t_client = new JTextField();
            t_tache = new JTextField();
            t_desc = new JTextField();
            t_prix = new JTextField();
            t_bonus = new JTextField();            
            button = new JButton("Ajouter");
        
        //adding actionlistener to the button
            button.addActionListener(new ActionListener() {
    			
    			@Override
    			public void actionPerformed(ActionEvent e) {
    				Contrat.addContrat(t_bonus, t_client, t_fournisseur, t_prix, t_tache, t_desc, t_titre);
    				dispose();
    			}
    		});
 
        //add to contaienr
       
        add(l_titre);
        add(l_fournisseur);
        add(l_client);
        add(l_tache);
        add(l_desc);
        add(l_prix);
        add(l_bonus);
        add(t_titre);
        add(t_fournisseur);
        add(t_client);
        add(t_tache);
        add(t_desc);
        add(t_prix);
        add(t_bonus);
        add(button);
        
        l_titre.setBounds(10, 10, 100, 20);
        t_titre.setBounds(110, 10, 200, 20);
        l_fournisseur.setBounds(10, 40, 80, 20);
        t_fournisseur.setBounds(80, 40, 100, 20);
        l_client.setBounds(220,40, 100, 20);
        t_client.setBounds(260, 40, 100, 20);
        l_tache.setBounds(10, 70, 100, 20);       
        t_tache.setBounds(110, 70, 200, 20);
        l_desc.setBounds(10, 100, 100, 20);
        t_desc.setBounds(110, 100, 200, 20);
        l_prix.setBounds(10, 130, 100, 20);       
        t_prix.setBounds(110, 130, 200, 20);
        l_bonus.setBounds(10, 160, 100, 20);       
        t_bonus.setBounds(110, 160, 200, 20);
        button.setBounds(150, 250, 100, 20);
      
        //visual
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}//class