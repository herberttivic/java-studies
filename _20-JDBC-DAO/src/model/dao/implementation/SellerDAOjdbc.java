package model.dao.implementation;

import db.DB;
import db.DbException;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SellerDAOjdbc implements SellerDAO {

    private Connection conn;
    public SellerDAOjdbc(Connection conn){
        this.conn = conn;
    }
    @Override
    public Seller findById(Integer id) {
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = this.conn.prepareStatement(
                    "SELECT tb_seller.*, tb_department.name as \"departmentName\" " +
                        "FROM tb_seller INNER JOIN tb_department " +
                        "ON tb_seller.\"departmentId\" = tb_department.id " +
                        "WHERE tb_seller.id = ?;"
            );
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                Department department = new Department();
                department.setName(rs.getString("departmentName"));
                department.setId(rs.getInt("departmentId"));

                Seller seller = new Seller();
                seller.setId(rs.getInt("id"));
                seller.setName(rs.getString("name"));
                seller.setBaseSalary(rs.getInt("baseSalary"));
                seller.setEmail(rs.getString("email"));
                seller.setBirthDate(rs.getDate("birthDate"));
                seller.setDepartment(department);

                return seller;
            }
            return null;
        }catch (SQLException ex){
            throw new DbException(ex.getMessage());
        }finally {
            DB.closeConnection();
            if(rs != null){
                DB.closeResultSet(rs);
            }
            if(ps != null){
                DB.closePreparedStatment(ps);
            }
        }
    }


    @Override
    public void insert(Seller seller) {

    }

    @Override
    public void update(Seller seller) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public List<Seller> list() {
        return List.of();
    }
}
