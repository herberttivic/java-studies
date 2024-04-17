
package application;

import db.DB;
import db.DbException;

import java.sql.*;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try{
            conn = DB.getConnection();
//            NÃO CONFIRMA AS ALTERAÇÕES AUTOMATICAMENTE. EXIGE UM COMMIT
            conn.setAutoCommit(false);

            st = conn.createStatement();

            int rows1 = st.executeUpdate(
                    "UPDATE tb_seller "
                    +   "SET \"baseSalary\" = 2010 "
                    +   "WHERE \"departmentId\" = 1;"
            );

            if(true){
                throw new SQLException("Fake error");
            }
//            OCORRENDO ERRO AS PRÓXIMAS LINHAS NÃO SE EXECUTAM MAS AS ANTERIORES FORAM EXECUTADAS. ISSO QUEBRA O CONCEITO DE ATOMICIDADE.

            int rows2 = st.executeUpdate(
                    "UPDATE tb_seller "
                    +   "SET \"baseSalary\" = 3090 "
                    +   "WHERE \"departmentId\" = 4;"
            );

            conn.commit();

            System.out.println("Done! Rows affected on 1th query: "+rows1);
            System.out.println("Done! Rows affected on 2nd query: "+rows2);

        }catch (SQLException e){
            try {
                conn.rollback();
                throw new DbException( "Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error during rollback! Caused by: "+ e.getMessage());
            }
        }finally {
            if(st != null){
                DB.closeStatment(st);
            }
            DB.closeConnection();
        }
    }
}
//+"(name, birthDate, email, \"baseSalary\", \"departmentId\")"

