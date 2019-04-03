package com.pookz.servlet;

import javax.servlet.http.Cookie;

public class CookieUtil {

    public static Cookie findCookie(Cookie[] cookies, String key){
        Cookie c = null;
        for (Cookie cookie:cookies) {
            if(key.equals(cookie.getName())){
                c = cookie;
                break;
            }
        }
        return c;
    }
}
