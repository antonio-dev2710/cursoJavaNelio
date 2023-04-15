package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    //essa classe vai ter operações estáticas para instanciar os DAOS

    public static SellerDao creatSellerDao() {
        //INTACIAR A IMPLEMENTACAO
        return new SellerDaoJDBC();
        
    }
}
