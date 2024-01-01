/*
 * JDBC 
1->REGISTER THE DRIVER
2->CREATE CONNCETIVITY
3->CRETE STATEMENT
4->EXECUTE QUERY
5->CLOSE COONECTION
 */
package bank.management;

import java.sql.*; 

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        
        try{   //mysql is an external entity so error may occur
            //Class.forName("com.mysql.cj.jdbc.Driver");  //1 in built 
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Syankita@22");  //2
            s=c.createStatement(); //3
        }catch(Exception e){
            System.out.println(e);
        }
    }
}