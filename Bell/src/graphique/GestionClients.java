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
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Statement;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

import beans.User;
import beans.deleteClient;

public class GestionClients extends JFrame implements ActionListener {

	public GestionClients()throws ClassNotFoundException, SQLException{		

		this.setLayout(new BorderLayout());
		JTable table = User.selectAllClient();
		this.getContentPane().add(new JScrollPane(table),BorderLayout.CENTER);
		JPanel button=new JPanel();
		button.setLayout(new FlowLayout());
		JButton delete = new JButton("Supprimer");
		JButton add = new JButton("Ajouter");
		button.add(delete);
		button.add(add);
		this.getContentPane().add(button,BorderLayout.SOUTH);
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				User.deleteClient(table);
				dispose();
			}
		});
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AddClient ajout = new AddClient();
				ajout.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				ajout.setVisible(true);
				ajout.setSize(420, 400);
				ajout.setResizable(false);
				ajout.setLocationRelativeTo(null);
				dispose();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

