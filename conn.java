
package airlinesreservationsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class conn {

    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project4","root","");//"jdbc:mysql://localhost:3306/Employee","root",""    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}     
   
    

               
    

