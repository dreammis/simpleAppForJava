package com.pookz.file;


import java.io.*;
import java.util.ArrayList;

public class Demo4_Reader {
    public static void main(String[] args) throws IOException {
        /*
        * 读取字节使用FileInputStream
        * 读取字符使用FileReader
        *
        * 写入字节使用FileOutputStream
        * 写入字符使用FileWriter
        *
        * 字符的缓冲区对象是
        * BufferedReader 以及BufferedWriter
        *
        *
        * */
        //倒序文件
        //#1这里对于关流的一个原则就是，用到了再开，用完就立马关
        BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
        ArrayList<String> arr =  new ArrayList<>();

        String line;
        while((line=br.readLine())!=null){
            arr.add(line);
        }
        br.close(); // 遵循#1
        BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt")); // // 遵循#1
        for (int i = arr.size()-1; i >=0 ; i--) {
            bw.write(arr.get(i));
            bw.newLine();
        }
        bw.close(); // 遵循#1


    }
}
