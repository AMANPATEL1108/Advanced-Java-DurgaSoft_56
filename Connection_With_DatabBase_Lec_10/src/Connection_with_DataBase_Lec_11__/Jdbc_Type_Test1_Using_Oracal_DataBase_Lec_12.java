import java.sql.*;
import static java.lang.Class.forName;

public class Jdbc_Type_Test1_Using_Oracal_DataBase_Lec_12 {

    public static void main(String[] args) throws  ClassNotFoundException,SQLException{

        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        }catch (ClassNotFoundException cnf){
        cnf.printStackTrace();
        }

        try{
       Connection con= DriverManager.getConnection("jdbc:odbc:durgasoft_datasource","system","manager");
            System.out.println(con);
        }catch (SQLException sql){
        sql.printStackTrace();
        }

    }
}
