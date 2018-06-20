package com.zgyjyx.student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Demo2_Generic {
    public static void main(String[] args) {
        /*
        *
        * 泛型固定下边界
        *
        * ? super E
        * 泛型固定上边界
        *
        * ? extend E
        *
        * */

//        demo1();
        TreeSet<Dog> ts = new TreeSet<>(new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                int num = o1.getAge() - o2.getAge();
                return num==0?o1.getName().compareTo(o2.getName()): num;
            }
        });

        ts.add(new Dog("大黄", 1));
        ts.add(new Dog("旺财", 2));
        ts.add(new Hashiqi("小强", 3));
        ts.add(new Hashiqi("囡囡", 1));
        System.out.println(ts);
    }

    private static void demo1() {
        ArrayList<Dog> list1 = new ArrayList<>();
        list1.add(new Dog("大黄", 1));
        list1.add(new Dog("旺财", 2));

        ArrayList<Hashiqi> list2 = new ArrayList<>();
        list2.add(new Hashiqi("小强", 3));
        list2.add(new Hashiqi("囡囡", 1));

        list1.addAll(list2);
        System.out.println(list1);
    }
}
class Dog{
    private String name;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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

    private int age;

}
class Hashiqi extends Dog{
    @Override
    public String toString() {
        return "Hashiqi[" + super.toString() +"]";
    }

    public Hashiqi(String name, int age) {
        super(name, age);
    }
}
