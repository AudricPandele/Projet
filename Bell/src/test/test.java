package test;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.*;

public class test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		ArrayList<String> liste = new ArrayList<String>();
		liste = Tache.selectAllTacheNom();
		for (String element : liste)
		{
			System.out.println(element);
		}
		
		ArrayList<Float> liste2 = new ArrayList<Float>();
		liste2 = Tache.selectAllTachePrix();
		for (float element2 : liste2)
		{
			System.out.println(element2);
		}
	}

}
