package com.pookz.home;

import java.io.*;

public class Demo1_IO {
    public static void main(String[] args) throws IOException {
//        demo1();
//        demo2();
//        demo3();
        /*
        * 正常是需要关闭流的，比如写入流，输出流
        * 在1.7jdk中有了新的写法
        * 因为FileInputStream 以及 FileOutputStream都集成了closeable接口
        * 如果想自定义类也如此写法，则需要集成Closeable接口，然后重写close方法即可
        * */

        try(
                FileInputStream fis =new FileInputStream("111");
                FileOutputStream fos =new FileOutputStream("222");
                ){
            int b;
            while((b=fis.read()) != -1){
                fos.write(b);
            }
        }




    }

    private static void demo3() throws IOException {
        /*
        * FileOutputStream 写入中文
        *
        * */
        FileOutputStream fos = new FileOutputStream("src/com/pookz/home/zzz.txt");

        fos.write("我比较好骗，请不要骗我".getBytes());
        fos.close();
    }

    private static void demo2() throws IOException {
        /*
        * 字符流读取中文，可能在读取中文的时候读到半个中文，造成乱码
        * */
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/com/pookz/home/chinese"));
        byte[] arr = new byte[3];
        int len;

        while((len=bis.read()) != -1){
            System.out.println(new String(arr, 0, len));
        }
        bis.close();
    }

    private static void demo1() throws IOException {
        /*
        * 使用BufferStream更加高效，在输入以及输出的过程中增加缓冲区
        * */
        FileInputStream fis = new FileInputStream("src/com/pookz/home/Lucette - Bobby Reid.mp3");
        FileOutputStream fos = new FileOutputStream("src/com/pookz/home/copy.mp3");

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int b;

        while((b=bis.read())!= -1){
            bos.write(b);
        }
        bis.close();
        bos.close();
    }
}
