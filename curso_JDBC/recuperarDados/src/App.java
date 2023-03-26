import java.sql.Connection;
import java.sql.DriverManager;
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
    Connection connection=null;
    Statement stat =null;
    
    
    try  {
    
      
      stat =connection.createStatement();
      //instanciando um objeto do tipo statement
      System.out.println("funcionou!! a conecção");
      
      ResultSet rs = null;
      rs = stat.executeQuery("select * from department");
      //para percorrer os dados será utilizado a função next()
      while(rs.next()){
        System.out.println(rs.getInt("Id")+","+rs.getString("Name"));

      }
    } 
    catch (SQLException e) {
      // TODO: hanxception
      System.out.println(e.getErrorCode());
    }finally{
     
      stat.close();
      connection.close();
     
    }
  }
}
