package graphique;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
<<<<<<< HEAD

//import com.sun.javafx.font.Disposer;





=======
>>>>>>> dba9c4f66ba6e45988f45dc82c0636c8f75f6672
import beans.User;

public class Menu extends JPanel implements ActionListener {
	private Dimension buttonConnDim;

	public Menu(final JFrame frame){
		setLayout(null);		
		JButton onglet1 = new JButton("Gestion utilisateurs");
		JButton onglet2 = new JButton("Gestion clients");
		JButton onglet3 = new JButton("Gestion factures");
		JButton onglet4 = new JButton("Gestion contrats");
		JButton onglet5 = new JButton("D�connexion");
		onglet1.addActionListener( new ActionListener() {
             
            @Override
            public void actionPerformed(ActionEvent arg0) {
            	Frame GestionU = null;
				try {
					GestionU = new Frame("gestionU");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	GestionU.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            	GestionU.setVisible(true);
            	GestionU.setSize(730, 400);
            	GestionU.setLocationRelativeTo(null);
            }
        });
		
		onglet2.addActionListener( new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent arg0) {
            	Frame GestionC = null;
				try {
					GestionC = new Frame("gestionC");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	GestionC.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            	GestionC.setVisible(true);
            	GestionC.setSize(740, 400);
            	GestionC.setLocationRelativeTo(null);
            }
        });
		
		onglet3.addActionListener( new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent arg0) {
            	Frame Factures = null;
				try {
					Factures = new Frame("gestionF");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	Factures.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            	Factures.setVisible(true);
            	Factures.setSize(680, 400);
            	Factures.setLocationRelativeTo(null);
            }
        });
		
		onglet4.addActionListener( new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent arg0) {
            	Frame Contrats = null;
				try {
					Contrats = new Frame("gestionCo");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            	Contrats.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            	Contrats.setVisible(true);
            	Contrats.setSize(680, 400);
            	Contrats.setLocationRelativeTo(null);
            }
        });
		
		onglet5.addActionListener( new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent arg0) {
            	swing_sample sample = new swing_sample();
        		sample.setSize(250,125);
        		sample.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		sample.setVisible(true);
        		frame.dispose();
        		sample.setLocationRelativeTo(null);
            }
        });
		
		onglet1.setBackground(Color.gray);
		onglet1.setForeground(Color.white);
        add(onglet1);
        
        onglet2.setBackground(Color.gray);
		onglet2.setForeground(Color.white);
        add(onglet2);
        
        onglet3.setBackground(Color.gray);
		onglet3.setForeground(Color.white);
        add(onglet3);
        
        onglet4.setBackground(Color.gray);
		onglet4.setForeground(Color.white);
        add(onglet4);
        
        onglet5.setBackground(Color.red);
		onglet5.setForeground(Color.white);
        add(onglet5);
		
		buttonConnDim = onglet1.getPreferredSize();
		onglet1.setBounds(10, 10, 560, 45);
		
		buttonConnDim = onglet2.getPreferredSize();
		onglet2.setBounds(10, 65, 560, 45);
		
		buttonConnDim = onglet3.getPreferredSize();
		onglet3.setBounds(10, 120, 560, 45);
		
		buttonConnDim = onglet4.getPreferredSize();
		onglet4.setBounds(10, 175, 560, 45);
		
		buttonConnDim = onglet5.getPreferredSize();
		onglet5.setBounds(10, 230, 560, 45);
		
	}

	public void actionPerformed1(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
