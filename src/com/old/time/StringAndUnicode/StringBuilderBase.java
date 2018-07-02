package com.old.time.StringAndUnicode;

import java.lang.Integer;
import java.util.ArrayList;
import java.util.List;

public class StringBuilderBase {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(1024);
        System.out.println(sb.append("qqq").append("zzz").toString());

        ArrayList<String> strList = new ArrayList<String>();
        strList.add("abc");
        strList.add("xyz");
        String first = strList.get(0);
        System.out.println(strList);
        System.out.println(first);

        List<Number> nlist = new ArrayList<Number>();
        nlist.add(new Integer(123));
        nlist.add(new Double(12.34));
        Number nfirst = nlist.get(0);
        Number nsencend = nlist.get(1);
        System.out.println(nlist);
        System.out.println(nfirst);
        System.out.println(nsencend);

        List<Number> clist = new ArrayList<>();







    }
}
