package graphique;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
public class swing_sample extends JFrame
{
    //declaring our swing components
    JLabel l_name,l_pass;
    JTextField t_name;
    JPasswordField t_pass;     //A special JTextField but hides input text
    JButton button;
    JButton buttonins;
    Container c;
 
    //a inner class to handling ActionEvents
    handler handle;
 
    //a separate class for processing database connection and authentication
    database db;
 
    public swing_sample()
    {
        super("Login form");
 
        c=getContentPane();
        c.setLayout(new FlowLayout());
 
        //extra classes
        db=new database();
            handle =new handler();
 
                //swing components
        l_name=new JLabel("Username");
        l_pass=new JLabel("Password");
        t_name=new JTextField(10);
        t_pass=new JPasswordField(10);
        button=new JButton("Login");
        buttonins=new JButton("Inscription");
 
        //adding actionlistener to the button
        button.addActionListener(handle);
 
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
                char[] temp_pwd=t_pass.getPassword();
                String pwd=null;
                pwd=String.copyValueOf(temp_pwd);
                System.out.println("Username,Pwd:"+t_name.getText()+","+pwd);
 
                //The entered username and password are sent via "checkLogin()" which return boolean
                if(db.checkLogin(t_name.getText(), pwd))
                {
                    
                    Frame menu = new Frame("menu");
                    menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            		menu.setVisible(true);
            		menu.setLocationRelativeTo(null);
            		dispose();
                }
                else
                {
                    //a pop-up box
                    JOptionPane.showMessageDialog(null, "Login failed!","Failed!!",
                                        JOptionPane.ERROR_MESSAGE);
                }
            }//if
        }//method
 
    }//inner class
}//class