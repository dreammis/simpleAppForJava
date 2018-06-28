package com.pookz.thread;

public class Demo7_Wait {
    public static void main(String[] args) {
        PrinterWait pw = new PrinterWait();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        pw.print1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        pw.print2();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}

class PrinterWait {
    /*
    * 两个线程间通信
    * 定义flag，通过flag标识
    *
    * 线程的wait使当前线程等待
    * 而notify随机激活一个其他线程
    * 但是这种方式不适合与多个线程之间的通信，因为notify是完全随机的
    * */
    private int flag = 1;
    public void print1() throws InterruptedException {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            if (flag !=1){
                this.wait();
            }
            System.out.print(name+ ": ");
            System.out.print("I");
            System.out.print(" Love");
            System.out.print(" U");
            System.out.print("\r\n");
            Thread.sleep(1000);
            flag = 2;
            this.notify();
        }

    }

    public void print2() throws InterruptedException {
        String name = Thread.currentThread().getName();
        synchronized (this) {
            if(flag != 2){
                this.wait();
            }
            System.out.print(name+ ": ");
            System.out.print("I");
            System.out.print(" Hate");
            System.out.print(" U");
            System.out.print("\r\n");
            Thread.sleep(1000);
            flag = 1;
            this.notify();
        }
    }


}
