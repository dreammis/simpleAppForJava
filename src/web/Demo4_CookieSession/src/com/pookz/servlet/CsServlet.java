package com.pookz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.websocket.Session;
import java.io.IOException;
import java.util.Date;

@WebServlet(name = "CsServlet")
public class CsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession s = request.getSession();
        // get sessionid
        System.out.println(s.getId());
        // 常用方法
        s.setAttribute("name", "loos");
        s.getAttribute("name");
        s.removeAttribute("name");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*
        * create Cookie
        * to response
        * */

        Cookie c = new Cookie("anger", "zsc");
        response.addCookie(c);
        //客户端收到的信息里面，响应头中多了一个字段 Set-Cookie

        /*
        * get Cookie
        * from request
        * */


        Cookie[] cookies = request.getCookies();

        for (Cookie cookie:cookies) {
            String name = cookie.getName();
            String value = cookie.getValue();
            /*
            * cookie默认有效期持续到浏览器关闭
            * 可以通过setMaxAge去设置存在客户端本地的时长
            *
            * */
            cookie.setMaxAge(60*60*24*7); // 设置失效时间一天
            cookie.setDomain(".pookz.me");
            cookie.setPath("/servlet");
            System.out.println(name+"=="+value);
        }

        //demo1();
        //demo2();

    }

    private void demo2(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();

    }

    private void demo1(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cookie[] cookies = request.getCookies();
        Cookie c = CookieUtil.findCookie(cookies, "last_time");
        if (c == null) {
            c = new Cookie("last_time", String.valueOf(System.currentTimeMillis()));
            c.setMaxAge(60*60);
            response.addCookie(c);
            response.getWriter().write("welcome new boy.");
        }else{
            //1. 去以前的cookie第二次登录，有cookie
            long lastVisitTime = Long.parseLong(c.getValue());
            //2. 输出到界面，
            response.getWriter().write("welcome, "+",last time see u is："+new Date(lastVisitTime));
            //3. 重置登录的时间
            c.setValue(System.currentTimeMillis()+"");
            response.addCookie(c);
        }
    }

}
