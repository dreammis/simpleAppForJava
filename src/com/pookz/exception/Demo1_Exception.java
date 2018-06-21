package com.pookz.exception;


public class Demo1_Exception {
    public static void main(String[] args) {
//        demo1();
//        demo2();
        /*
        *
        * 自定义异常
        *
        * */
        try{
            Cup c = new Cup();
            c.setPrice(-192f);
        }catch (PriceOutOfControlExcetion e){
            System.out.println(e.getMessage());
        }
    }

    private int method(){
        /*
        * final, finally, finalize
        *
        * final修饰类,不能被继承
        * 方法，不能被重写
        * 变量，只能赋值一次
        *
        * finally 是try语句中的语句体，一般用来释放资源
        *
        * finalize用于清理垃圾的方法
        *
        * 下题:
        * 最终return是30，因为return执行完之后，再去执行finally
        * */
        int x = 10;
        try{
            x= 20;
            System.out.println(1/10);
            return x;
        }catch (Exception e){
            x = 30;
            return x;
        }finally {
            x = 40;
        }
    }

    private static void demo2() {
        /*
        * throwException
        *
        * */
        try{
            Cup c = new Cup();
            c.setPrice(-12.9f);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void demo1() {
        try{
            int x = Demo.div(10, 0);
            System.out.println(x);
        }catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println("message: "+ e.getMessage());
            System.out.println("toString: "+ e.toString());
            System.out.println("shot this motherfucker!");
        }catch(IndexOutOfBoundsException e){
            System.out.println("shot this motherfucker again!");
        }
    }
}

class Demo{
    public static int div(int a, int b){
            return a/b;
    }
}

class Cup{
    private float price;

    public Cup(){}

    public Cup(float price) {
        this.price = price;
    }

    public float getPrice() {

        return price;
    }

    public void setPrice(float price){
        if (price <0){
            throw new PriceOutOfControlExcetion("价格非法");
        }
        this.price = price;
    }
}

class PriceOutOfControlExcetion extends RuntimeException{
    public PriceOutOfControlExcetion(String message) {
        super(message);
    }
}