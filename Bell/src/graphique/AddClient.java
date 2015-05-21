package graphique;

import graphique.*;

import java.awt.*;

import javax.swing.*;

import beans.User;
import beans.insertClient;

import java.awt.event.*;
public class AddClient extends JFrame
{
    //declaring our swing components
	JLabel l_sociale ,l_siret, l_adresse, l_phone;
    JTextField t_sociale, t_siret, t_adresse, t_phone;
    JButton button;
 

 
    //a separate class for processing database connection and authentication 
    public AddClient()
    {
        super("Ajouter un client");
            setLayout(null);
                //swing components
            l_sociale = new JLabel("Raison Sociale");
            l_siret = new JLabel("SIRET");
            l_adresse = new JLabel("Adresse");
            l_phone = new JLabel("Téléphone");
            t_sociale = new JTextField();
            t_siret = new JTextField();
            t_adresse = new JTextField();
            t_phone = new JTextField();
            button = new JButton("Ajouter");
        
        //adding actionlistener to the button
            button.addActionListener(new ActionListener() {
            	@Override
    			public void actionPerformed(ActionEvent e) {
            		User.addClient(t_phone, t_sociale, t_adresse, t_siret);
            		dispose();
            	}
            });
 
        //add to contaienr
       
        add(l_sociale);
        add(l_siret);
        add(l_adresse);
        add(l_phone);
        add(t_sociale);
        add(t_siret);
        add(t_adresse);
        add(t_phone);
        add(button);
        
        l_sociale.setBounds(10, 10, 400, 20);
        t_sociale.setBounds(10, 40, 400, 20);
        l_siret.setBounds(10, 70, 400, 20);
        t_siret.setBounds(10, 100, 400, 20);
        l_adresse.setBounds(10, 130, 400, 20);
        t_adresse.setBounds(10, 160, 400, 20);
        l_phone.setBounds(10, 190, 400, 20);       
        t_phone.setBounds(10, 210, 400, 20);
        button.setBounds(100, 250, 200, 20);
      
        //visual
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 
    }
}//class