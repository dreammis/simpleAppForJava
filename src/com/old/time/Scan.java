package com.old.time;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数");
//        int x = sc.nextInt();
//        System.out.println(x);
//        System.out.println("请输入第二个整数");
//        int y = sc.nextInt();
//
//        int max = (x>y)? x:y;
//        System.out.println("最大值为 "+max);
        int sum = 0;
        for (int i=1; i<=100; i++){
            sum += (i%2 == 0)? 0:i;
            System.out.println("1-10开始: " + i);
        }
        System.out.println("和为： "+sum);
        
        int j = 1;
        while (j<=100){
            System.out.println("1-100开始: "+j);
            j++;
        }

//        for (int i=10; i>=1; i--){
//            System.out.println("10-1开始: "+i );
//        }
    }
}
