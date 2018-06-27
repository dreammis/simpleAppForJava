package com.pookz.thread;

public class Demo4_Ticket {
    public static void main(String[] args) {
//        demo1();
        TicketIm ti = new TicketIm();
        new Thread(ti).start();
        new Thread(ti).start();
        new Thread(ti).start();
        new Thread(ti).start();

    }

    private static void demo1() {
        /*
        * 使用继承Thread实现4个线程卖票
        * */
        new Ticket().start();
        new Ticket().start();
        new Ticket().start();
        new Ticket().start();
    }
}

class Ticket extends Thread{
    public static int count = 100;
    public static Object o = new Object();

    @Override
    public void run() {

       /*
       这种写法也是可以的，因为Ticket.class也是唯一的
       synchronized (Ticket.class){
       */
           /*
            自己定义一个object对象也可以，但是必须是静态的
            synchronized (o){
            */

        synchronized (o){
            while(true){
                if (count == 0){
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + "...this is the "+ count--);
            }
        }
    }
}

class TicketIm implements Runnable{
    private int count = 100;


    @Override
    public void run() {
//        Thread t = Thread.currentThread();
        while(true){
            synchronized (this){
                if (count == 0){
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "...this is the "+ count--);
            }
        }
    }
}
