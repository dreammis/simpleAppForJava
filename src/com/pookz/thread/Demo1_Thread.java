package com.pookz.thread;

public class Demo1_Thread {
    public static void main(String[] args) {
//        demo1(); // 常规调用方式
//        demo2(); // 匿名对象调用方式


    }

    private static void demo2() {
        /*
        * 使用匿名对象
        * */

        Thread t = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    System.out.println(this.getName()+ ": sos");
                }
            }
        };
        t.start();

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                Thread c = Thread.currentThread();
                for (int i = 0; i <1000 ; i++) {
                    System.out.println(c.getName()+ ": qoq");
                }
            }
        });
        t2.start();
    }


    private static void demo1() {
        /*
        * 创建线程的两种方式
        * 1. 类继承Thread
        *   使用直接new对象，然后调用start方法即可
        * 2. 类实现Runnable接口
        *   使用使用Thread包装该类，调用start即可
        * */

        // choose 1
        MyThread mt = new MyThread();
        mt.start();

        //choose 2
        Thread mt2 = new Thread(new MyThread2());
        mt2.start();


        for (int i = 0; i <1000 ; i++) {
            System.out.println(Thread.currentThread().getName()+ ": qoq");
        }
    }
}

class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println(this.getName()+ ": sos");
        }
    }
}

class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println(Thread.currentThread().getName()+ ": xox");
        }
    }
}