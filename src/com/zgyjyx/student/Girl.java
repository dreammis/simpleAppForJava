package com.zgyjyx.student;

import java.io.Serializable;
import java.util.Objects;

public class Girl implements Comparable<Girl>, Serializable{
    private String name;
    private int age;

    public Girl() {
        super();
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Girl girl = (Girl) o;
        return age == girl.age &&
                Objects.equals(name, girl.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Girl o) {
        int num = this.getAge() - o.getAge();
        return num == 0 ? 1: num;
    }
}
