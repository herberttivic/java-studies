
package application;

import db.DB;
import db.DbException;

import java.sql.*;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
            conn = DB.getConnection();
            ps = conn.prepareStatement(
                    "INSERT INTO tb_seller "
                            +"(name, birthDate, email, \"baseSalary\", \"departmentId\")"
                            +"VALUES (?, ?, ?, ?, ?)"
            );
            ps.setString(1, "Josué");
            ps.setDate(2, new java.sql.Date(sdf.parse("22/11/1994").getTime()));
            ps.setString(3, "josue@gmail.com");
            ps.setInt(4, 2400);
            ps.setInt(5, 1);

            int rowsAffected = ps.executeUpdate();
            System.out.println("Done! Rows affected: "+ rowsAffected);
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

