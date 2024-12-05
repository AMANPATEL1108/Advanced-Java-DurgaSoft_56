import java.sql.*;
import java.util.*;

//Using Driver

public class JDBC_DRIVER_Test1_Lecture_10_Connect_With_DataBase {
    public static void main(String[] args) {

        // Using Class.forName with MySQL JDBC Driver
        try {
            // MySQL JDBC driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL JDBC driver successfully loaded.");

        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }

        // Listing registered JDBC drivers
        Enumeration<Driver> e = DriverManager.getDrivers();
        while (e.hasMoreElements()) {
            Driver d = e.nextElement();
            System.out.println(d.getClass().getName());
        }
    }
}
