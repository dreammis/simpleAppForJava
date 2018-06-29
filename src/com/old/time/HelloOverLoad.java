package com.old.time;

public class HelloOverLoad {
    private String name;
    public void set_hello(String name){
        this.name = name;
    }

    public void set_hello(String firstName, String lastName){
        this.name = firstName+ "" + lastName;
    }

    public static void main(String[] args) {
        HelloOverLoad ho = new HelloOverLoad();
        ho.set_hello("liu", "xiaohu");
        System.out.println(ho.name);
    }
}
