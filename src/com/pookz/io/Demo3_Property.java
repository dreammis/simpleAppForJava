package com.pookz.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class Demo3_Property {
    public static void main(String[] args) throws IOException {
//        demo1();
        /*
        * 因为Properties 是继承HashTable的，排序是按照hash值，所以是无序的
        * */
        Properties prop = new Properties();
        System.out.println("读取前" +  prop);
        prop.load(new FileInputStream("src/com/pookz/io/config.properties"));
        System.out.println("读取后" + prop);
        prop.setProperty("age", "99");
        // comments 描述文字
        prop.store(new FileOutputStream("src/com/pookz/io/config.properties"), "Config, Mother Fucker");
    }

    private static void demo1() {
        /*
        * 配置文件Properties的用法
        * 我真的不想再看io相关的东西了，想吐了。
        * */
        Properties p = new Properties();
        p.setProperty("name", "wang");
        p.setProperty("age", "12");
        for (Map.Entry<Object, Object> s :p.entrySet()) {
            System.out.println(s.getValue());
        }
    }
}
