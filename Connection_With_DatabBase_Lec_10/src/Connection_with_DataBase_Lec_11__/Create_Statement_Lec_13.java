package Connection_with_DataBase_Lec_11__;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Statement_Lec_13 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       //Load Driver
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

        //Get Connection
        Connection con= DriverManager.getConnection("jdbc:odbc:durgasoft_datasource","system","manager");

        //Create Stetments
        Statement statement=con.createStatement();

        //create a Table
        String ddldrop="drop table student";
        String ddlcreate="create table student(id number,name varchar2(50),email varchar2(50))";
        statement.execute(ddldrop);
        statement.execute(ddlcreate);
        System.out.println("table Created Succesfully");



    }
}
