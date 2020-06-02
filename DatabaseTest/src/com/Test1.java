package com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {
    public static void main(String[] args) throws SQLException {
        String sql1 = "SELECT id, name, url FROM websites";
        String sql2 = "insert INTO websites VALUES (6, '可恶的秋天', 'http://kewudeqiutian.cn', 2, 'USA');";
        int update = JDBCUtils.update(sql2);
        System.out.println(update);
        ResultSet resultSet = JDBCUtils.query(sql1);
        while(resultSet.next()){
            // 通过字段检索
            int id  = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String url = resultSet.getString("url");

            // 输出数据
            System.out.println(id + "******" + name + "*********" + url);
        }
        JDBCUtils.close();
    }
}
