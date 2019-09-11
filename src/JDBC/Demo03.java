package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * 测试preparedStatement的基本用法
 * @author huzhu
 * @date 2019-06-14 22:38
 */
public class Demo03 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest?useSSL=false","root","huzhu0313");
        System.out.println(conn);
        String sql = "insert into ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.execute();
    }
}
