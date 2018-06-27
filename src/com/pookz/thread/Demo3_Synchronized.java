package com.pookz.thread;

public class Demo3_Synchronized {
    public static void main(String[] args) {
        /*
        * 1. synchronized用来修饰方法
        * 意思是多线程时，这段代码是要求同步执行完才会释放给其他线程
        *
        * 2. 同步代码块
        *
        * */
        Printer p = new Printer();
        new Thread(() -> {
            for (int i = 0; i <1000 ; i++) {
                p.print1();
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i <1000 ; i++) {
                p.print2();
            }
        }).start();
    }
}

class Printer{
    /*
    * synchronized修饰方法 适用于非静态方法
    * 非静态的同步方法的锁对象是this
    * */
     /*synchronized public void print1(){
         System.out.print("what");
         System.out.print(" fuck");
         System.out.print(" is");
         System.out.print(" this");
         System.out.print("\r\n");
    }

    public void print2(){
         synchronized (this) {
             System.out.print("shoot");
             System.out.print(" this");
             System.out.print(" mother");
             System.out.print(" fucker");
             System.out.print("\r\n");
         }
    }*/

     /*
     * 同步代码块
     *
     * */
    /*Object o = new Object();
    public void print1(){
        synchronized (o){
            System.out.print("what");
            System.out.print(" fuck");
            System.out.print(" is");
            System.out.print(" this");
            System.out.print("\r\n");
    }}
    public void print2(){
        synchronized (o){
            System.out.print("shoot");
            System.out.print(" this");
            System.out.print(" mother");
            System.out.print(" fucker");
            System.out.print("\r\n");
        }}*/

     public static synchronized void print1(){
         System.out.print("what");
         System.out.print(" fuck");
         System.out.print(" is");
         System.out.print(" this");
         System.out.print("\r\n");
    }

    public static void print2(){
         synchronized (Printer.class) {
             System.out.print("shoot");
             System.out.print(" this");
             System.out.print(" mother");
             System.out.print(" fucker");
             System.out.print("\r\n");
         }
    }
}