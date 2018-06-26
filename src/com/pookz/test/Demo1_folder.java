package com.pookz.test;

import java.io.File;
import java.util.Scanner;

public class Demo1_folder {
    private static double size;
    public static void main(String[] args) {
        /*
        * 统计文件夹的大小
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the fucking path:");
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            File f = new File(s);
            if(f.exists()&& f.isDirectory()){
                loopFolder(f);
                break;
            }else{
                System.out.println("What fuck is this？ Type again!");
                continue;
            }
        }
        System.out.println(size+ "bytes");
        System.out.println(size / 1024/1024+ "m");
    }
    private static void loopFolder(File f) {
        for (File f1:f.listFiles()) {
            if (f1.isFile()){
                size += f1.length();
            }else{
                loopFolder(f1);
            }
        }
    }
}
