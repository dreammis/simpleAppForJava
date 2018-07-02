package com.old.time.StaticS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(Person.getNumber());
        Person p1 = new Person("小明");
        System.out.println(Person.getNumber());
        Person p2 = new Person("小红");
        System.out.println(Person.getNumber());
        Person p3 = new Person("傻逼");
        System.out.println(Person.getNumber());
        List<String> strList = new LinkedList<>();
        strList.add("apple");
        strList.add("Pear");
        strList.add("Orange");
        System.out.println(strList.contains("banana"));
        System.out.println(strList.indexOf("apple"));
        for (int i =0; i < strList.size(); i++){
            String s = strList.get(i);
            System.out.printf(s);
        }
        for (Iterator<String> it = strList.iterator();  it.hasNext();){
            String s = it.next();
            System.out.println(s);
        }
        for (String s :strList){
            System.out.println(s);
        }
    }
}
