package com.pookz.jdbc;


import java.sql.*;

public class Demo1_First {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {

            /*
            * 通过查看Driver的源码发现
            *
            *
            static {
                try {
                    DriverManager.registerDriver(new Driver());
                } catch (SQLException var1) {
                    throw new RuntimeException("Can't register driver!");
                }
            }
            * 这里有一段静态代码片段
            * 静态代码片段是在类加载的时候就加载进来了，所以这里其实是不需要再用DriverManager再去注册一遍了
            * 直接使用Class.forName("com.mysql.cj.jdbc.Driver()")
            * */
            // 1. 注册驱动
            // DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. 建立连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost/song?user=root&password=aA123456&serverTimezone=Hongkong");
            // 3. 创建statement
            st = conn.createStatement();
            String sql = "SELECT * from chess_user";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                Date date = rs.getDate("create_time");
                System.out.println("id <" + id + "> " + username + "at " + date + " create the account!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(conn, st, rs);
        }
    }
}
