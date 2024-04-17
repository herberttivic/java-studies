package model.dao.implementation;

import db.DB;
import db.DbException;
import model.dao.DepartmentDAO;
import model.entities.Department;
import model.entities.Seller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAOjdbc implements DepartmentDAO {

    private Connection conn;

    public DepartmentDAOjdbc(){}
    public DepartmentDAOjdbc(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insert(Department department) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(
            "INSERT INTO tb_department "
            +   "(name) "
            +   "VALUES (?);"
            );
            ps.setString(1, department.getName());

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
    public void update(Department department) {
        String sql =
        "UPDATE public.tb_department " +
        "SET id=tb_department.id, name=? " +
        "WHERE tb_department.id = ?;";
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, department.getName());
            ps.setInt(2, department.getId());

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
        "DELETE FROM public.tb_department " +
        "WHERE tb_department.id = ?;";

        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            int rowsAffected = ps.executeUpdate();
            System.out.println("Done! Row affected: "+ rowsAffected);
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }finally {
            if(ps!= null){
                DB.closePreparedStatment(ps);
            }
        }
    }

    @Override
    public Department findById(Integer id) {
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = this.conn.prepareStatement(
        "SELECT * FROM tb_department " +
            "WHERE tb_department.id = ?;"
            );
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()){
                return instantitateDepartment(rs);
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
    public List<Department> list() {
        String sql =
        "SELECT * " +
        "FROM public.tb_department " +
        "ORDER BY tb_department.id;";

        Statement st = null;
        ResultSet rs = null;
        List<Department> list = new ArrayList<>();
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()){
                Department dep = instantitateDepartment(rs);
                list.add(dep);
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
        d.setName(rs.getString("name"));
        d.setId(rs.getInt("id"));
        return d;
    }
}
