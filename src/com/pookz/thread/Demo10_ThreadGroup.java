package com.pookz.thread;

public class Demo10_ThreadGroup {
    public static void main(String[] args) {
        /*
        * 线程组，可以设置整个线程组为守护线程setDaemon之类的吧...
        * */
        MyRunable mr = new MyRunable();

        ThreadGroup tg1 = new ThreadGroup("group1");

        Thread t1 = new Thread(tg1, mr, "thread1");
        Thread t2 = new Thread(tg1, mr, "thread2");
        System.out.println(t1.getThreadGroup().getName());
    }
}


class MyRunable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "..."+ i);

        }

    }
}