package graphique;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Menu extends JPanel implements ActionListener {
	private Dimension buttonConnDim;

	public Menu(){
		setLayout(null);		
		JButton onglet1 = new JButton("Gestion utilisateurs");
		JButton onglet2 = new JButton("Gestion clients");
		JButton onglet3 = new JButton("Gestion factures");
		JButton onglet4 = new JButton("Gestion contrats");
		onglet1.addActionListener( new ActionListener() {
             
            @Override
            public void actionPerformed(ActionEvent arg0) {
                //this.setContentPane(JTabbed);
                //two.revalidate();
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
		
		buttonConnDim = onglet1.getPreferredSize();
		onglet1.setBounds(10, 10, 560, 45);
		
		buttonConnDim = onglet2.getPreferredSize();
		onglet2.setBounds(10, 65, 560, 45);
		
		buttonConnDim = onglet3.getPreferredSize();
		onglet3.setBounds(10, 120, 560, 45);
		
		buttonConnDim = onglet4.getPreferredSize();
		onglet4.setBounds(10, 175, 560, 45);
		
	}

	public void actionPerformed1(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

