package com.zgyjyx.student;

public class Demo3_ToString {
    public static void main(String[] args) {
        Student s = new Student("Paul", 32);
        Student d = new Student("Paul", 33);

        System.out.println(s.toString());
        System.out.println(d.toString());

        System.out.println(s.equals(d));

        System.out.println(s.hashCode());
        System.out.println(d.hashCode());

        char[] arr1 = {'1','2','3','4'};
        String s1 = String.valueOf(arr1);
        System.out.println(s1);

        String s3 = String.valueOf(s);
        System.out.println(s3);

        /*
        <meta name="pdfkit-page-size" content="A4"/>
        <meta name="pdfkit-margin-top" content="0mm"/>
        <meta name="pdfkit-margin-right" content="0mm"/>
        <meta name="pdfkit-margin-bottom" content="0mm"/>
        <meta name="pdfkit-margin-left" content="0mm"/>
        */
    }
}
