package com.pookz.test;

import java.math.BigInteger;

public class Demo3_Factorial {
    public static void main(String[] args) {
        /*
        * 求1000的阶乘中，含有多少个0
        * */

        BigInteger bi = new BigInteger("1");

        for (int i = 1; i <=1000 ; i++) {
            bi = bi.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bi);
        int num=0;
        /*
        转char数组 plan1
        char[] arr  = bi.toString().toCharArray();

        for (char c: arr){
            if (c == '0'){
                num+= 1;
            }
        }
        */
        /*
        plan2
        String s = bi.toString();
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i) == '0'){
                num += 1;
            }
        }*/

        /*
        * 求尾部有多少个0
        * */
        String s = bi.toString();
        for (int i = s.length()-1; i >=0; i--) {
            if (s.charAt(i) == '0'){
                num++;
            }else{
                break;
            }
        }

        System.out.println(num);
    }
}
