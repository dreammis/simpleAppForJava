package test.pookz.jdbc;

import com.pookz.jdbc.JDBCUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDemo1 {

    @Test
    public void testQuery(){
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

    @Test
    public void testUpdate(){
        Connection conn = null;
        Statement st = null;

        try {
            // 1. 注册驱动
            conn = JDBCUtil.getConnection();
            // 3. 创建statement
            st = conn.createStatement();
            String sql = "insert into chess_user (username) values ('dazhangqiang')";
            int r = st.executeUpdate(sql);
            if (r == 0){
                System.out.println("Insert nothing!");
            }else{
                System.out.println("Insert one!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(conn, st);
        }
    }

    @Test
    public void testDelete(){
        Connection conn = null;
        Statement st = null;

        try {
            // 1. 注册驱动
            conn = JDBCUtil.getConnection();
            // 3. 创建statement
            st = conn.createStatement();
            String sql = "delete from chess_user where username='dazhangqiang'";
            int r = st.executeUpdate(sql);
            if (r == 0){
                System.out.println("Insert nothing!");
            }else{
                System.out.println("Insert one!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.release(conn, st);
        }
    }


}
