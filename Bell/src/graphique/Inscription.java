package graphique;

import graphique.swing_sample.handler;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class Inscription extends JFrame
{
    //declaring our swing components
	JLabel l_name,l_pass, l_prenom, l_age, l_login;
    JTextField t_name, t_prenom, t_age, t_login;
    JPasswordField t_pass;     //A special JTextField but hides input text
    JButton button;
 
    //a inner class to handling ActionEvents
    handler handle;
 
    //a separate class for processing database connection and authentication
    insert db;
 
    public Inscription()
    {
        super("Inscription");
 
 
        //extra classes
        db=new insert();
            handle =new handler();
 
            setLayout(null);
                //swing components
            l_name=new JLabel("Nom");
            l_prenom=new JLabel("Pr�nom");
            l_age=new JLabel("Age");
            l_login=new JLabel("Login");
            l_pass=new JLabel("Mot de passe");
            t_name=new JTextField(10);
            t_prenom=new JTextField(10);
            t_age=new JTextField(10);
            t_login= new JTextField(10);
            t_pass=new JPasswordField(10);
            
            button=new JButton("S'inscrire");
           JButton button2=new JButton("Connexion");
           
           button2.addActionListener( new ActionListener() {
               
               @Override
               public void actionPerformed(ActionEvent arg0) {
            	    swing_sample sample = new swing_sample();
           			sample.setSize(250,125);
           			sample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           			sample.setVisible(true);
           			sample.setResizable(false);
           			sample.setLocationRelativeTo(null);
           			dispose();
               }
           });
 
       
        
        l_name.setBounds(10, 10, 380, 20);
        t_name.setBounds(10, 40, 380, 20);
        l_prenom.setBounds(10, 70, 380, 20);
        t_prenom.setBounds(10, 100, 380, 20);
        l_age.setBounds(10, 130, 380, 20);
        t_age.setBounds(10, 160, 380, 20);
        l_login.setBounds(10, 190, 380, 20);
        t_login.setBounds(10, 220, 380, 20);
        l_pass.setBounds(10, 250, 380, 20);
        t_pass.setBounds(10, 280, 380, 20);
        button.setBounds(50, 310, 100, 20);
        button2.setBounds(250, 310, 100, 20);
        
        //adding actionlistener to the button
        button.addActionListener(handle);
 
        //add to contaienr
        add(l_name);
        add(t_name);
        add(l_prenom);
        add(t_prenom);
        add(l_age);
        add(t_age);
        add(l_login);
        add(t_login);
        add(l_pass);
        add(t_pass);
        add(button);
        add(button2);
        //visual
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    }
 
    //an inner class .You can also write as a separate class
    class handler implements ActionListener
    {
        //must implement method
        //This is triggered whenever the user clicks the login button
        public void actionPerformed(ActionEvent ae)
        {
            //checks if the button clicked
            if(ae.getSource()==button)
            {
            	// Récupère mdp
                char[] temp_pwd=t_pass.getPassword();
                String pwd=null;
                pwd=String.copyValueOf(temp_pwd);
                
                // Récupère age
                int age = Integer.parseInt(t_age.getText());
                
                System.out.println(age+" "+t_name.getText()+" "+pwd+" "+t_prenom.getText()+" "+t_login.getText());
 
                //The entered username and password are sent via "checkLogin()" which return boolean
                if(db.checkLogin(t_name.getText(), pwd, t_prenom.getText(), age, t_login.getText()))
                {
                    //a pop-up box
                    JOptionPane.showMessageDialog(null, "You have logged in successfully","Success",
                                        JOptionPane.INFORMATION_MESSAGE);
                    //Frame menu = new Frame("menu");
                    //menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            		//menu.setVisible(true);
            		//dispose();
                    swing_sample sample = new swing_sample();
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