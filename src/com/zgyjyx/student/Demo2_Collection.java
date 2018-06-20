package com.zgyjyx.student;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2_Collection {
    public static void main(String[] args) {
        /*
         * Collections 中的常见方法
         * Collections.sort
         * binarySearch
         * max
         * reverse
         * shuffle
         *
         * */
        ArrayList<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("c");
        arr.add("d");
        arr.add("e");
        arr.add("q");


//        collectionSort(arr);
//        collectionBinarySearch(arr);
//        collectionMax(arr);
//        collectionReverse(arr);
//        collectionShuffle(arr);
    }

    private static void collectionShuffle(ArrayList<String> arr) {
        Collections.shuffle(arr);
        System.out.println(arr);
    }

    private static void collectionReverse(ArrayList<String> arr) {
        Collections.reverse(arr);
        System.out.println(arr);
    }

    private static void collectionMax(ArrayList<String> arr) {
        System.out.println(Collections.max(arr));
    }

    private static void collectionBinarySearch(ArrayList<String> arr) {
        System.out.println(Collections.binarySearch(arr, "q"));
    }

    private static void collectionSort(ArrayList<String> arr) {
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
