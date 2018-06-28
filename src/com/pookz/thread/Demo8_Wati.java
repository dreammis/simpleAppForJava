package com.pookz.thread;

public class Demo8_Wati {
    public static void main(String[] args) {
        /*
        * 这里顺带写一下sleep以及wait的区别
        * sleep必须传参，在规定时间内醒来
        * wait可传可不传，传参就是在规定时间后wait，不传则立即灯带
        *
        * sleep并不释放锁
        * wait是释放锁的
        *
        * */


        PrinterWait2 pw = new PrinterWait2();

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


class PrinterWait2 {
    /*
    * 多个线程通信还是使用wait以及notify
    * 只是多个线程使用notifyAll，即激活所有线程，再由各个线程的while去判断如果自己符合条件那么就执行，不符合就继续wait
    * */
    private int flag = 1;

    public void print1() throws InterruptedException {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            while (flag != 1) this.wait();
            System.out.print(name + ": ");
            System.out.print("I");
            System.out.print(" Love");
            System.out.print(" U");
            System.out.print("\r\n");
            Thread.sleep(1000);
            flag = 2;
            this.notifyAll();
        }

    }

    public void print2() throws InterruptedException {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            while (flag != 2) {
                this.wait();
            }
            System.out.print(name + ": ");
            System.out.print("I");
            System.out.print(" Hate");
            System.out.print(" U");
            System.out.print("\r\n");
            Thread.sleep(1000);
            flag = 3;
            this.notifyAll();
        }
    }

    public void print3() throws InterruptedException {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            while(flag!=3){
                this.wait();
            }
            System.out.print(name + ": ");
            System.out.print("I");
            System.out.print(" Fuck");
            System.out.print(" U");
            System.out.print("\r\n");
            Thread.sleep(1000);
            flag = 1;
            this.notifyAll();
        }
    }
}

