package com.zgyjyx.student;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1_Rex {
    public static void main(String[] args) {
//        rex4One();
//        demo1("liu.xing.wang.song.li.ming", "\\.");
//        StringSort();
//        split1122();
//        toUsePattern();

        /*
        * 匹配手机号
        * */

        String phone = "老大的手机号是15658023631, 老婆的电话是15658023371, 除此之外还有个电话号码比较叼15658023333";

        String regex = "[1-9]\\d{10}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(phone);

        while (m.find()){
            System.out.println(m.group());
        }
    }

    private static void toUsePattern() {
        String s = "a,b,c,d,e,f,g";
        Pattern p = Pattern.compile("\\w+(,\\w+)*");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        System.out.println(b);
    }

    private static void split1122() {
        /*
        * split 分组
        * 1. sdqqfgkkkhjppppkl
        * 2. 我我....我..我我我...要要....要学....学...你妈....了个...逼逼逼逼....逼！
        *
        * */

        String s = "快快乐乐";
        System.out.println(s.matches("(.)\\1(.)\\2"));

        String s2 = "快乐快乐";
        System.out.println(s2.matches("(..)\\1"));


        String s1 = "sdqqfgkkkhjppppkl";
        String[] arr = s1.split("(.)\\1+");
        for (String anArr : arr) {
            System.out.println(anArr);
        }

        String s3 = "我我....我..我我我...要要....要学....学...你妈....了个了个了个...逼逼逼逼....逼！";
        String[] arr3 = s3.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(String istring: arr3){
            sb.append(istring);
        }
        String s4 = sb.toString().replaceAll("(.)\\1*", "$1").replaceAll("(..)\\1+", "$1");
        System.out.println(s4);
    }

    private static void StringSort() {
        String s = "91 27 46 38 50";
        String[] arr = s.split(" ");
        int[] intarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intarr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(intarr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intarr.length; i++) {
            if (i == (intarr.length -1)){
                sb.append(intarr[i]);
            }else {
                sb.append(intarr[i]).append(" ");
            }
        }
        System.out.println(sb.toString());
    }

    private static void demo1(String s, String s2) {
        String names = s;
        String[] arr = names.split(s2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void rex4One() {
        String qq = "5006150055";
        System.out.println(qq + ": "+checkQQ(qq));

        System.out.println(qq.matches("[1-9]\\d{4,14}"));

        System.out.println("".matches(".*[5]?"));

        demo1("liu xing wang qian sun", " ");
    }


    public static boolean checkQQ(String qq){
        /*
        * 1. 5-15数字
        * 2. 0不能开头
        * 3. 必须都是数字
        * */
        boolean flag = true;

        if (qq.length() >= 5 && qq.length()<=15){
            if (!(qq.startsWith("0"))){
                char[] arrc = qq.toCharArray();
                for (int i = 0; i <arrc.length ; i++) {
                    if (!(arrc[i] >='0' && arrc[i] <='9')){
                        flag = false;
                        break;
                    }
                }
            }else{
                flag = false;
            }
        }else{
            flag = false;
        }
        return flag;
    }

}
