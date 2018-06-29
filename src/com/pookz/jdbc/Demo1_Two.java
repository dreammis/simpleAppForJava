package com.pookz.jdbc;

import java.sql.*;

public class Demo1_Two {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            // 1. 注册驱动
            conn = JDBCUtil.getConnection();
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
