package com.pookz.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Demo3_ServletContext extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("init demo3");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        * 每个web工程有且只有一个servletContext
        * 作用
        * 1. 获取全局配置参数
        * 2. 获取web工程中的资源
        * 3. 存取数据，servlet共享数据
        * */
        /*
        * 获取web工程中资源的几种方式
        * */
        Properties p = new Properties();


        ServletContext sc = getServletContext();
        String path = sc.getRealPath("config/config.properties");
        InputStream is = new FileInputStream(path);
        p.load(is);
        String name = p.getProperty("address");
        System.out.println(name);
    }
}
