package db_test_postgres;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "joker43PRO32";


    public static void main(String[] argh){
        Connection connection;

        try{
            Driver driver = new org.postgresql.Driver();
            DriverManager.registerDriver(driver);


            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            if(!connection.isClosed()){
                System.out.println("Connection BD alright!");
            }

            connection.close();
            if(connection.isClosed()) {
                System.out.println("Connection BD closed!");
            }
        } catch (SQLException e){
            System.err.println("Not download class driver");
        }
    }
}