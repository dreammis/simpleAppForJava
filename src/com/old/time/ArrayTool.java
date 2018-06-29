package com.old.time; /*
  *com.old.time.ArrayTool
  * @author liu
  * @ version v1.0
  * */

public class ArrayTool {
    /*
    * private
    * */
    private ArrayTool(){};

    public static int getMax(int [] arr){
        int max = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void getArray(int [] arr){
        for (int item: arr){
            System.out.println(item);
        }
    }

    public static void reverseArray(int [] arr){
        for (int i=0; i<(arr.length/2); i++){
            int tmp = arr[i];
            arr[i] = arr[arr.length -1- i];
            arr[arr.length -1 - i] = tmp;
        }
    }

}
