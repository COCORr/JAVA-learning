package JDBC;

import java.sql.*;

public class JDBCDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        //Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
        Connection conn= DriverManager.getConnection("jdbc:mysql:/test","root","password");
        String sql="update testtable set id=1 where name=123";
        Statement stat=conn.createStatement();
        int count =stat.executeUpdate(sql);
        System.out.println(count);
        stat.close();
        conn.close();
    }
}
