package model.dao.implementation;

import db.DB;
import db.DbException;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SellerDAOjdbc implements SellerDAO {

    private Connection conn;
    public SellerDAOjdbc(){}
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
                Department department = instantitateDepartment(rs);

                return instantiateSeller(rs, department);

            }
            return null;
        }catch (SQLException ex){
            throw new DbException(ex.getMessage());
        }finally {
            if(rs != null){
                DB.closeResultSet(rs);
            }
            if(ps != null){
                DB.closePreparedStatment(ps);
            }
        }
    }

    @Override
    public List<Seller> listByDepartment(Integer departmentId) {
        ResultSet rs = null;
        PreparedStatement ps = null;
        List<Seller> sellers = new ArrayList<Seller>();
        try {
            ps = this.conn.prepareStatement(
            "SELECT tb_seller.* , dep.name as departmentName FROM public.tb_seller " +
                "INNER JOIN tb_department dep " +
                "ON tb_seller.\"departmentId\" = dep.id " +
                "WHERE tb_seller.\"departmentId\" = ? " +
                "ORDER BY name;"
            );
            ps.setInt(1, departmentId);
            rs = ps.executeQuery();
            while(rs.next()){
                Department department = instantitateDepartment(rs);
                Seller seller = instantiateSeller(rs, department);
                sellers.add(seller);
            }
            return sellers;
        }catch (SQLException ex){
            throw new DbException(ex.getMessage());
        }finally {
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
            PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(
            "INSERT INTO tb_seller "
            +   "(name, birthDate, email, \"baseSalary\", \"departmentId\")"
            +   "VALUES (?,?,?,?,?);"
            );
            ps.setString(1, seller.getName());
            ps.setDate(2, new java.sql.Date(seller.getBirthDate().getTime()));
            ps.setString(3, seller.getEmail());
            ps.setInt(4, seller.getBaseSalary());
            ps.setInt(5, seller.getDepartment().getId());

            int rowsAffected = ps.executeUpdate();
            System.out.println("Done! Row affected: "+ rowsAffected);

        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }finally {
            if(ps != null){
                DB.closePreparedStatment(ps);
            }
        }
    }

    @Override
    public void update(Seller seller) {
        String sql =
        "UPDATE public.tb_seller " +
        "SET id=tb_seller.id, name=?, birthdate=?, email=?, \"baseSalary\"=?, \"departmentId\"=? " +
        "WHERE tb_seller.id = ?;";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, seller.getName());
            ps.setDate(2, new java.sql.Date(seller.getBirthDate().getTime()));
            ps.setString(3, seller.getEmail());
            ps.setInt(4, seller.getBaseSalary());
            ps.setInt(5, seller.getDepartment().getId());
            ps.setInt(6, seller.getId());

            int rowsAffacted = ps.executeUpdate();
            System.out.println("Done! Rows affacted: " + rowsAffacted);

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            if(ps != null){
                DB.closePreparedStatment(ps);
            }
        }
    }

    @Override
    public void deleteById(Integer id) {
        String sql =
        "DELETE FROM public.tb_seller " +
        "\tWHERE tb_seller.id = ?;";
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }finally {
            DB.closePreparedStatment(ps);
        }
    }

    @Override
    public List<Seller> list() {
        String sql =
        "SELECT tb_seller.*, dep.name departmentName " +
        "FROM public.tb_seller " +
        "INNER JOIN tb_department dep " +
        "ON tb_seller.\"departmentId\" = dep.id;";

        Statement st = null;
        ResultSet rs = null;
        List<Seller> list = new ArrayList<Seller>();
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()){
                Department dep = instantitateDepartment(rs);
                Seller seller = instantiateSeller(rs, dep);
                list.add(seller);
            }
            return list;
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }finally {
            if(st != null){
                DB.closeStatment(st);
            }
            if(rs != null){
                DB.closeResultSet(rs);
            }
        }

    }

    private Department instantitateDepartment(ResultSet rs) throws SQLException{
        Department d = new Department();
        d.setName(rs.getString("departmentName"));
        d.setId(rs.getInt("departmentId"));
        return d;
    }

    private Seller instantiateSeller(ResultSet rs, Department department) throws SQLException{
        Seller seller = new Seller();
        seller.setId(rs.getInt("id"));
        seller.setName(rs.getString("name"));
        seller.setBaseSalary(rs.getInt("baseSalary"));
        seller.setEmail(rs.getString("email"));
        seller.setBirthDate(rs.getDate("birthDate"));
        seller.setDepartment(department);
        return seller;
    }
}
//(name, birthDate, email, \"baseSalary\", \"departmentId\")