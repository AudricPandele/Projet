package graphique;

import graphique.*;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class AddContrats extends JFrame
{
    //declaring our swing components
	JLabel l_titre ,l_fournisseur,l_client, l_tache, l_desc, l_prix, l_bonus;
    JTextField t_titre, t_tache, t_desc, t_prix, t_bonus;
    JCheckBox t_fournisseur,t_client;
    JButton button;
 
    //a inner class to handling ActionEvents
    //handler2 handle;
 
    //a separate class for processing database connection and authentication
    //insertContrat db;
 
    public AddContrats()
    {
        super("Ajouter un contrat");
 
 
        //extra classes
        //db=new insertContrat();
        //handle =new handler2();
 
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
            t_fournisseur = new JCheckBox();
            t_client = new JCheckBox();
            t_tache = new JTextField();
            t_desc = new JTextField();
            t_prix = new JTextField();
            t_bonus = new JTextField();            
            button = new JButton("Ajouter");
        
        //adding actionlistener to the button
       // button.addActionListener(handle);
 
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
        l_fournisseur.setBounds(10, 40, 100, 20);
        t_fournisseur.setBounds(110, 40, 20, 20);
        l_client.setBounds(170,40, 100, 20);
        t_client.setBounds(150, 40, 20, 20);
        l_tache.setBounds(10, 70, 100, 20);       
        t_tache.setBounds(110, 70, 200, 20);
        l_desc.setBounds(10, 100, 100, 20);
        t_desc.setBounds(110, 100, 200, 20);
        l_prix.setBounds(10, 130, 100, 20);       
        t_prix.setBounds(110, 130, 200, 20);
        l_bonus.setBounds(10, 160, 100, 20);       
        t_bonus.setBounds(110, 160, 200, 20);
        button.setBounds(200, 300, 100, 20);
      
        //visual
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
 
    }
 
    //an inner class .You can also write as a separate class
    /*class handler2 implements ActionListener
    {
        //must implement method
        //This is triggered whenever the user clicks the login button
        public void actionPerformed(ActionEvent ae)
        {
            //checks if the button clicked
            if(ae.getSource()==button)
            {                
            	int phone = Integer.parseInt(t_phone.getText());
            	
                System.out.println(t_sociale.getText()+" "+t_siret.getText()+" "+t_adresse.getText()+" "+phone);
 
                //The entered username and password are sent via "checkLogin()" which return boolean
                if(db.checkLogin(t_sociale.getText(), t_siret.getText(), t_adresse.getText(),phone))
                {
                    //a pop-up box
                    JOptionPane.showMessageDialog(null, "Client ajouté","Success",
                                        JOptionPane.INFORMATION_MESSAGE);
                    //Frame menu = new Frame("menu");
                    //menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            		//menu.setVisible(true);
            		//dispose();
                    dispose();
                }
                else
                {
                    //a pop-up box
                    JOptionPane.showMessageDialog(null, "Inscription failed!","Failed!!",
                                        JOptionPane.ERROR_MESSAGE);
                }
            }//if
            
            else
            {
            	//a pop-up box
                JOptionPane.showMessageDialog(null, "Inscription failed!","Failed!!",
                                    JOptionPane.ERROR_MESSAGE);
            }
        }//method
 
    }//Inner class*/
}//class