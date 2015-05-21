package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class deleteUser { 
	Connection con;
	PreparedStatement pst;
	int rs;
	public deleteUser(){
		try{
         
        //MAKE SURE YOU KEEP THE mysql_connector.jar file in java/lib folder
        //ALSO SET THE CLASSPATH
        Class.forName("com.mysql.jdbc.Driver");
        
        con=DriverManager.getConnection("jdbc:mysql://localhost/bellino","projet", "");
        pst=con.prepareStatement("DELETE FROM user WHERE id = ?");             
       }
    catch (Exception e) 
    {
        System.out.println(e);
    }
    System.out.println(pst);
}
    //ip:username,password
    //return boolean
public Boolean checkLogin(int id)
{
    try {                     
        pst.setInt(1, id);//this replaces the 1st  "?" in the query for username

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
