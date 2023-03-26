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
    //Precisa ser atonica ou aoncetece td ou nda , consistente, isolada e durável
    //setAutoCommit(false)
    //commit()confirmar a transacao
    //rollback()desfazer oq já foi feito até o momento

    Statement stat = null;
    Connection connection = null;

    try {
      connection = DriverManager.getConnection(url, user, password);

      //confirma as operações automaticamente
      //fica pedente de uma confirmação explicita do programador
      connection.setAutoCommit(false);

      System.out.println("funcionou!! a conecção");
      stat= connection.createStatement();

      int row1 = stat.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
      //encenando um exessão
      /* int x =1;
      if(x<2){
        throw new SQLException("Deu ruiim");
      } */
      int row2 = stat.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
      //confirmação da transação
      connection.commit();

      System.out.println("row1 ="+row1);
      System.out.println("row2 ="+row2);
    } catch (SQLException e) {
      
      try {
        // voltar no estado inicial do banco
        connection.rollback();
        throw new DbException("Transaction rolled back! Cause by:"+e.getMessage());
      } catch (Exception e1) {
        throw new DbException("Error trying to rollback:"+e1.getMessage());
      }
     
    } finally {
      stat.close();
    }
  }
}
