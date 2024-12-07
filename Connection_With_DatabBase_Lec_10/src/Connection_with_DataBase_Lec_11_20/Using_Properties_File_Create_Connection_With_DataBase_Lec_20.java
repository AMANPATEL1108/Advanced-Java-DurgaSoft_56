package Connection_with_DataBase_Lec_11__;

import java.io.FileInputStream;
import java.util.Properties;

public class Using_Properties_File_Create_Connection_With_DataBase_Lec_20 {
    public static void main(String[] args)  throws Exception{
        Properties properties=new Properties();
        properties.load(new FileInputStream("resources/DB.properties"));

        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));
    }
}
