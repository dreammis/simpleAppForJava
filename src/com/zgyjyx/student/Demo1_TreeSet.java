package com.zgyjyx.student;

import java.util.*;
import java.util.regex.Pattern;

public class Demo1_TreeSet {
    public static void main(String[] args) {
//        sortByLens();
//        demo1();
//        demo2();
        /*
        * 键盘录入5个学生信息，姓名，语文，数学，英语成绩 按照总分从高到低输出到控制台
        * */

        Scanner sc = new Scanner(System.in);
        ArrayList<String> sarr = new ArrayList<>();

        while(sc.hasNext()&& sarr.size()<5){
            String s = sc.nextLine();
            String[] sar = s.split(",");
            if (sar.length==4){
                for (int i = 1; i < sar.length; i++) {
                    if (!isInteger(sar[i])){
                        System.out.println("输入错了！");
                        break;
                    }
                }

            }else{
                System.out.println("格式不对哦!");
                break;
            }
            sarr.add(s);

        }

        System.out.println(sarr);




    }

    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    class Student{
        private String name;
        private int chinese;
        private int math;
        private int english;

        public Student(String name, int chinese, int math, int english) {
            this.name = name;
            this.chinese = chinese;
            this.math = math;
            this.english = english;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getChinese() {
            return chinese;
        }

        public void setChinese(int chinese) {
            this.chinese = chinese;
        }

        public int getMath() {
            return math;
        }

        public void setMath(int math) {
            this.math = math;
        }

        public int getEnglish() {
            return english;
        }

        public void setEnglish(int english) {
            this.english = english;
        }
    }



    private static void demo2() {
        /*
        * 这种写法定义匿名Comparator
        * */
        TreeSet<Character> sts = new TreeSet<>(new Comparator<Character>(){

            @Override
            public int compare(Character o1, Character o2) {
                return 0;
            }
        });
    }

    private static void demo1() {
        /*
        * 集合中存储了无序且重复的字符串，定义方法，使其有序(字典顺序), 且不去除重复
        * */
        List<String> sl = new ArrayList<>();
        sl.add("aaa");
        sl.add("aaa");
        sl.add("aaa");
        sl.add("qqq");
        sl.add("bb");
        sl.add("cc");
        sl.add("00");

        sortByDict(sl);
        System.out.println(sl);
    }

    public static void sortByDict(List<String> l){
        TreeSet<String> sts = new TreeSet<>(new CompareByNoRepeat());
        sts.addAll(l);
        l.clear();
        l.addAll(sts);
    }

    private static void sortByLens() {
        /*
        * 将字符串按照长度排序
        * */

        TreeSet<String> sts = new TreeSet<>(new CompareByLens());
        sts.add("aaaa");
        sts.add("bbb");
        sts.add("ccc");
        sts.add("dd");
        sts.add("ac");
        System.out.println(sts);
    }

}

class CompareByLens implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        int lens = s1.length() - s2.length();
        return lens == 0?s1.compareTo(s2):lens;
    }
}

class CompareByNoRepeat implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        int lens = s1.length() - s2.length();
        int same = (lens == 0 ? s1.compareTo(s2):lens);
        return same == 0 ? -1 : same;
    }
}
