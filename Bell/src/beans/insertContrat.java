package beans;

import java.sql.*;
public class insertContrat 
{
    Connection con;
    PreparedStatement pst;
    int rs;
    public insertContrat()
    {
        try{
             
            //MAKE SURE YOU KEEP THE mysql_connector.jar file in java/lib folder
            //ALSO SET THE CLASSPATH
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/bellino","projet", "");
            pst=con.prepareStatement("INSERT INTO contrat (titre, fournisseur, client, tache, description, prix_global, date) VALUES (?, ?, ?, ?, ?, ?, ?)");             
           }
        catch (Exception e) 
        {
            System.out.println(e);
        }
        System.out.println(pst);
    }
        //ip:username,password
        //return boolean
    public Boolean checkLogin(String titre, int fournisseur, int client, int tache, String desc, float prix, String days)
    {
        try {                     
            pst.setString(1, titre); //this replaces the 1st  "?" in the query for username
            pst.setInt(2, fournisseur);    //this replaces the 2st  "?" in the query for password
            pst.setInt(3, client); //this replaces the 1st  "?" in the query for username
            pst.setInt(4, tache);    //this replaces the 2st  "?" in the query for password
            pst.setString(5, desc);    //this replaces the 2st  "?" in the query for password
            pst.setFloat(6, prix); //this replaces the 1st  "?" in the query for username
            pst.setString(7, days);    //this replaces the 2st  "?" in the query for password
 
            System.out.println("req = "+pst);
            //executes the prepared statement
            rs=pst.executeUpdate();
         
            if(rs == 1)
            {
                //TRUE if the query founds any corresponding data
                return true;
            }
            else
            {
                return false;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error while validating"+e);
            return false;
        }
    }
}