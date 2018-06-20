package com.zgyjyx.student;

import java.util.*;

public class Demo1_HashSet {
    public static void main(String[] args) {
        /*hashSetDemo1();*/
        /*linkedHashSetDemo1();*/
        /*randomHashSet();*/
        /*stringTrim();*/
        /*collectionTrim();*/


        /*
        * TreeSet 可以用来给元素排序，也可以保持唯一
        * 需要实现Comparable接口中的compareTo方法
        * compareTo return 0 则两者是相同项
        * compareTo return 1 怎么存就怎么取，和存的顺序一致
        * compareTo return -1 倒着来
        *
        * */

        TreeSet<Student> its = new TreeSet<>();
        its.add(new Student("老张", 22));
        its.add(new Student("老李", 32));
        its.add(new Student("老王", 42));
        its.add(new Student("老孙", 52));
        its.add(new Student("老朱", 62));

        System.out.println(its);
    }

    private static void collectionTrim() {
        /*
        * 集合中重复的元素去除
        *
        * */

        List<Integer> ilist = new ArrayList<>();
        // add 0-4
        for (int i = 0; i <5 ; i++) {
            ilist.add(i);
        }
        ilist.add(1);
        ilist.add(2);
        ilist.add(3);
        System.out.println("处理前的list:   \n" + ilist);

        HashSet<Integer> ihs = new HashSet<>(ilist);

        ilist.clear();
        ilist.addAll(ihs);

        System.out.println("处理后的list:    \n"+ ihs);
    }

    private static void stringTrim() {
        String s = "abfsdbfsdfsdfwejrwejrwasafsdvbvb";
        char[] carr = s.toCharArray();
        HashSet<Character> chs = new HashSet<>();
        for (Character c:carr) {
            chs.add(c);
        }
        System.out.println(chs);
    }

    private static void randomHashSet() {
        /*
        * 获取10个1-20的随机数，要求不能重复
        *
        * */
        HashSet<Integer> ihs = new HashSet<>();
        Random r = new Random();
        int count = 0;
        while(ihs.size()<=10){
            ihs.add(r.nextInt(20)+1);
            count++;
        }

        System.out.println(ihs);
        System.out.println("random了"+count+"次!");
    }

    private static void linkedHashSetDemo1() {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("q");
        lhs.add("w");
        lhs.add("e");
        lhs.add("r");
        lhs.add("q");

        for (String s :lhs) {
            System.out.println(s);
        }
    }

    private static void hashSetDemo1() {
        HashSet<String> hs = new HashSet<>();
        hs.add("s");
        /*System.out.println(hs);*/

        /*
        * HashSet 在作用于自定义的对象中时，是使用自定义类中的hashCode
        * 1. 如果hashCode计算出来的hash值是不同的那么就是不同的对象，如果hash值是相同的，则会调用equals方法去比较俩对象是否相同
        * 所以在自定义类中应该去overwrite hashCode方法，以及equals方法，使其能去除想要的重复！
        *
        * */

        HashSet<Student> hss = new HashSet<>();
        hss.add(new Student("wang", 33));
        hss.add(new Student("sun", 32));
        hss.add(new Student("qian", 31));
        hss.add(new Student("wang", 33));
        Iterator<Student> its = hss.iterator();

        while(its.hasNext()){
            Student s = its.next();
            System.out.println(s.getName());
        }

        for (Student s : hss) {
            System.out.println(s.getName());
        }
    }
}
