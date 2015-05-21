package graphique;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import com.mysql.jdbc.Statement;

import beans.User;
import beans.deleteUser;

public class GestionUtilisateurs extends JFrame implements ActionListener {
	private ArrayList<String> tableaux = new ArrayList<String>();

	public GestionUtilisateurs() throws ClassNotFoundException, SQLException{	
		this.setLayout(new BorderLayout());
		JTable table = User.selectAll();
		this.getContentPane().add(new JScrollPane(table),BorderLayout.CENTER);
		JPanel button=new JPanel();
		button.setLayout(new FlowLayout());
		JButton delete = new JButton("Supprimer");
		button.add(delete);
		this.getContentPane().add(button,BorderLayout.SOUTH);
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				User.deleteUser(table);
				dispose();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}


