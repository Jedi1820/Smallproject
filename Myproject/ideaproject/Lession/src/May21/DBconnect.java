package May21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnect {
    public DBconnect(){
        try {
            //1.加载这个数据库的驱动所在类的字符串
            //检查异常
            Class.forName("com.mysql.jdbc.Driver");

            //2.连接数据库Connection
            //getConnection(url,user,pwd)  ?useUnicode=true&characterEncoding=utf8
            Connection conn= DriverManager.
                    getConnection("jdbc:mysql://127.0.0.1:3306/mysql",
                            "root","cm19971026");

            System.out.println("连接mysql数据库成功"+conn);



        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DBconnect db = new DBconnect();
    }

}
