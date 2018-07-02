package com.pookz.tmp;

import com.pookz.jdbc.JDBCUtil;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo1_TestJDBC {

    @Test
    public void TestQuery(){
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            // 1. 注册驱动
            conn = JDBCUtil.getConnection();
            // 3. 创建statement
            st = conn.createStatement();
            String sql = "select * from chess_user";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println("id <" + rs.getInt("id") + "> " + rs.getString("username")
                        + "at " + rs.getDate("create_time") + " create the account!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(conn, st, rs);
        }
    }

    @Test
    public void TestInsert(){
        Connection conn = null;
        Statement st = null;

        try {
            // 1. 注册驱动
            conn = JDBCUtil.getConnection();
            // 3. 创建statement
            st = conn.createStatement();

            java.text.SimpleDateFormat fmt1 = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

            String sql = String.format("insert into chess_user (username, create_time) values('niumowang', '%s')", fmt1.format(new java.util.Date().getTime()));
            int r = st.executeUpdate(sql);
            if (r >0){
                System.out.println(String.format("update %s line.", String.valueOf(r)));
            }else{
                System.out.println("nothing to update.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(conn, st);
        }
    }

    @Test
    public void TestDelete(){
        Connection conn = null;
        Statement st = null;

        try {
            // 1. 注册驱动
            conn = JDBCUtil.getConnection();
            // 3. 创建statement
            st = conn.createStatement();

            String sql = String.format("delete from chess_user where username='%s'", "niumowang");
            int r = st.executeUpdate(sql);
            if (r >0){
                System.out.println(String.format("update %s line.", String.valueOf(r)));
            }else{
                System.out.println("nothing to update.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(conn, st);
        }
    }

    @Test
    public void TestUpdate(){
        Connection conn = null;
        Statement st = null;

        try {
            // 1. 注册驱动
            conn = JDBCUtil.getConnection();
            // 3. 创建statement
            st = conn.createStatement();

            String sql = String.format("update chess_user set username='%s' where username= '%s'", (Object[]) new String[]{"sunwukong", "niumowang"});
            int r = st.executeUpdate(sql);
            if (r >0){
                System.out.println(String.format("update %s line.", String.valueOf(r)));
            }else{
                System.out.println("nothing to update.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(conn, st);
        }
    }
}
