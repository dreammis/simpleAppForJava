package com.old.time;

public class Test1_Animal {
    public static void main(String[] args) {
        Cat c = new Cat("liu", 13);
        c.eat();
        c.sleep();
        c.jump();

        Dog d = new Dog("zhao", 14);
        d.eat();
        d.sleep();
    }
}

abstract class Animal{
    private String name;
    private int age;

    public Animal(){}

    public Animal(String name, int age){
        this.name  = name;
        this.age = age;
    }

    public abstract void eat();

    public abstract void sleep();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface train {
    public abstract void jump();
}

class Cat extends Animal implements  train{

    public Cat(String name, int age){
        super(name, age);
    }

    public void eat(){
        System.out.println("com.old.time.Cat eat!");
    }
    public void sleep(){
        System.out.println("com.old.time.Cat sleep!");
    }
    public void jump(){
        System.out.println("com.old.time.Cat can jump!");
    }
}

class Dog extends Animal{

    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("com.old.time.Dog eat!");
    }

    @Override
    public void sleep() {
        System.out.println("com.old.time.Dog sleep!");
    }
}