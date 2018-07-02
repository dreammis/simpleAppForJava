package com.chess.dao.impl;

import com.chess.dao.UserDao;
import com.pookz.jdbc.JDBCUtil;

import java.sql.*;

public class UserDaoImpl implements UserDao{
    /*
    * 这里穿插一下，使用Statement是有安全隐患的，因为传入的是sql语句字符串类型，它并不识别参数
    * 所以查询的话如果传入 参数 + or '1=1'则会引发安全漏洞
    * 开发过程中使用PrepareStatement
    * 具体实现过程参考
    * @see login
    * */



    @Override
    public void findall() {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtil.getConnection();
            st = conn.createStatement();
            String sql = "select id, username from chess_user";
            rs = st.executeQuery(sql);

            while(rs.next()){
                int id = rs.getInt("id");
                String username = rs.getString("username");
                System.out.println(id+"="+username);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(conn, st, rs);
        }
    }

    @Override
    public void login(String id, String username) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtil.getConnection();
            String sql = "select id, username from chess_user where id=? and username=?;";

            ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, username);
            rs = ps.executeQuery();
            Boolean b = rs.first();

            String msg = b? "I got the user!": "I got nothing!";
            System.out.println(msg);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(conn, ps, rs);
        }

    }
}
