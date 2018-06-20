package com.zgyjyx.student;

public class Demo1_Array {
    public static void main(String[] args) {

        System.out.println("--------------BubbleSort------------");
        int[] arr4Bubble = {24, 13,5,7,90,123, 79};
        bubbleSort(arr4Bubble);
        StringBuilder sb4Bubble = arr2StringBuilder(arr4Bubble);
        System.out.println(sb4Bubble);

        System.out.println("--------------selectSort------------");


        int[] arr4Select = {131,4,5,6,324,123,6234,161,12,55,177};
        selectSort(arr4Select);
        StringBuilder sb4Select = arr2StringBuilder(arr4Select);
        System.out.println(sb4Select);

        System.out.println("--------------binarySearch------------");

        int[] arr4binarySearch = {10,15,19,20,30,45};
        System.out.println(binarySearch(arr4binarySearch, 45));

        System.out.println("--------------binarySearchRecursion------------");

        int[] arr4binarySearchRecursion = {10,15,19,20,30,45,90,101,203,303,442,1555,2010};
//        System.out.println(binarySearchRecursion(arr4binarySearchRecursion,0, arr4binarySearchRecursion.length, 45));

        System.out.println("--------------binarySearchWhile------------");

        int[] arr4binarySearchWhile = {10,15,19,20,30,45,90,101,203,303,442,1555,2010};
        System.out.println(binarySearchWhile(arr4binarySearchWhile,45));



    }

    private static StringBuilder arr2StringBuilder(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <=arr.length-1 ; i++) {
            if (i == arr.length-1){
                sb.append(arr[i]).append("]");
            }
            else {
                sb.append(arr[i]).append(", ");
            }

        }
        return sb;
    }

    private static void bubbleSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int tmp;
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }

            }

        }
    }

    private static void selectSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[i]>arr[j]){
                    int tmp;
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    private static int binarySearch(int[] arr, int value){
        if (arr.length==0){
            return -1;
        }
        int low = 0; // 低下标
        int hight = arr.length -1; //高下标
        int mid = arr.length /2;  //中下标

        if (arr[mid] == value) {
            return mid;
        }else if (arr[mid] > value){
            for (int i = low; i <mid ; i++) {
                if (arr[i] == value){
                    return i;
                }
            }
        }else{
            for (int i = mid; i <= hight ; i++) {
                if (arr[i] == value){
                    return i;
                }
            }

        }
        return -1;
    }

//    private static int binarySearchRecursion(int[] arr, int low, int hight, int value){
//        if (arr.length==0 || low>hight){
//            return -1;
//        }
//
//        int mid = hight/2;
//        if (arr[mid] == value) {
//            return mid;
//        }else if (arr[mid] > value){
//            binarySearchRecursion(arr, low, mid-1, value);
//        }else{
//            binarySearchRecursion(arr, mid+1, hight, value);
//        }
//        return -1;
//
//
//    }

    private static int binarySearchWhile(int[] arr, int value){
        int min = 0;
        int max = arr.length -1;
        int mid = (min+max)/ 2;

        while(arr[mid]!= value){
            if (min > max){
                return -1;
            }
            if (arr[mid] > value) {
                max = mid -1;
            }else {
                min = mid +1;
            }
            mid = (min+max)/2;
        }


        return mid;
    }
}
