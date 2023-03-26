import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import model.entities.Department;

public class App {

  public static void main(String[] args){
    Department obj = new Department(1, "Book");
    System.out.println(obj);
    /* String url = "jdbc:mysql://localhost:3306/coursejdbc";
    String user = "root";
    String password = "mysql"; */
    //Precisa ser atonica ou aoncetece td ou nda , consistente, isolada e durável
    //setAutoCommit(false)
    //commit()confirmar a transacao
    //rollback()desfazer oq já foi feito até o momento

    Statement stat = null;
    Connection connection = null;

    
}
}