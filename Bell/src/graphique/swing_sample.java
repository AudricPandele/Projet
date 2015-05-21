package graphique;

import java.awt.*;

import javax.swing.*;

import beans.User;
import beans.database;

import java.awt.event.*;
import java.sql.SQLException;
public class swing_sample extends JFrame
{
    //declaring our swing components
    JLabel l_name,l_pass;
    JTextField t_name;
    JPasswordField t_pass;     //A special JTextField but hides input text
    JButton button;
    JButton buttonins;
    Container c;
 
 
    //a separate class for processing database connection and authentication
    database db;
 
    public swing_sample()
    {
        super("Login form");
 
        c=getContentPane();
        c.setLayout(new FlowLayout());
 
        //extra classes
        db=new database(); 
                //swing components
        l_name=new JLabel("Username");
        l_pass=new JLabel("Password");
        t_name=new JTextField(10);
        t_pass=new JPasswordField(10);
        button=new JButton("Login");
        buttonins=new JButton("Inscription");
 
        //adding actionlistener to the button
        button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					User.connexion(t_name, t_pass);
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        		dispose();
			}
		});
 
        //add to contaienr
        c.add(l_name);
        c.add(t_name);
        c.add(l_pass);
        c.add(t_pass);
        c.add(button);
        c.add(buttonins);
        //visual
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,130);
        
        buttonins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Inscription insc = new Inscription();
        		insc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		insc.setVisible(true);
        		insc.setSize(420, 400);
        		insc.setResizable(false);
        		insc.setLocationRelativeTo(null);
        		dispose();
			}
		});
 
    }
}//class