package com.pookz.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo11_ThreadPool {
    public static void main(String[] args) {
        /*
        * 线程创建的成本很高，因为要涉及到与操作系统交互，使用线程池可以很好的提高性能，尤其当程序需要创建大量生存周期比较短的线程时，要考虑线程池
        * 线程池中的线程运行结束后(run)，并不是直接被回收掉，而是回归线程池，等待再次被使用
        *
        * */

        ExecutorService pool = Executors.newFixedThreadPool(2);

        pool.submit(new MyRunable());  // 将线程加入线程池
        pool.submit(new MyRunable());


        pool.shutdown();  //关闭线程池中的线程
    }
}


