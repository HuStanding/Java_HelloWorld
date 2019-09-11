package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 测试SQL语句和SQL注入问题
 * @author huzhu
 * @date 2019-06-14 22:38
 */
public class Demo02 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest?useSSL=false","root","huzhu0313");
        System.out.println(conn);
        Statement stmt = conn.createStatement();
        String sql = "insert into testjdbc (id,username,pwd,regTime) values (1004,'赵六',4444,now())";
        stmt.execute(sql);
    }
}
