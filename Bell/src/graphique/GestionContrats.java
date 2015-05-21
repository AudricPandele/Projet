package graphique;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import beans.Contrat;
import beans.Facture;
import beans.User;
import beans.deleteClient;
import beans.insertFacture;

public class GestionContrats extends JFrame implements ActionListener {

	public GestionContrats() throws ClassNotFoundException, SQLException{
		
		this.setLayout(new BorderLayout());	
		JTable table = Contrat.selectContrat();
		this.getContentPane().add(new JScrollPane(table),BorderLayout.CENTER);
		JPanel button=new JPanel();
		button.setLayout(new FlowLayout());
		JButton créer = new JButton("Créer");
		JButton addFacture = new JButton("Créer Facture");
		button.add(créer);
		button.add(addFacture);
		this.getContentPane().add(button,BorderLayout.SOUTH);
		créer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AddContrats addContrats = new AddContrats();
				addContrats.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				addContrats.setVisible(true);
				addContrats.setSize(400, 380);
				addContrats.setResizable(false);
				addContrats.setLocationRelativeTo(null);
				dispose();
			}
		});
		
		addFacture.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int[] selection=table.getSelectedRows();
				int size= table.getSelectedRowCount();
				int i =0;
				while(i<size)
				{
					Object fournisseur = table.getValueAt(selection[i], 6);
					Object client = table.getValueAt(selection[i], 7);					
					insertFacture db = new insertFacture();
					Facture.addFacture(fournisseur, client);
					i++;
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

