package model.dao.implementation;

import model.dao.DepartmentDAO;
import model.entities.Department;

import java.sql.Connection;
import java.util.List;

public class DepartmentDAOjdbc implements DepartmentDAO {

    private Connection conn;
    public DepartmentDAOjdbc(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insert(Department department) {

    }

    @Override
    public void update(Department department) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {
        return null;
    }

    @Override
    public List<Department> list() {
        return List.of();
    }
}
