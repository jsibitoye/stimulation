import static java.lang.Character.UnicodeBlock.forName;
import java.sql.*;
import javax.swing.JOptionPane;

public class dbconnection {
private String jdbcDriver = "com.mysql.jdbc.Driver",  
               dbName = "dlcf_db",
                dbAdress = "jdbc:mysql://localhost/",
                UserName= "root", 
                password="",
                sql, line;
private PreparedStatement ps ; 
private ResultSet rst;
private java.sql.Connection con;
private Statement st;
public static void main(String args[]){
    new dbconnection();
}
dbconnection()
    { 
  try {
      Class.forName(jdbcDriver);// register the database 
      //connecting to the address of the databases
      con=DriverManager.getConnection(dbAdress,UserName,password);
      // connect the sql statement to the adress
      st= con.createStatement();

      String sql= "show databases";
         rst = st.executeQuery(sql);
         while(rst.next()){
             System.out.println(rst.getString(1));
             if(rst.getString(1).equalsIgnoreCase("dlcf_db")){
                 JOptionPane.showMessageDialog(null, "Database"+dbName+"Found");
                 return;
             }
         }
    }catch(Exception ex )
        {
        }
    }
}
