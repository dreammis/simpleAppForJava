package com.pookz.file;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class Demo5_SequenceInputStream {
    public static void main(String[] args) throws IOException{
//        demo1();
//        demo2();
        /*
        * 定义文件输入流 ，调用read(byte[] b)方法，将a.txt文件中的内容打印出来(byte数组大小为5)
        * */
        FileInputStream fis = new FileInputStream("a.txt");
        ByteArrayOutputStream bais = new ByteArrayOutputStream();

        byte[] arr = new byte[5];
        int len;

        while((len = fis.read(arr))!= -1){
            bais.write(arr, 0, len);
        }
        fis.close();
        System.out.println(bais);
    }

    private static void demo2() throws IOException {
        /*
        * 当多个流对象要这么做，那么也是使用SequenceInputStream，但是可以传入枚举类型的
        * */
        FileInputStream fis = new FileInputStream("a.txt");
        FileInputStream fis1 = new FileInputStream("b.txt");
        FileInputStream fis2 = new FileInputStream("c.txt");

        Vector<FileInputStream> v = new Vector<>(); //创建集合对象，存储流对象
        v.add(fis);
        v.add(fis1);
        v.add(fis2);
        Enumeration<FileInputStream> e = v.elements();

        SequenceInputStream sis = new SequenceInputStream(e);
        FileOutputStream fos = new FileOutputStream("d.txt");
        int b;
        while((b=sis.read())!= -1){
            fos.write(b);
        }
        sis.close();
        fos.close();
    }

    private static void demo1() throws IOException {
        /*
        * 当两个流去读取文件写入同一个文件中，那么可以使用SequenceInputStream去装饰
        * */
        FileInputStream fis = new FileInputStream("a.txt");
        FileInputStream fis1 = new FileInputStream("b.txt");

        SequenceInputStream sis = new SequenceInputStream(fis, fis1);
        FileOutputStream fos = new FileOutputStream("c.txt");

        int b;
        while((b=sis.read())!= -1){
            fos.write(b);
        }
        sis.close();
        fos.close();
    }

}
