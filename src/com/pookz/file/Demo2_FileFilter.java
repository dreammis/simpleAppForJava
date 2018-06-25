package com.pookz.file;

import java.io.File;
import java.io.FilenameFilter;

public class Demo2_FileFilter {
    public static void main(String[] args) {
        File f = new File("D:\\pookz\\simpleApp\\src");

        File[] files = f.listFiles(new FilenameFilter(){

            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        });
        for (File file:files) {
            System.out.println(file);
        }
    }
}
