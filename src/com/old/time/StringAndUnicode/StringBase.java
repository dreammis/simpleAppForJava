package com.old.time.StringAndUnicode;

import java.lang.System;
import java.nio.charset.StandardCharsets;

public class StringBase {
    public static void main(String[] args) {
        String s = "whatfucko111";
        System.out.println(String.valueOf(s.contains("f")));
        System.out.println(s.indexOf('f'));
        System.out.println(s.lastIndexOf('f'));
        String s1 = "\t what fuck";
        System.out.println(s1.trim());
        char [] cs = s.toCharArray();
        System.out.println(cs);

        String qq = "Hello, com.old.time.World!";
        System.out.printf(qq);
        String sub = qq.substring(7);
        System.out.println(sub);
        System.out.println("  中文".trim());
        byte[] data = "中文ABC".getBytes(StandardCharsets.UTF_8);
        System.out.println(data);
        String qqq = new String(data, StandardCharsets.UTF_8);
        System.out.println(qqq);
    }
}
