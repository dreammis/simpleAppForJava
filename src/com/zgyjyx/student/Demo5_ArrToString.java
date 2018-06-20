package com.zgyjyx.student;

public class Demo5_ArrToString {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3,123,54,2532,123,532523,1323,12321,5325,1231,123};
        /*
         * [1,2,3]
         * */

        String s = arrToString(arr1);
        System.out.println(s);

        String sc = "whatfuckisthis";
        System.out.println(reverseString(sc));

        String bigs = "woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma";
        String smalls = "heima";

        int count = countOfSmallInLarge(bigs, smalls);
        System.out.println("small in bigs the count is "+ count);


    }

    private static int countOfSmallInLarge(String bigs, String smalls) {
        int slength = smalls.length();

        int count = 0;
        int index = 0;

        while ((index = bigs.indexOf(smalls)) != -1){
            bigs = bigs.substring(index+slength);
            count++;
        }
        return count;
    }

    private static String reverseString(String sc) {
        char[] arr = sc.toCharArray();

        String tmp = "";
        for (int i = arr.length-1; i >=0 ; i--) {
            tmp +=  arr[i];
//            tmp = tmp.concat(String.valueOf(arr[i]));
        }
        return tmp;
    }

    private static String arrToString(int[] arr){
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            String tmp;
            if (i==0){
                tmp = "["+ arr[i]+ ", ";
            }else if (i == arr.length-1){
                tmp = arr[i]+ "]";
            }
            else{
                tmp = String.valueOf(arr[i]) + ", ";
            }
            s = s.concat(tmp);
        }
        if (arr.length == 0){
            s = "[]";
        }
        return s;
    }


}

