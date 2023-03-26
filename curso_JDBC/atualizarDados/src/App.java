import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

  public static void main(String[] args) throws Exception {
    String url = "jdbc:mysql://localhost:3306/coursejdbc";
    String user = "root";
    String password = "mysql";
    //Statement serve para montar o comando sql para ser executado
    //ResultSet vai representar o objeto tendo o resultado como forma de tabela
    //esses recursos nao são controlados pela jvm do java necesssário fechar para evitar algum tipo de vazamento de memória
    Connection connection = null;
    PreparedStatement stat = null;

    try {
      connection = DriverManager.getConnection(url, user, password);
      System.out.println("funcionou!! a conecção");

      stat =
        connection.prepareStatement(
          "UPDATE seller " +
          "SET BaseSalary = BaseSalary + ?" +
          "WHERE " +
          "(DepartmentId) = ?"
        );
      stat.setDouble(1, 200.0);
      //de quem eu vou mudar
      stat.setInt(2, 2);

      int rowsAffected = stat.executeUpdate();

      System.out.println("Done! Rows affected " + rowsAffected);
    } catch (SQLException e) {
      // TODO: hanxception
      System.out.println(e.getErrorCode());
    } finally {
      stat.close();
      connection.close();
      stat.close();
    }
  }
}
