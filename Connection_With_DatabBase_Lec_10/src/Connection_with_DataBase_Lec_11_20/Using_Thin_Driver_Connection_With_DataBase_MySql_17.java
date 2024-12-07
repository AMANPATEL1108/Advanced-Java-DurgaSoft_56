package Connection_with_DataBase_Lec_11__;

import java.sql.Connection;
import java.sql.DriverManager;

public class Using_Thin_Driver_Connection_With_DataBase_MySql_17 {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql//localhost:3306/test","root","root");
        System.out.println(con);
    }
}
