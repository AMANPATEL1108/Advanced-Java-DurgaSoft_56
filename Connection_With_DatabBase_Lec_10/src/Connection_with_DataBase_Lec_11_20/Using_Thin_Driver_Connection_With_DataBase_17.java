package Connection_with_DataBase_Lec_11_20;

import java.sql.Connection;
import java.sql.DriverManager;

public class Using_Thin_Driver_Connection_With_DataBase_17 {
    public static void main(String[] args) throws  Exception{
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:192.168.1.8:1521:xe","system","manager");
//        System.out.println(con);



    }
}
