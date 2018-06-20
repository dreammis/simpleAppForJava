package com.zgyjyx.student;

import java.util.*;

public class Demo1_Collection {

    public static void main(String[] args) {
//        arrayIterator();
//        listIterator();
//        arrayTrim();
//        objectTrim();
//        arrayGeneric();
//        removeElements();
//        array2Collection();
//        collection2Array();
        twoGroupArray();
    }

    private static void twoGroupArray() {
        /*
        * 二维数组
        *
        * */
        ArrayList<ArrayList<Student>> a  = new ArrayList<>();

        ArrayList<Student> slist1 = new ArrayList<>();
        slist1.add(new Student("1", 1));
        slist1.add(new Student("2", 2));
        slist1.add(new Student("3", 3));

        ArrayList<Student> slist2 = new ArrayList<>();
        slist2.add(new Student("A", 1));
        slist2.add(new Student("B", 2));
        slist2.add(new Student("C", 3));

        a.add(slist1);
        a.add(slist2);

        for (ArrayList<Student> s:a) {
            System.out.println("Group..........");
            for (Student q:s) {
                System.out.println(q.getName() +"......"+q.getAge());
            }
        }
    }

    private static void collection2Array() {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("Q");
        alist.add("X");
        alist.add("Y");

        String[] arr = alist.toArray(new String[10]);
        for (String s:arr) {
            System.out.println(s);
        }
    }

    private static void array2Collection() {
        String[] sarr = {"A", "B", "C", "D"};
        List<String> slist = Arrays.asList(sarr);
        /*slist.add("E"); */ // 数组转集合，是无法再增加其元素的，但是可以使用其方法


        /*
        * int 是基本数据类型，如果是基本数据类型的数组话，转化为ArrayList（集合），会将整个当作一个数组类型去转化
        * */
        int[] iarr = {1,2,3,4,5};
        List irlist = Arrays.asList(iarr); // 这里如果不指定泛型的话，asList默认会认为iarr的类型是int[] arr
        /*List<int[]> irrlist = Arrays.asList(iarr);*/  // 与上一句是相同的效果
        System.out.println(irlist);


        /*
        * 如果想将基本类型的数组转化为单个元素的集合，那么定义的时候就需要声明成引用数据类型
        *
        * */

        Integer[] iarri = {5,4,3,2,1};
        List<Integer> ilisti = Arrays.asList(iarri);
        System.out.println(ilisti);
    }

    private static void removeElements() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("C");
        list.add("E");
        list.add("Q");

        // 普通for

        for (int i = 0; i <list.size() ; i++) {
            if(!"A".equals(list.get(i))){
                list.remove(i--);
            }
        }

        // Iterator
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            if (!"A".equals(s)){
                it.remove();
            }
        }

        System.out.println(list);
    }

    private static void arrayGeneric() {
        ArrayList<String> al = new ArrayList<>();

        al.add("user1");
        al.add("user2");
        al.add("user3");


        Iterator<String> it = al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    private static void objectTrim() {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("liu", 32));
        al.add(new Student("zhang", 33));
        al.add(new Student("sun", 34));
        al.add(new Student("zhang", 33));

        Iterator<Student> it = al.iterator();
        // define new ArrayList
        ArrayList nal = new ArrayList();
        while (it.hasNext()){
            Student s = it.next();
            if (!nal.contains(s)){
                nal.add(s);
            }
        }
        System.out.println(nal);
    }

    private static void arrayTrim() {
        /*
        * 去重
        *
        * */
        ArrayList al = new ArrayList();
        al.add("a");
        al.add("b");
        al.add("a");
        al.add("c");
        al.add("c");
        /*
        * 循环实现
        * */

        ArrayList nal = new ArrayList();

        /*for (Object o:al) {
            if(nal.contains(o)){
                continue;
            }
            nal.add(o);
        }
        System.out.println(nal);*/

        /*
        * Iterator实现
        *
        * */
        Iterator it = al.iterator();
        while (it.hasNext()){
            Object o = it.next();
            if (!nal.contains(o)){
                nal.add(o);
            }
        }
        System.out.println(nal);
    }

    private static void listIterator() {
        /*
        * 中途对list进行操作会造成线程的不安全
        *
        * */


        List list1 = new ArrayList();
        list1.add(new Student("liu", 32));
        list1.add(new Student("zhang", 33));
        list1.add(new Student("sun", 34));
        list1.add(new Student("hu", 35));

        ListIterator it = list1.listIterator();
        while (it.hasNext()){
            Student s = (Student)it.next();
            if ("hu".equals(s.getName())){
                it.add(new Student("hu's son", 12));
            }
        }
        System.out.println(list1);
    }

    private static void arrayIterator() {
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        for (Object o:c1) {
            System.out.println(o);
        }

        Collection c2 = new ArrayList();

        c2.add(new Student("liu", 32));
        c2.add(new Student("zhang", 44));
        c2.add(new Student("sun", 12));
        c2.add(new Student("hu", 35));

        for (Object o :c2) {
            Student s = (Student)o;
            System.out.println(s.getName()+"今年有"+s.getAge()+"岁高寿啦!!!");
        }

        Iterator it1 = c1.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
            System.out.println((String)it1.next());
        }

        Iterator it2 = c2.iterator();
        while (it2.hasNext()){
            Student s = (Student)it2.next();
            System.out.println(s.getName()+"今年有"+s.getAge()+"岁低龄啦!!!");

        }
    }
}
