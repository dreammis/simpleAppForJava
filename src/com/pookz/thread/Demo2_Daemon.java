package com.pookz.thread;

public class Demo2_Daemon {
    public static void main(String[] args) {
//        demo1();
//        demo2();
        /*
        * yield 让出cpu礼让线程
        * setPriority 设置线程优先级
        *
        * */

    }

    private static void demo2() {
        /*
        * join插队功能
        * */
        final Thread t = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println(getName()+ ": sos");
                }
            }
        };
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    try {
                        /*
                        * join插队功能
                        * 可以加入参数，毫秒
                        * 意味增加1毫秒优先执行
                        * */
                        t.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName()+ ": qoq");
                }
            }
        };

        t.start();
        t1.start();
    }

    private static void demo1() {
        /*
        * 设置守护线程，但是我不太清楚怎么指定某个线程是某个线程的守护线程，还是守护线程守护的就是当前进程的所有线程？
        *
        * 通过查询得知，JVM把线程分为两类，一个守护线程一个用户线程，即自己创建的线程以及main主线程都是用户线程
        * 守护线程是等待所有的用户线程完成后再关闭，并非守护单个线程
        * */
        Thread t = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println(getName()+ ": sos");
                }
            }
        };
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    System.out.println(getName()+ ": qoq");
                }
            }
        };
        // 设置为守护线程
        t1.setDaemon(true);

        t.start();
        t1.start();
    }
}
