package May27;

import java.sql.*;

public class DBquerymysql {
    Connection conn;
    public DBquerymysql(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ching","root","cm19971026");
            System.out.println(conn);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Object[][] queryGroupAgeCount(){
        Object[][] datas = null;
        String sql="select SUBSTR(NOW(),1,4)-SUBSTR(sbirthday,1,4),COUNT(SUBSTR(NOW(),1,4)-SUBSTR(sbirthday,1,4)) FROM  t_students  GROUP  BY SUBSTR(NOW(),1,4)-SUBSTR(sbirthday,1,4)";
        try {
            PreparedStatement pstmt = this.conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            int columncount = rsmd.getColumnCount();
            int row = 0;
            while(rs.next()){
                row++;
            }
            datas = new Object[row][columncount];
            rs.beforeFirst();
            int rowcount = 0;
            while(rs.next()){
                for(int i=0;i<=columncount;i++){
                    datas[rowcount][i] = rs.getObject(i+1);
                }
                rowcount++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  datas;
    }

//    public static void main(String[] args) {
//        DBquerymysql dm = new DBquerymysql();
//
//    }
}
