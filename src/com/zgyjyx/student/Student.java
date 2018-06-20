package com.zgyjyx.student;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Student s = (Student) o;
        return this.name.equals(s.name) && this.age == s.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Student o) {
        /*
        * 按照姓名排序
        * */
        int num = this.name.compareTo(o.getName());
        return num == 0? Integer.compare(this.age, o.getAge()): num;

        /*
        * 按照年龄排序
        * */
        /*int num = this.age-o.getAge();
        return num ==0 ? this.name.compareTo(o.getName()) : num;*/
    }
}
