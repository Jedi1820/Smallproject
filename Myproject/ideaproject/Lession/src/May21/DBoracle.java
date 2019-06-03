package May21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBoracle {
    public DBoracle(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection conn= DriverManager.
                    getConnection("jdbc:oracle:thin:@//127.0.0.1:1521/ORCL",
                            "system","oracle");
            System.out.println("连接oracle数据库成功"+conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    public static void main(String[] args) {

        DBoracle db=new DBoracle();
    }
}