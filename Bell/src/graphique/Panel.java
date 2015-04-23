package graphique;

import graphique.JTabbed;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javafx.scene.layout.Border;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Panel extends JPanel implements ActionListener {
	private JTextField nom;
	private JTextField mdp;
	private Dimension sizeJlMdp;
	private Dimension sizeMdp;
	private Dimension buttonConnDim;

	public Panel(){
		setLayout(null);
		JLabel jlNomAnimal = new JLabel("Nom d'utilisateur :");
		add(jlNomAnimal);
		jlNomAnimal.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		Dimension sizeName = jlNomAnimal.getPreferredSize();
		jlNomAnimal.setBounds(10, 10, 120, sizeName.height);
		
		nom = new JTextField();
		javax.swing.border.Border notGood = BorderFactory.createLineBorder(Color.RED, 2);
		
		nom.setBorder(notGood);
		add(nom);
		
		Dimension sizeTextField = nom.getPreferredSize();
		nom.setBounds(150, 10, 200, sizeTextField.height);
		
		// deuxieme ligne : label + textfield
		JLabel jlmdp = new JLabel("Mot de passe :");
		add(jlmdp);
		
		sizeJlMdp = jlmdp.getPreferredSize();
		jlmdp.setBounds(10, 50, 120, sizeName.height);
		
		mdp = new JPasswordField();
		add(mdp);
		
		sizeMdp = mdp.getPreferredSize();
		mdp.setBounds(150, 50, 200, sizeTextField.height);
		
		JButton buttonConn = new JButton("Connection");
		buttonConn.addActionListener( new ActionListener() {
             
            @Override
            public void actionPerformed(ActionEvent arg0) {
                //this.setContentPane(JTabbed);
                //two.revalidate();
            }
        });
		buttonConn.setBackground(Color.red);
		buttonConn.setForeground(Color.white);
        add(buttonConn);
		
		buttonConnDim = buttonConn.getPreferredSize();
		buttonConn.setBounds(10, 200, 120, 45);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
