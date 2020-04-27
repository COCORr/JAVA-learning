package JDBC;

import java.sql.*;

public class JDBCDemo3_ResultSet {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs=null;

        try {
            //1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2. 定义sql
            String sql="select * from testtable";//.....
            //3.获取Connection对象
            conn = DriverManager.getConnection("jdbc:mysql:///test", "root", "password");
            //4.获取执行sql的对象 Statement
            stmt = conn.createStatement();
            //5.执行sql
            rs=stmt.executeQuery(sql);
            //6.处理结果
            //rs.next();
            while (rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                System.out.println(name+" "+id);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //stmt.close();
            //7. 释放资源
            //避免空指针异常
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
