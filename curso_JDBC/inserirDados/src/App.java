import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class App {

  public static void main(String[] args) throws Exception {
    String url = "jdbc:mysql://localhost:3306/coursejdbc";
    String user = "root";
    String password = "mysql";
    //inserir dados
    //API PreparedStatement
    //Statement.RETURN_GENERATES_KEYS
    //GetGeneratedKyes
    //inserir com recuperação de ID
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    PreparedStatement stat = null;
    Connection connection = null;

    try {
      connection = DriverManager.getConnection(url, user, password);

      System.out.println("funcionou!! a conecção");

      /*  stat =
        connection.prepareStatement(
          "INSERT INTO seller" +
          "(Name, Email, BirthDate, BaseSalary, DepartmentId) " +
          "VALUES " + 
          "(?, ?, ?, ?, ?)",Statement.RETURN_GENERATED_KEYS
        );

     stat.setString(1, "Carl Purple");
     stat.setString(2, "carl@mgail.com");
     stat.setDate(3, new java.sql.Date(sdf.parse("22/04/1985").getTime()));
     stat.setDouble(4, 3000.0);
     stat.setInt(5, 4); */
      //------ex iserir mais de um id----
      stat =
        connection.prepareStatement(
          "INSERT INTO department (name) values ('D1'),('D2')",Statement.RETURN_GENERATED_KEYS
        );

      int rowaAffected = stat.executeUpdate();

      if (rowaAffected > 0) {
        //retorna um obejto do tipo resultset
        ResultSet rs = stat.getGeneratedKeys();
        //percorrer o Result set
        while (rs.next()) {
          int id = rs.getInt(1);
          System.out.println("Done! ID =" + id);
        }
        System.out.println();
      } else {
        System.out.println("No rown afected!");
      }
    } catch (SQLException e) {
      // TODO: hanxception
      System.out.println(e.getSuppressed());
    } finally {
      stat.close();
    }
  }
}
