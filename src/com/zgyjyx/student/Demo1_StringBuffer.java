package com.zgyjyx.student;

public class Demo1_StringBuffer {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        System.out.println(sb.length());  //容器中的字符个数，实际值
        System.out.println(sb.capacity());  //容器的初始容量，理论值

        StringBuffer sb2 = new StringBuffer(10);
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        StringBuffer sb3 = new StringBuffer("sbadsadasdasdasdaswewqeqwewq");
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());  //sb3.length()+16

        sb3.deleteCharAt(0);
        sb3.delete(0, 2);

        /*
        *
        *
        *
        * */
        StringBuffer sb4 = new StringBuffer();
        sb4.append(true);
        System.out.println(sb4);

        /*
        * String与StringBuffer互相转换
        *
        * */

        StringBuffer sbq = new StringBuffer("abc");
        String s0 = sbq.toString();

        sbq.reverse();

        System.out.println(sbq);

        String s1 = new String(sbq);

        String s2 = sbq.substring(0, sbq.length());

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(s2);



    }
}
