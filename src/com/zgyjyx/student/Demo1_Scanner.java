package com.zgyjyx.student;

import java.util.Scanner;

public class Demo1_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int i  = sc.nextInt();
            System.out.println(i);
        }


    }

}
