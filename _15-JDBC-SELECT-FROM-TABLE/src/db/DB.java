package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.sql.*;
import java.util.Properties;

public class DB {

    private static Connection conn = null;
    private static Properties loadProperties(){
        try {
            var fs = new FileInputStream("_15-JDBC-SELECT-FROM-TABLE/db.properties");
            var props = new Properties();
            props.load(fs);
            return props;
        }catch (IOException e){
            throw new DbException(e.getMessage());
        }
    }

    public static Connection getConnection(){
        if(conn == null){
            try {
                Properties props = loadProperties();
                String url = props.getProperty("database_url");
                conn = DriverManager.getConnection(url, props);
            }catch (SQLException e){
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

    public static void closeConnection(){
        if(conn != null){
            try {
                conn.close();
            }catch (SQLException e){
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeStatment(Statement statement){
        try {
            statement.close();
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
    }
    public static void closeResultSet(ResultSet resultSet){
        try {
            resultSet.close();
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
    }

    public static void closePreparedStatment(PreparedStatement preparedStatement){
        try {
            preparedStatement.close();
        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
    }
}
