package com.magasin.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author WIKI
 */
public class DataSource {

    String url = "jdbc:mysql://localhost:3306/pikidz";
    String login = "root";
    String password = "";
    private Connection connection;
    private static DataSource instance;

    private DataSource() {
      try{
        connection=DriverManager.getConnection(url,login,password);
        System.out.println("cnx établie");    
        }catch(SQLException e){
            e.printStackTrace();
}
    }

    public Connection getConnection() {
        return connection;
    }
    

    public static DataSource getInstance() {
        if (instance == null) {
            instance = new DataSource();
        }
        return instance;
    }

}