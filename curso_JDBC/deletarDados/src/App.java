import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import org.xml.sax.SAXNotSupportedException;

import db.DbIntegrityException;

public class App {

  public static void main(String[] args) throws Exception {
    String url = "jdbc:mysql://localhost:3306/coursejdbc";
    String user = "root";
    String password = "mysql";
    //criar DbIntegrityException
    //Tratar a exceção de integridade referencial
    //erro de integridade refencial é quando apresenta alguma ligação de chave estrangeira 
    
    PreparedStatement stat = null;
    Connection connection = null;

    try {
      connection = DriverManager.getConnection(url, user, password);

      System.out.println("funcionou!! a conecção");

     stat= connection.prepareStatement("DELETE FROM department "+
     "WHERE "+"Id= ?");
     stat.setInt(1, 2);

      int rowaAffected = stat.executeUpdate();

          System.out.println("Done! ID =" + rowaAffected);
       
      
    } catch (SQLException e) {
      // TODO: hanxception
     throw new DbIntegrityException(e.getMessage());
    } finally {
      stat.close();
    }
  }
}
