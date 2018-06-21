package com.zgyjyx.student;

public class Demo3_Collection {
    public static void main(String[] args) {
        /*
        * Collection
        *  List(存取有序，有索引，可以重复)
        *   ArrayList 底层是数组实现，线程不安全，查询和修改快，增删慢
        *   LinkedList 底层是链表实现，线程不安全，增删快，查询和修改慢
        *   Vector 底层是数组实现，线程安全的，无论增删改查都慢
        *
        *  如果查找和修改多使用ArrayList，如果增删多，则使用LinkedList
        *
        *  Set(存取无序，无索引，不可以重复)
        *   HashSet 底层是Hash算法实现
        *   LinkedHashSet 底层是链表实现，但是也是可以保证元素唯一
        *   TreeSet 底层二叉树算法实现
        *
        *  一般开发不需要对存储的元素排序，所以在开发的时候大多用HashSet
        *  TreeSet面试的时候比较多，几种排序方法，和几种排序方式的区别
        *
        * Map
        *  HashMap 对key来说是Hash算法，针对键
        *   LinkedHashMap 底层是链表，针对键
        *  TreeMap 底层是二叉树，针对key
        *
        * 开发中还是HashMap最多，TreeMap面试
        *
        * */
    }
}
