package com.old.time;

public class one21 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4, 0, 9, 10, 8, 20, 11};
        System.out.println(ArrayTool.getMax(arr));
//        com.old.time.ArrayTool.getArray(arr);


        ArrayTool.reverseArray(arr);
        for(int item: arr){
            System.out.print(item);
        }

    }
}
