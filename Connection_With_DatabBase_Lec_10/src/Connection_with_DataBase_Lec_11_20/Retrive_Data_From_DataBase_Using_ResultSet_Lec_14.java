package Connection_with_DataBase_Lec_11__;

import java.sql.*;

public class Retrive_Data_From_DataBase_Using_ResultSet_Lec_14 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException      {
        //Load Driver
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

        //Get Connection
        Connection con= DriverManager.getConnection("jdbc:odbc:durgasoft_datasource","system","manager");
        con.setAutoCommit(false);//default it is true
        //Create Stetments
        Statement statement=con.createStatement();

        String drl="select * from student";
        ResultSet rs=statement.executeQuery(drl);
        while (rs.next()){
            System.out.println("ID="+rs.getInt(1));
            System.out.println("Name="+rs.getString(2));
            System.out.println("Email"+rs.getString(3));
        }
    }
}
