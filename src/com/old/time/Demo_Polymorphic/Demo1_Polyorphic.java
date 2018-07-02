package com.old.time.Demo_Polymorphic;

public class Demo1_Polyorphic {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        Animal c1 = new Cat();
        c1.eat();

    }
}

class Animal {
    public void eat(){
        System.out.println("动物在吃饭");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫在吃鱼");
    }
}
