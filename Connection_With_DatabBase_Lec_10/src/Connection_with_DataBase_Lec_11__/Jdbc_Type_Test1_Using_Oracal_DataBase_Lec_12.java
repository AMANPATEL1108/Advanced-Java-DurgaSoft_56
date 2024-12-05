package Connection_with_DataBase_Lec_11__;

import sun.jdbc.odbc.JdbcOdbcDriver;

import java.sql.*;
import static java.lang.Class.forName;

public class Jdbc_Type_Test1_Using_Oracal_DataBase_Lec_12 {

    public static void main(String[] args) throws  ClassNotFoundException,SQLException{


//            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); //Without this we can connect
//          Connection con= DriverManager.getConnection("jdbc:odbc:durgasoft_datasource","system","manager");
//            System.out.println(con);

         //or-----------------------------------
        Driver d=new JdbcOdbcDriver();
        DriverManager.registerDriver(d);
        Connection con= DriverManager.getConnection("jdbc:odbc:durgasoft_datasource","system","manager");
        System.out.println(con);

        //or-----------------------------------


    }
}
