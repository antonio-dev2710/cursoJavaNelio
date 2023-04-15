import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class App {

  public static void main(String[] args) {
    //DESSA FORMA O PROGRAMA NÃO A IMPLEMENTAÇÃO APENAS A INTERFACE
    //é uma forma de fzr uma injeção de depedencia sem explicitar a implementação
    SellerDao sellerDao = DaoFactory.creatSellerDao();
    System.out.println("===Test 1 findById====");
    Seller seeSeller = sellerDao.findById(2);

    System.out.println(seeSeller);
    System.out.println("\n===Test 2 findByDepartment====");
    Department dep = new Department(2, null);
    List<Seller> list = sellerDao.findByDepatment(dep);
    for (Seller obj : list) {
      System.out.println(obj);
    }
    System.out.println("\n===Test 3 findByDepartment====");

    list = sellerDao.findAll();
    for (Seller obj : list) {
      System.out.println(obj);
    }

    System.out.println("\n===Test 4 insert====");
    Seller objSeller = new Seller(
      null,
      "Greg",
      "greg@gmail.com",
      new Date(),
      4000.0,
      dep
    );

    sellerDao.insert(objSeller);

    System.out.println("Inserted New id =" + objSeller.getId());
  }
}
