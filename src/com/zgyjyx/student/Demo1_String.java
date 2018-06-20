package com.zgyjyx.student;

public class Demo1_String {
    public static void main(String[] args) {
        String s1 =  new String("usb");
        System.out.println(s1);

        byte[] arr1 = {97, 98, 99};

        String s2 = new String(arr1);
        System.out.println(s2);

        byte[] arr2 = {97, 98, 99, 100, 101};

        String s3 = new String(arr2, 0, arr2.length);
        System.out.println(s3);

        char[] arr3 = {'a', 'b', 'c', 'd', 'e'};
        String s4 = new String(arr3);
        System.out.println(s4);
    }

}
