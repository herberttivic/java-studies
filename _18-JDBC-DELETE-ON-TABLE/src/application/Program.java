
package application;

import db.DB;
import db.DbException;

import java.sql.*;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement(
                "DELETE FROM tb_department "
                +   "WHERE "
                +   "(id = ?);"
            );

            ps.setInt(1, 1);

            int rowAffected = ps.executeUpdate();
            System.out.println("Done! Rows affected: "+rowAffected);

        }catch (Exception e){
            throw new DbException(e.getMessage());
        }finally {
            if(ps != null){
                DB.closePreparedStatment(ps);
            }
            DB.closeConnection();
        }
    }
}
//+"(name, birthDate, email, \"baseSalary\", \"departmentId\")"

