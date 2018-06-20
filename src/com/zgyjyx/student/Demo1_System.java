package com.zgyjyx.student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.CancellationException;

public class Demo1_System {
    public static void main(String[] args) throws ParseException {
//        gcInital();
//        systemExit();
//        caculateStamp();
//        copyArrary();
//        dateFormat();
//        howLongWhatIlive();
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

    }

    private static void howLongWhatIlive() throws ParseException {
        String birth = "1987/12/23";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date d = sdf.parse(birth);
        Date now = new Date();
        long days =(now.getTime() - d.getTime()) /1000/60/60/24;
        long years = (now.getTime() - d.getTime()) /1000/60/60/24/365;

        System.out.println("活了"+days +"天, " + "活了" + years+ "年！");
    }

    private static void dateFormat() {
        Date d1 = new Date();
        System.out.println(d1);

        Date d2 = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(df.format(d2));
    }

    private static void copyArrary() {
        int [] arr1 = {11,22,3,4,5,6,7};
        int [] arr2 = new int[arr1.length];
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        Arrays.sort(arr2);
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println("arr1:" + arr1[i]);
            System.out.println("arr2:" + arr2[i]);
        }
    }

    private static void caculateStamp() {
        long start = System.currentTimeMillis();
        for (int i = 0; i <100001 ; i++) {
            System.out.print(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void systemExit() {
        System.out.println("11111111111");
        System.exit(0);
        System.out.println("11111111111");
    }

    private static void gcInital() {
        new Demo();
        System.gc();
    }
}

class Demo extends Object{

    protected void finalize(){
        System.out.println("I come for the rubbish!");
    }
}
