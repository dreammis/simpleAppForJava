package com.zgyjyx.student;

public class Demo1_Generic {
    public static void main(String[] args) {
        Tool<Student> t = new Tool<>();
        t.setObj(new Student("zhang", 12));
        System.out.println(t.getObj());
        t.show("1");
        Tool.print(true);


        Tool<?> t1 = new Tool<>();
    }
}
