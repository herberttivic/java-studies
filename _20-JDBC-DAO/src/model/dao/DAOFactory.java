package model.dao;

import db.DB;
import model.dao.implementation.DepartmentDAOjdbc;
import model.dao.implementation.SellerDAOjdbc;

import java.sql.Connection;

public class DAOFactory {

    public static SellerDAO createSellerDAO(){
        Connection conn = DB.getConnection();
        return new SellerDAOjdbc(conn);
    }

    public static DepartmentDAO createDepartmentDAO(){
        Connection conn = DB.getConnection();
        return new DepartmentDAOjdbc(conn);
    }
}
