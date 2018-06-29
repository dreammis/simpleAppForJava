package com.old.time;//public class com.old.time.World {
//    public static void main(String[] args){
//        System.out.println("what fuck");
//    }
//}


class FreshJuice {
    enum FreshJuiceSize{SMALL, MEDIUM, LARGE}
    FreshJuiceSize size;
}

public class World{
    /**
     * Color bgColor = Color.Red
     * @param args
     */
    // Color bgColor = Color.Red wefewrew
    public static void main(String[] args){
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;


        int[] arr = {1,2,3,4,5};
        for (int i = 0; i <arr.length-1 ; i++) {
            System.out.println(arr[i]);

        }
    }
}