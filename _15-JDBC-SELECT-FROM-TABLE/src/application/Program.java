
package application;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet result = null;

        try{
            connection = DB.getConnection();
            statement = connection.createStatement();
            result = statement.executeQuery("SELECT * FROM tb_department");

            while (result.next()){
                System.out.println(result.getInt("id") + " - "+ result.getString("name"));
            }

        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }finally {
            if(statement != null && result!=null){
                DB.closeStatment(statement);
                DB.closeResultSet(result);
            }
            DB.closeConnection();
        }
    }
}
