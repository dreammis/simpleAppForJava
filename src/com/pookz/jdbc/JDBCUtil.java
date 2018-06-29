package com.pookz.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {
    static String url = null;
    static String driverClass = null;

    static{
        try {
            Properties prop = new Properties();
            /*
            * 这里使用类加载器加载properties文件
            * */
            //prop.load(new FileInputStream("src/jdbc.properties"));
            prop.load(JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties"));
            url = (String)prop.get("jdbcUrl");
            driverClass = (String)prop.get("driverClass");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName(driverClass);
            conn =  DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void release(Connection conn, Statement st, ResultSet rs){
        closeConn(conn);
        closeSt(st);
        closeRs(rs);
    }


    private static void closeRs(ResultSet rs) {
        try {
            if (rs != null) rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            rs = null;
        }
    }

    private static void closeConn(Connection conn) {
        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn = null;
        }
    }

    private static void closeSt(Statement st) {
        try {
            if (st != null) {
                st.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            st = null;
        }
    }
}
