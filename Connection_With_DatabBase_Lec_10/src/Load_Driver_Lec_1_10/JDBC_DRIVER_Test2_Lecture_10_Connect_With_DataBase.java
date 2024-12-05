import java.sql.*;
import java.util.*;
import  sun.jdbc.odbc.*;

//Using DriverManager

public class JDBC_DRIVER_Test2_Lecture_10_Connect_With_DataBase {
    public static void main(String[] args) throws SQLException {

        // Remove the usage of sun.jdbc.odbc.JdbcOdbcDriver (deprecated in modern Java)
        // Use a valid JDBC driver for the database you are connecting to.
        // Here, we just demonstrate a generic Driver object registration

        Driver driver = new com.mysql.cj.jdbc.Driver();  // Example driver, replace with your actual driver
        try{
            DriverManager.registerDriver(driver);

        }catch (SQLException sql){
        }

        Enumeration<Driver> e = DriverManager.getDrivers();
        while (e.hasMoreElements()) {
            Driver d = e.nextElement();
            System.out.println(d.getClass().getName());
        }

    }
}
