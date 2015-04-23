package graphique;

import java.sql.*;
public class insertClient 
{
    Connection con;
    PreparedStatement pst;
    int rs;
    public insertClient()
    {
        try{
             
            //MAKE SURE YOU KEEP THE mysql_connector.jar file in java/lib folder
            //ALSO SET THE CLASSPATH
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/bellino","projet", "");
            pst=con.prepareStatement("INSERT INTO entreprise (nom, siret, adresse, telephone) VALUES (?, ?, ?, ?)");             
           }
        catch (Exception e) 
        {
            System.out.println(e);
        }
        System.out.println(pst);
    }
        //ip:username,password
        //return boolean
    public Boolean checkLogin(String nom, String siret, String adresse, int telephone)
    {
        try {                     
            pst.setString(1, nom); //this replaces the 1st  "?" in the query for username
            pst.setString(2, siret);    //this replaces the 2st  "?" in the query for password
            pst.setString(3, adresse); //this replaces the 1st  "?" in the query for username
            pst.setInt(4, telephone);    //this replaces the 2st  "?" in the query for password
 
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