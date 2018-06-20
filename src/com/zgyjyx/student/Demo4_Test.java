package com.zgyjyx.student;

public class Demo4_Test {

    public static void main(String[] args) {
        String s = "QewerWERWENNJIwwersmjwewrewpoo";

//        char q = s.charAt(0);
//        System.out.println(q);
//
//        if (q>='A' && q<='Z'){
//            q+= 32;
//        }else if (q>='a'&& q<='z'){
//            q-= 32;
//        }
//        System.out.println(q);
//
//        System.out.println(s);

        lowerTheFirstWord(s);

    }

    private static void lowerTheFirstWord(String s) {
        String s1 = s.substring(0, 1);
        s1 = s1.toUpperCase();
        s = s.toLowerCase();
        String s2 = s1 + s.substring(1);
        System.out.println(s2);
    }
}
