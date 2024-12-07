package Connection_with_DataBase_Lec_11_20;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import static java.lang.System.getProperties;

public class Using_Properties_File_Create_Connection_With_DataBase_Lec_20 {
    public static void main(String[] args)  throws Exception{
        Properties properties=new Properties();
        properties.load(new FileInputStream("C:/Users/amanp/OneDrive/Desktop/02/Advanced Java DurgaSoft_56/Connection_With_DatabBase_Lec_10/src/Connection_with_DataBase_Lec_11_20/DB.properties"));

        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));

        Class.forName(properties.getProperty("driver"));
        Connection con= DriverManager.getConnection(properties.getProperty("url"),properties);

        System.out.println(con);
    }
}
