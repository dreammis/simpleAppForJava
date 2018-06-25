package com.pookz.file;

import java.io.*;

public class Demo3_ImageWithP {
    public static void main(String[] args) throws IOException {
        /*
        * 通过位移改变写入的字节流，实现对图片文件的加密处理
        * */
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/com/pookz/file/buff.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/com/pookz/file/buff_copy.jpg"));

        int b;
        while((b=bis.read())!= -1){
            bos.write(b ^ 123);
        }

        bis.close();
        bos.close();

    }
}
