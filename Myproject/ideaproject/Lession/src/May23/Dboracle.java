package May23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dboracle {
    Connection conn;

    public Dboracle()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:ORCL", "system", "oracle");
            System.out.println(conn);
        } catch (ClassNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    //增加数据
    public void  add()
    {
        String sql="insert  into  t_students   values(seq_students.nextval,?,?,?)";

        try
        {
            PreparedStatement  pstmt=conn.prepareStatement(sql);

            pstmt.setString(1, "曹反");
            pstmt.setString(2, "222");
            pstmt.setFloat(3, 1000.88f);
            pstmt.execute();


        } catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
    //查询数据
    public void queryData()
    {
        String sql = "select  * from t_students";
        try
        {
            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next())
            {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String pwd = rs.getString(3);
                float money = rs.getFloat(4);

                System.out.println(id + "\t" + name + "\t" + pwd + "\t" + money);
                System.out.println("-------------------------------------");
            }

        } catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args)
    {
        Dboracle db  =  new Dboracle();
//        db.add();
        db.queryData();

    }
}
