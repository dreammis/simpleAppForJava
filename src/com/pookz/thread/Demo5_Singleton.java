package com.pookz.thread;

public class Demo5_Singleton {
    public static void main(String[] args) {
        /*
        *
        * 单例的话只需要私有化构造函数即可
        *
        * */

        Singleton s = Singleton.getInstance();
    }
}

class Singleton{
    /*
    * 私有化构造函数，然后在本类中创建一个Singleton的对象
    * 创建共有的get方法即可
    * 这种方式是无论用还是不用，都先创建Singleton对象，还有一种方式是在get的时候再创建s实例
    * 这种方式相对来说线程是安全的，因为在类加载的时候已经创建好了示例
    * */
    private Singleton(){}
    private static Singleton s = new Singleton();
    public static Singleton getInstance(){
        return s;
    }
}

class Singleton2{
    /*
     * 在get的时候再创建实例
     * 这种方式会造成线程的不安全，有可能线程之间的停歇会造成示例的多次创建
     * */
    private Singleton2(){}
    private static Singleton2 s;
    public static Singleton2 getInstance(){
        if (s == null){
            s = new Singleton2();
        }
        return s;
    }
}
