package com.pookz.test;

import java.util.ArrayList;

public class Demo2_Fib {
    public static void main(String[] args) {
//        fib(10);
        System.out.println(fibt(10));
    }


    private static int fibt(int num){
        if (num == 1||num ==2){
            return 1;
        }else{
            return fibt(num-1)+ fibt(num-2);
        }
    }

    private static void fib(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        if (n == 2){
            arr.add(1);
        }else if (n >2){
            arr.add(1);
            for (int i = 2; i < n; i++) {
                arr.add(arr.get(i-1)+arr.get(i));
            }
        }
        System.out.println(arr);
    }
}
