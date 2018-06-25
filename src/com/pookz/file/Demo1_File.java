package com.pookz.file;

import java.io.File;
import java.io.IOException;

public class Demo1_File {
    /*
    *
    * 计算文件夹中含有多少后缀为java的文件
    *
    * */
    static int count = 0;
    public static void main(String[] args) {
        File f = new File("D:\\pookz\\simpleApp\\src\\com\\pookz\\file\\tmp.txt");
        File p = new File("D:\\pookz\\simpleApp\\src");
        File[] files = p.listFiles();
        for (File file:files) {
            loopPath(file);
        }
        System.out.println(count);
    }

    private static void loopPath(File f){

        if (f.isDirectory()&& f.listFiles() != null){
            for(File file: f.listFiles()){
                loopPath(file);
            }
        }else{
            if (f.getName().endsWith(".java")){
                System.out.println(f.getName());
                count++;
            }
        }
    }
}
