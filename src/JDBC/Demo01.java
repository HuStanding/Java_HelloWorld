package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 测试数据库的连接
 * @author huzhu
 * @date 2019-06-14 22:38
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        long start = System.currentTimeMillis();
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest?useSSL=false","root","huzhu0313");
        long end = System.currentTimeMillis();
        System.out.println(conn);
        System.out.println("建立连接耗时：" + (end - start) + "ms");

    }
}
