package com.pookz.test;

import java.util.ArrayList;

public class Demo4_LuckyNum {
    public static void main(String[] args) {
        System.out.println(lucky(10));

    }
    public static int lucky(int num){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            arr.add(i);
        }
        int count =1;

        for (int i = 0; arr.size()!=1 ; i++) {
            if (i == arr.size()){
                i = 0;
            }
            if (count %3 ==0){
                arr.remove(i--);
            }
            count ++;
        }

        return arr.get(0);
    }
}
