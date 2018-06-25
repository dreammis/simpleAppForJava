package com.pookz.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1_Io {
    /*
     * 字符流的抽象父类
     * InputStream
     * OutputStream
     *
     * 字符流的抽象父类
     * Reader
     * Writer
     *
     * 使用前导包
     * 使用中进行io异常处理
     * 使用后记得释放资源
     *
     * */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/com/pookz/io/demo.txt");
        // read
        /*
        int b;
        while((b = fis.read()) != -1){
            System.out.println(b);
        }
        */
        /*
        * 拷贝文件的方式
        * 由于文件存储是字节byte形式的，直接循环拷贝效率很低，所以考虑使用byte数组存储然后一次性传输
        *
        * 但是在大文件上，由于将文件的byte存储到数组会占用很大的内存空间，所以考虑使用小byte数组去传输
        * inputStream的read方法，可以返回文件读取的指针位置，那么搭配outputStream的write设定偏移量去存
        * 一般来说小数组的设定为1024的倍数
        *
        * */
        //read && write
        FileOutputStream fos = new FileOutputStream("src/com/pookz/io/out.txt");
        byte[] by = new byte[1024*2];
        int len;
        while((len=fis.read(by))!=-1){
            fos.write(by, 0, len);
        }
        fis.close();
        fos.close();

    }
}
