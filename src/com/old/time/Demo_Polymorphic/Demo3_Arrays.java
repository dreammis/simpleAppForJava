package com.old.time.Demo_Polymorphic;

import java.util.Arrays;

public class Demo3_Arrays {
    public static void main(String[] args) {
        int[] arr = {33,22,11,44,66,55};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {11,22,33,44,55,66};
        System.out.println(Arrays.binarySearch(arr2, 22));
        System.out.println(Arrays.binarySearch(arr2, 33));
        System.out.println(Arrays.binarySearch(arr2, 44));
        System.out.println(Arrays.binarySearch(arr2, 55));
    }



}
