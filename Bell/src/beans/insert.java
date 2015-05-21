package beans;

import java.sql.*;
public class insert 
{
    Connection con;
    PreparedStatement pst;
    int rs;
    public insert()
    {
        try{
             
            //MAKE SURE YOU KEEP THE mysql_connector.jar file in java/lib folder
            //ALSO SET THE CLASSPATH
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/bellino","projet", "");
            pst=con.prepareStatement("INSERT INTO user (nom, prenom, age, login, password) VALUES (?, ?, ?, ?, ?)");             
           }
        catch (Exception e) 
        {
            System.out.println(e);
        }
        System.out.println(pst);
    }
        //ip:username,password
        //return boolean
    public Boolean checkLogin(String uname, String pwd, String prnom, int age, String login)
    {
        try {                     
            pst.setString(1, uname); //this replaces the 1st  "?" in the query for username
            pst.setString(2, prnom);    //this replaces the 2st  "?" in the query for password
            pst.setInt(3, age); //this replaces the 1st  "?" in the query for username
            pst.setString(4, login);    //this replaces the 2st  "?" in the query for password
            pst.setString(5, pwd); //this replaces the 1st  "?" in the query for username
 
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