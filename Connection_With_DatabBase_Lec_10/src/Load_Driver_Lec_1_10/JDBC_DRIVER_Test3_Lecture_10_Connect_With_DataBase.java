package Load_Driver_Lec_1_10;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.*;

//Using System Properties

public class JDBC_DRIVER_Test3_Lecture_10_Connect_With_DataBase {
    public static void main(String[] args) {


        Enumeration<Driver> e = DriverManager.getDrivers();
        while (e.hasMoreElements()) {
            Driver d = (Driver) e.nextElement();
            System.out.println(d.getClass().getName());
        }

    }}
