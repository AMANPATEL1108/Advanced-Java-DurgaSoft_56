package Connection_with_DataBase_Lec_11__;

import java.sql.Connection;
import java.sql.DriverManager;

public class Retrive_Data_From_DataBase_Using_ResultSet_Lec_15 {
    public static void main(String[] args)throws  Exception {
//        Class.forName("oracal.jdbc.driver.oracleDriver");
        Class.forName("oracal.jdbc.oracleDriver");
      Connection con= DriverManager.getConnection("jdbc:oracle:oci:@localhost:8080:xe","system","manager");
        System.out.println(con);
    }
}
