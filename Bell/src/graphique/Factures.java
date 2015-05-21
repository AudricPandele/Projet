package graphique;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.mysql.jdbc.Statement;

import beans.Facture;
import beans.Payer;
import beans.User;

public class Factures extends JFrame implements ActionListener {
	
	public Factures() throws ClassNotFoundException, SQLException{
		
		this.setLayout(new BorderLayout());	
		JTable table = Facture.selectFacture();
		this.getContentPane().add(new JScrollPane(table),BorderLayout.CENTER);
		JPanel button=new JPanel();
		button.setLayout(new FlowLayout());
		JButton payer = new JButton("Payer");
		button.add(payer);
		this.getContentPane().add(button,BorderLayout.SOUTH);
		payer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Facture.payer(table);
				dispose();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

