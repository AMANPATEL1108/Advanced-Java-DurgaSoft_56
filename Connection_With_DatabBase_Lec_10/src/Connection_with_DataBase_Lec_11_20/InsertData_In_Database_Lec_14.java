package Connection_with_DataBase_Lec_11_20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData_In_Database_Lec_14 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Load Driver
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

        //Get Connection
        Connection con= DriverManager.getConnection("jdbc:odbc:durgasoft_datasource","system","manager");
        con.setAutoCommit(false);//default it is true
        //Create Stetments
        Statement statement=con.createStatement();

        //To Insert Data Using Execute Update
        String dmlinsert="insert into student values (111,'aman','aman@gmail.com')";
        //execute DML
        int rowsaffected=statement.executeUpdate(dmlinsert);
        //Commit transaction
        con.commit();  //Only For DML Use This
        System.out.println("No Of Rows Inserted:"+rowsaffected);
    }
}
