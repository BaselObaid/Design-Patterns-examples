package com.designpattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    private static volatile DataBaseConnection dataBaseConnection;
    private Connection connection;
    private static int counter = 0;
    private DataBaseConnection() {
        counter++;
        System.out.println("counter: " + counter);
    }

    public static DataBaseConnection getInstance()  {
        if(dataBaseConnection == null){
            synchronized (DataBaseConnection.class){
                if(dataBaseConnection == null){
                    dataBaseConnection = new DataBaseConnection();
                }
            }
        }
        return dataBaseConnection;
    }

    public Connection getConnection(){
        if(connection == null){
            String url = "jdbc:mysql://localhost:3306/simplilearn";
            String user = "root";
            String password = "basel3369#";
            try {
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                System.err.println("connection problem in databaseconnection");
            }
        }
        return connection;
    }
    public void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
            connection = null;
        }
    }
}
