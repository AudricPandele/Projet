package graphique.gui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import zoo.beans.Animal;
import zoo.beans.Carnivore;
import zoo.beans.Omnivore;
import zoo.beans.Vegetarien;

public class ZooPanel extends JPanel implements ActionListener{
	private JButton jbQuit;
	private JButton jbAjVege;
	private JButton jbAjCar;
	private JButton jbAjOmn;
	private JButton jbCommande;
	private JTextField nomAnimal;
	private JTextField poids;
	private JTextField qtLeg;
	private JTextField qtVia;
	private ArrayList<Animal> monZoo = new ArrayList<Animal>();
	private Dimension sizeNameP;
	private Dimension sizeTextFieldP;
	private Dimension sizeNameQL;
	private Dimension sizeTextFieldQL;
	private Dimension sizeNameQV;
	private Dimension sizeTextFieldQV;
	private Dimension buttonVege;
	private Dimension buttonCar;
	private Dimension buttonOm;
	private Dimension buttonCom;
	private Dimension buttonQu;


	public ZooPanel()
	{
		// disposition du layout
		setLayout(null);
		JLabel jlNomAnimal = new JLabel("Nom de l'animal :");
		add(jlNomAnimal);
		
		Dimension sizeName = jlNomAnimal.getPreferredSize();
		jlNomAnimal.setBounds(10, 10, 120, sizeName.height);
		
		nomAnimal = new JTextField();
		add(nomAnimal);
		
		Dimension sizeTextField = nomAnimal.getPreferredSize();
		nomAnimal.setBounds(150, 10, 200, sizeTextField.height);
		
		// deuxieme ligne : label + textfield
		JLabel jlPoids = new JLabel("Poids :");
		add(jlPoids);
		
		sizeNameP = jlPoids.getPreferredSize();
		jlPoids.setBounds(10, 50, 120, sizeName.height);
		
		poids = new JTextField();
		add(poids);
		
		sizeTextFieldP = poids.getPreferredSize();
		poids.setBounds(150, 50, 200, sizeTextField.height);
		
		// troisieme ligne : label + textfield
		JLabel jlViande = new JLabel("Quantité légumes :");
		add(jlViande);
		
		sizeNameQL = jlViande.getPreferredSize();
		jlViande.setBounds(10, 90, 120, sizeName.height);
		
		qtLeg = new JTextField();
		add(qtLeg);
		
		sizeTextFieldQL = qtLeg.getPreferredSize();
		qtLeg.setBounds(150, 90, 200, sizeTextField.height);
		
		// quatrieme ligne : label + textfield
		JLabel jlLegumes = new JLabel("Quantité viande :");
		add(jlLegumes);
		
		sizeNameQV = jlLegumes.getPreferredSize();
		jlLegumes.setBounds(10, 130, 120, sizeName.height);
		
		qtVia = new JTextField();
		add(qtVia);
		
		sizeTextFieldQV = qtVia.getPreferredSize();
		qtVia.setBounds(150, 130, 200, sizeTextField.height);
		
		// Boutons 
		jbAjVege = new JButton("Ajouter végétarien");
		jbAjVege.addActionListener(this);
		add(jbAjVege);
		
		buttonVege = jbAjVege.getPreferredSize();
		jbAjVege.setBounds(10, 200, 120, sizeName.height);
		
		jbAjCar = new JButton("Ajouter Carnivore");
		jbAjCar.addActionListener(this);
		add(jbAjCar);
		
		buttonCar = jbAjCar.getPreferredSize();
		jbAjCar.setBounds(140, 200, 120, sizeName.height);
		
		jbAjOmn = new JButton("Ajouter omnivore");
		jbAjOmn.addActionListener(this);
		add(jbAjOmn);
		
		buttonOm = jbAjOmn.getPreferredSize();
		jbAjOmn.setBounds(270, 200, 120, sizeName.height);
		
		jbCommande = new JButton("Commandes");
		jbCommande.addActionListener(this);
		add(jbCommande);
		
		buttonCom = jbCommande.getPreferredSize();
		jbCommande.setBounds(10, 250, 120, sizeName.height);
		
		jbQuit = new JButton("Quitter");
		jbQuit.addActionListener(this);
		add(jbQuit);	
		
		buttonQu = jbQuit.getPreferredSize();
		jbQuit.setBounds(270, 250, 120, sizeName.height);
	}

	public void remiseAZero(){
		nomAnimal.setText("");
		poids.setText("");
		qtLeg.setText("");
		qtVia.setText("");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbQuit)
		{
			System.exit(0);
		}
		try {
			if(e.getSource()==jbCommande){
				double totalViande = 0;
				double totalLegumes = 0;
				
				for (Animal animal: monZoo) {
					totalViande += animal.mangeViande();
					totalLegumes += animal.mangeLegumes();
				}
				JOptionPane.showMessageDialog(null, "Il faut commander "+totalViande+" kg de viande et "+totalLegumes+" kg de legumes");
			}
			else if(e.getSource()==jbAjVege){
				
				Animal vege = new Vegetarien(nomAnimal.getText(), Integer.parseInt(poids.getText()), Integer.parseInt(qtLeg.getText()));
				monZoo.add(vege);
				remiseAZero();
				JOptionPane.showMessageDialog(null, "vegetarien ajouté");
			}
			else if(e.getSource()==jbAjCar){
				Animal car = new Carnivore(nomAnimal.getText(), Integer.parseInt(poids.getText()), Integer.parseInt(qtVia.getText()));
				monZoo.add(car);
				remiseAZero();
				JOptionPane.showMessageDialog(null, "Carnivore ajouté");
			}
			else if(e.getSource()==jbAjOmn){
				Animal omn = new Omnivore(nomAnimal.getText(), Integer.parseInt(poids.getText()), Integer.parseInt(qtLeg.getText()), Integer.parseInt(qtVia.getText()));
				monZoo.add(omn);
				remiseAZero();
				JOptionPane.showMessageDialog(null, "Omnivore ajouté");
			}
			
		} catch (Exception e2) {
			// TODO: handle exception
		}

		
	}
}
