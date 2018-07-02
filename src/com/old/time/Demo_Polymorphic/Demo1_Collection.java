package com.old.time.Demo_Polymorphic;

import java.util.*;

public class Demo1_Collection {
    public static void main(String[] args) {
//        collectionFirst();
//        collectionSecond();
//        collectionThree();
//        collectionFour();
//        collectionList();

        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("world");

        /*
        * 这样会报并发错误
        * 因为list是一个线程在控制
        * 传入iterator之后，list增加了元素，而控制iterator的线程并不知道，会报错
        * 解决方法可以使用List专用的ListIterator
        *
        *
        * */

        /*Iterator it = list.iterator();
        while(it.hasNext()){
            String str = (String)it.next();
            if ("world".equals(str)){
                list.add("javaee");
            }
        }*/
        
        ListIterator it = list.listIterator();
        while (it.hasNext()){
            String str = (String)it.next();
            if("world".equals(str)){
                it.add("javaee");
            }
        }

        System.out.println(list);





        /*
        另一种实现方式
        if (!(list.contains("a"))){
           list.add("javaee");
        }

        System.out.println(list);
        */


    }

    private static void collectionList() {
        // 日常开发中一般都是ArrayList list = new ArrayList()
        // 这里主要是为了展示List中特有的方法，所以才用List引用
        // 多态的主要用法还是用作参数传递才能体现其作用
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(0, "1");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }

    private static void collectionFour() {
        Collection c = new ArrayList();
        c.add(new Person("张三"));
        c.add(new Person("傻吊"));
        c.add(new Person("二笔"));

        Iterator it = c.iterator();
        while (it.hasNext()){
            System.out.println(((Person) it.next()).getName());
        }
    }

    private static void collectionThree() {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        c.add("e");
        c.add("f");

        Collection c1 = new ArrayList();
        c1.add(true);
        c1.add(true);
        c1.add(true);
        c1.add(false);
        c1.add(false);
        c1.add(false);
        c1.add("f");
        c.addAll(c1);
        System.out.println(c);

        System.out.println(c.removeAll(c1)); // 去除交集

        System.out.println(c.contains(c1));

        /*
        *
        * 这里有点诡异
        * c   retainAll 如果c没有改变，那么就返回true,如果改变则返回false
        *
        *
        * */
        System.out.println(c.retainAll(c1));  //取交集
    }

    private static void collectionSecond() {
        Collection c = new ArrayList();
//        c.add("a");
//        c.add("b");
//        c.add("c");
//        c.add("d");

        c.add(new Person("Paul"));
        c.add(new Person("Lucy"));
        c.add(new Person("Lily"));
        c.add(new Person("Marty"));

        Object[] arr = c.toArray();
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void collectionFirst() {
        // List 有序 有索引 可以存储重复的
        /*
        * ArrayList
        * LinkedList
        * VectorList
        * */
        // Set 无序 没有索引 不允许有重复的
        /*
         * HashSet
         * TreeSet
         * */
        Collection c = new ArrayList();
        c.add("qqq");
        c.add("qqq");
        c.add(true); //new Boolean(true)
        c.add(100);
        c.add(new Person("妹妹"));
        System.out.println(c);
        c.remove("qqq");
        System.out.println(c);
        System.out.println(c.contains(true));


        c.clear();
        System.out.println(c);
    }
}
