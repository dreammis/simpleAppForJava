package com.pookz.thread;

import java.util.*;

public class Demo6_Timer {
    public static void main(String[] args) throws InterruptedException {
        /*
        * 计时器
        *
        * */
        Timer t = new Timer();
        t.schedule(new MyTimerTask(), new Date(118, 5, 28, 10, 35, 10));
        while (true){
            Thread.sleep(1000);
            System.out.println(new Date());
        }
    }
}

class MyTimerTask extends TimerTask{
    @Override
    public void run() {
        System.out.println("bullshit fuck!");
    }
}