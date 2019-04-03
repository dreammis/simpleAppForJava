package com.pookz.serlvet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        * 设置post值的编码格式
        * */
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        /*
        * response 写入字符
        * */
        resp.getWriter().write("<h1>fuck shit come on baby.</h1>");
        /*
        * response 写入字节，可用于写入文件
        * */
        resp.getOutputStream().write("<h1>fuck shit come on baby.</h1>".getBytes());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("username="+username+"==password="+password);

        PrintWriter pw = resp.getWriter();

        ServletContext sc = getServletContext();
        int success_count = (sc.getAttribute("success_count") == null)? 0: (int)sc.getAttribute("success_count");

        if ("admin".equals(username) && "god".equals(password)){
            /*pw.write("good!");*/
            sc.setAttribute("success_count", success_count + 1);
            resp.setStatus(302);
            resp.setHeader("Location", "success.html");
        }else{
            pw.write("bad!");
        }
    }

}
