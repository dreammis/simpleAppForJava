package com.pookz.home;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Demo3_Times {
    public static void main(String[] args) throws IOException {
        /*
        * 获取文件中字符出现的次数，并且存储到times.txt中
        *
        * */
        BufferedReader br = new BufferedReader(new FileReader("src/com/pookz/home/demo.txt"));
        TreeMap<Character, Integer> tm = new TreeMap<>();

        int b;
        while((b=br.read())!= -1){
            char s = (char)b ;
            if(tm.containsKey(s)){
                tm.put(s, tm.get(s)+1);
            }else{
                tm.put(s, 1);
            }
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/pookz/home/times.txt"));
        for (Map.Entry<Character, Integer> en:tm.entrySet()) {
            Character key = en.getKey();
            Integer value  = en.getValue();
            bw.write(key+": "+ value);
            bw.newLine();
        }
        bw.close();
    }
}
