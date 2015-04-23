package graphique;

import graphique.*;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class AddClient extends JFrame
{
    //declaring our swing components
	JLabel l_sociale ,l_siret, l_adresse, l_phone;
    JTextField t_sociale, t_siret, t_adresse, t_phone;
    JButton button;
 
    //a inner class to handling ActionEvents
    handler2 handle;
 
    //a separate class for processing database connection and authentication
    insertClient db;
 
    public AddClient()
    {
        super("Inscription");
 
 
        //extra classes
        db=new insertClient();
        handle =new handler2();
 
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
        button.addActionListener(handle);
 
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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    }
 
    //an inner class .You can also write as a separate class
    class handler2 implements ActionListener
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
 
    }//Inner class
}//class