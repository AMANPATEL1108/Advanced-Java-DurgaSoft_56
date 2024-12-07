package Connection_with_DataBase_Lec_11__;

import java.sql.*;

public class Retrive_Data_From_DataBase_Using_ResultSet_Lec_15 {
    public static void main(String[] args)throws  Exception {
//        Class.forName("oracal.jdbc.driver.oracleDriver");
        Class.forName("oracal.jdbc.oracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:oci:@localhost:8080:xe","system","manager");
        Statement st= con.createStatement();
        ResultSet rs=st.executeQuery("selecct * from student007");
        ResultSetMetaData metaData=rs.getMetaData();
        int noofcolums=metaData.getColumnCount();
        System.out.println(noofcolums);
        for(int i=1;i<=4;i++){
            String columnname=   metaData.getColumnName(i);
            String dataType=metaData.getColumnTypeName(i);
            System.out.println("colunm:No"+i+",Column:Name="+columnname+",dataType+"+dataType);


        }

        while (rs.next()){
            System.out.println(rs.getInt("ID"));
            System.out.println(rs.getInt("ADDRESS"));
            System.out.println(rs.getInt("EMAIL"));
            System.out.println(rs.getInt("NAME"));


        }
    }
}
