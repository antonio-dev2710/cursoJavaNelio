package model.dao.impl;

import db.DB;
import db.DbException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao {

  //coneccao com o banco
  String url = "jdbc:mysql://localhost:3306/coursejdbc";
  String user = "root";
  String password = "mysql";
  //Statement serve para montar o comando sql para ser executado
  //ResultSet vai representar o objeto tendo o resultado como forma de tabela
  //esses recursos nao são controlados pela jvm do java necesssário fechar para evitar algum tipo de vazamento de memória
  Connection connection = null;

  public SellerDaoJDBC() {
    try {
      connection = DriverManager.getConnection(url, user, password);
      this.connection = connection;
      System.out.println("funcionou!! a conecção");
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  @Override
  public void insert(Seller obj) {
    PreparedStatement st = null;
    ResultSet rs = null;
    try {
      st =
      connection.prepareStatement(
      "INSERT INTO seller " +
      "(Name, Email, BirthDate, BaseSalary, DepartmentId) " +
      "VALUES "+
      "(?,?,?,?,?)",
      Statement.RETURN_GENERATED_KEYS);

      st.setString(1, obj.getName());
      st.setString(2, obj.getEmail());
      st.setDate(3, new java.sql.Date(obj.getBirthDate().getTime()));
      st.setDouble(4, obj.getBaseSalary());
      st.setInt(5, obj.getDepartment().getId());

      /* Em resumo, o método executeUpdate() é usado para executar operações de atualização no banco de dados e retorna um número inteiro que indica quantas linhas foram afetadas, enquanto o método executeQuery() é usado para executar consultas que retornam um conjunto de resultados e retorna um objeto ResultSet. */
      int rowsAffected = st.executeUpdate();

      if(rowsAffected>0){
        rs = st.getGeneratedKeys();
        if(rs.next()){
          int id = rs.getInt(1);
          obj.setId(id);
        }
        else{
          throw new DbException("Unexpected error! No rows affected");
        }
      }
    } catch (SQLException e) {
      throw new DbException(e.getMessage());
    } finally {
      DB.closeStatement(st);
      DB.closeResultSet(rs);
    }
  }

  @Override
  public void update(Seller obj) {}

  @Override
  public void deleteById(Seller obj) {
    // TODO Auto-generated method stub

  }

  @Override
  public Seller findById(Integer id) {
    PreparedStatement st = null;
    ResultSet rs = null;
    try {
      st =
        connection.prepareStatement(
          "SELECT seller.*,department.Name as DepName " +
          "FROM seller INNER JOIN department " +
          "ON seller.DepartmentId = department.Id " +
          "WHERE seller.Id = ? "
        );
      st.setInt(1, id);
      //o comando acima vai ser executado e vai cair dentro do executeQuery
      rs = st.executeQuery();

      //testar pra ver se veio o resultado
      if (rs.next()) {
        Department dep = instatiaDepartment(rs);
        //apontar o vendedor para o departamento
        Seller obj = instatiaSeller(rs, dep);

        return obj;
      }
      return null;
    } catch (SQLException e) {
      throw new DbException(e.getMessage());
    } finally {
      DB.closeStatement(st);
      DB.closeResultSet(rs);
    }
  }

  private Seller instatiaSeller(ResultSet rs, Department dep)
    throws SQLException {
    Seller obj = new Seller();
    obj.setId(rs.getInt("Id"));
    obj.setName(rs.getString("Name"));
    obj.setEmail(rs.getString("Email"));
    obj.setBirthDate(rs.getDate("BirthDate"));
    obj.setBaseSalary(rs.getDouble("BaseSalary"));
    obj.setDepartment(dep);
    return obj;
  }

  private Department instatiaDepartment(ResultSet rs) throws SQLException {
    Department dep = new Department();

    dep.setId(rs.getInt("DepartmentId"));
    dep.setName(rs.getString("DepName"));

    // TODO Auto-generated catch block

    return dep;
  }

  @Override
  public List<Seller> findAll() {
    PreparedStatement st = null;
    ResultSet rs = null;
    try {
      st =
        connection.prepareStatement(
          "SELECT seller.*,department.Name as DepName " +
          "FROM seller INNER JOIN department " +
          "ON seller.DepartmentId = department.Id " +
          "ORDER BY NAME"
        );

      //o comando acima vai ser executado e vai cair dentro do executeQuery
      rs = st.executeQuery();

      List<Seller> listSeller = new ArrayList<>();
      Map<Integer, Department> map = new HashMap<>();

      while (rs.next()) {
        //se retorar null vai intanciar
        Department dep = map.get(rs.getInt("DepartmentId"));
        if (dep == null) {
          dep = instatiaDepartment(rs);
          map.put(rs.getInt("DepartmentId"), dep);
        }
        //condicao: mesmo departamento os vendedores apontando pra ele
        Seller obj = instatiaSeller(rs, dep);

        listSeller.add(obj);
      }

      return listSeller;
    } catch (SQLException e) {
      throw new DbException(e.getMessage());
    } finally {
      DB.closeStatement(st);
      DB.closeResultSet(rs);
    }
  }

  @Override
  public List<Seller> findByDepatment(Department department) {
    PreparedStatement st = null;
    ResultSet rs = null;
    try {
      st =
        connection.prepareStatement(
          "SELECT seller.*,department.Name as DepName " +
          "FROM seller INNER JOIN department " +
          "ON seller.DepartmentId = department.Id " +
          "WHERE DepartmentId = ? " +
          "ORDER BY NAME"
        );
      st.setInt(1, department.getId());
      //o comando acima vai ser executado e vai cair dentro do executeQuery
      rs = st.executeQuery();

      List<Seller> listSeller = new ArrayList<>();
      Map<Integer, Department> map = new HashMap<>();

      while (rs.next()) {
        //se retorar null vai intanciar
        Department dep = map.get(rs.getInt("DepartmentId"));
        if (dep == null) {
          dep = instatiaDepartment(rs);
          map.put(rs.getInt("DepartmentId"), dep);
        }
        //condicao: mesmo departamento os vendedores apontando pra ele
        Seller obj = instatiaSeller(rs, dep);

        listSeller.add(obj);
      }
      return listSeller;
    } catch (SQLException e) {
      throw new DbException(e.getMessage());
    } finally {
      DB.closeStatement(st);
      DB.closeResultSet(rs);
    }
  }
}
