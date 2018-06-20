package com.zgyjyx.student;

import java.util.*;

public class Demo1_Map {
    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
//        demo4();
//        demo5();
//        demo6();
//        demo7();
//        demo8();
//        demo9();


    }

    private static void demo9() {
        /*
        *
        * HashMap和Hashtable的区别
        * 共同点：
        * 底层都是hash算法，都是双列集合
        * 区别：
        * 1. HashMap是线程不安全的，效率高，在jdk1.2版本之后才优化出现的
        *   Hashtable是现成安全的，效率低，在jdk1.0版本就出现了
        * 2. HashMap可以存储null键以及null值
        *   Hashtable不可以存储null键和值
        * */
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("fuck", 1);
        /*
        * ht.put(null, null) is error!
        * */
    }

    private static void demo8() {
        /*
        * 统计字符串每个字符串出现的次数
        *
        * */
        String s = "abbcccddddeeeeeffffffzzzzzzzzxxxxxxxxx";
        char[] slist = s.toCharArray();
        TreeMap<Character, Integer> map = new TreeMap<>();

        for (Character c:slist) {
            int baseint;
            if (map.containsKey(c)){
                baseint = map.get(c)+1;
            }else{
                baseint = 1;
            }
            map.put(c, baseint);
            /*
            * 这里可以简写
            * map.put(c, !map.containsKey(c)?1:map.get(c)+1);
            * */
        }
        System.out.println(map);
    }

    private static void demo7() {
        /*
        * TreeMap使用匿名比较器来排序
        *
        * */
        TreeMap<Girl, String> tm = new TreeMap<>(new Comparator<Girl>() {
            @Override
            public int compare(Girl o1, Girl o2) {
                int num = o1.getAge() - o2.getAge();
                return num == 0 ? 1: num;
            }
        });

        tm.put(new Girl("翠兰", 13), "拱墅区");
        tm.put(new Girl("名妓", 19), "西湖区");
        tm.put(new Girl("妖艳", 19), "上城区");
        tm.put(new Girl("贱货", 22), "上城区");
        System.out.println(tm);
    }

    private static void demo6() {
        /*
        * TreeMap 通过重写自定义对象Girl的CompareTo来排序
        *
        * */
        TreeMap<Girl, String> tm = new TreeMap<>();
        tm.put(new Girl("翠兰", 13), "拱墅区");
        tm.put(new Girl("名妓", 19), "西湖区");
        tm.put(new Girl("妖艳", 19), "上城区");
        tm.put(new Girl("贱货", 22), "上城区");
        System.out.println(tm);
    }

    private static void demo5() {
        /*
        * 有序的map
        * */
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("儿子", 12);
        lhm.put("张三", 32);
        lhm.put("兄弟", 22);
        System.out.println(lhm);
    }

    private static void demo4() {
        /*
        * key为自定义类的话，需要重写hashCode和equals方法
        *
        * */

        Map<Girl, String> map = new HashMap<>();
        map.put(new Girl("翠兰", 13), "拱墅区");
        map.put(new Girl("名妓", 19), "西湖区");
        map.put(new Girl("名妓", 19), "上城区");
        map.put(new Girl("探花", 22), "下城区");
        System.out.println(map);
    }

    private static void demo3() {
        /*
        * 使用EntrySet方式遍历Map
        *
        * */
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 32);
        map.put("兄弟", 22);
        map.put("儿子", 12);

        System.out.println("--------------------------iterator-------------------------");

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();

        while (it.hasNext()){
            Map.Entry<String, Integer> en = it.next();
            String key  = en.getKey();
            Integer value = en.getValue();
            System.out.println("key: "+ key+ "   value: "+ value);
        }

        System.out.println("--------------------------foreach-------------------------");

        for (Map.Entry<String, Integer> en:map.entrySet()) {
            String key = en.getKey();
            Integer value  = en.getValue();
            System.out.println("key: "+ key+ "   value: "+ value);
        }
    }

    private static void demo2() {
        /*
        *
        * 通过key来遍历map集合
        *
        * */
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 32);
        map.put("兄弟", 22);
        map.put("儿子", 12);

        /*
        * 使用iterator的方式遍历
        * */

        Set<String> set =  map.keySet();
        Iterator<String> it = set.iterator();
        System.out.println("--------------------------iterator-------------------------");
        while(it.hasNext()){
            String key = it.next();
            System.out.println("key: "+ key+ "   value: "+ map.get(key));
        }
        System.out.println("---------------------------foreach------------------------");

        for (String key: set) {
            System.out.println("key: "+ key+ "   value: "+ map.get(key));
        }
    }

    private static void demo1() {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 32);
        map.put("兄弟", 22);
        map.put("儿子", 12);
        System.out.println(map);
        System.out.println("map's size is "+ map.size());
    }
}

