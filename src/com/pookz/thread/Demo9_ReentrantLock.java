package com.pookz.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo9_ReentrantLock {
    public static void main(String[] args) {
        /*
         * JDK1.5之后增加的互斥锁
         * 新建ReentrantLock
         * 可以创建线程状态 使用newCondition来创建，然后去控制Condition的await以及signal即可
         *
         * */

        PrinterWait3 pw = new PrinterWait3();

        new Thread(() -> {
            while (true){
                try {
                    pw.print1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            while (true){
                try {
                    pw.print2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            while (true){
                try {
                    pw.print3();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}

class PrinterWait3 {
    /*
     * */
    private ReentrantLock r = new ReentrantLock();
    private Condition c1 = r.newCondition();
    private Condition c2 = r.newCondition();
    private Condition c3 = r.newCondition();
    private int flag = 1;

    public void print1() throws InterruptedException {
        r.lock(); //获取锁
        String name = Thread.currentThread().getName();
        while (flag != 1) c1.await();
        System.out.print(name + ": ");
        System.out.print("I");
        System.out.print(" Love");
        System.out.print(" U");
        System.out.print("\r\n");
        Thread.sleep(1000);
        flag = 2;
        c2.signal();
        r.unlock(); // 释放锁
    }

    public void print2() throws InterruptedException {
        String name = Thread.currentThread().getName();
        r.lock();
        while (flag != 2) {
            c2.await();
        }
        System.out.print(name + ": ");
        System.out.print("I");
        System.out.print(" Hate");
        System.out.print(" U");
        System.out.print("\r\n");
        Thread.sleep(1000);
        flag = 3;
        c3.signal();
        r.unlock();
    }

    public void print3() throws InterruptedException {
        String name = Thread.currentThread().getName();
        r.lock();
        while (flag != 3) {
            c3.await();
        }
        System.out.print(name + ": ");
        System.out.print("I");
        System.out.print(" Fuck");
        System.out.print(" U");
        System.out.print("\r\n");
        Thread.sleep(1000);
        flag = 1;
        c1.signal();
        r.unlock();
    }
}
