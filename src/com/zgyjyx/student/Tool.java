package com.zgyjyx.student;

public class Tool<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public<Q> void show(Q obj){
        System.out.println(obj);
    }

    public static<W> void print(W obj){
        System.out.println(obj);
    }
}

interface it<T>{
    public void show(T t);
}

class DemoInterfaceGeneric implements it<String>{

    public void show(String s){
        System.out.println("what fuck is this!");
    }

}
