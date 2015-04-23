package Connection;

import graphique.Frame;

import java.awt.*;

import javax.swing.*;

import Connection.swing_sample.handler;

import java.awt.event.*;

public class Inscription extends JFrame
{
    //declaring our swing components
	JLabel l_name,l_pass, l_prenom, l_age, l_login;
    JTextField t_name, t_prenom, t_age, t_login;
    JPasswordField t_pass;     //A special JTextField but hides input text
    JButton button;
    Container c;
 
    //a inner class to handling ActionEvents
    handler handle;
 
    //a separate class for processing database connection and authentication
    insert db;
 
    public Inscription()
    {
        super("Login form");
 
        c=getContentPane();
        c.setLayout(new FlowLayout());
 
        //extra classes
        db=new insert();
            handle =new handler();
 
                //swing components
            l_name=new JLabel("Nom");
            l_prenom=new JLabel("Prénom");
            l_age=new JLabel("Age");
            l_login=new JLabel("Login");
            l_pass=new JLabel("Mot de passe");
            t_name=new JTextField(10);
            t_prenom=new JTextField(10);
            t_age=new JTextField(10);
            t_login= new JTextField(10);
            t_pass=new JPasswordField(10);
            
            button=new JButton("S'inscrire");
 
        //adding actionlistener to the button
        button.addActionListener(handle);
 
        //add to contaienr
        c.add(l_name);
        c.add(t_name);
        c.add(l_prenom);
        c.add(t_prenom);
        c.add(l_age);
        c.add(t_age);
        c.add(l_login);
        c.add(t_login);
        c.add(l_pass);
        c.add(t_pass);
        c.add(button);
        
        //visual
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,130);
 
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
                }
                else
                {
                    //a pop-up box
                    JOptionPane.showMessageDialog(null, "Inscription failed!","Failed!!",
                                        JOptionPane.ERROR_MESSAGE);
                }
            }//if
        }//method
 
    }//Inner class
}//class