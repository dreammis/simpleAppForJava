package com.old.time.ChouX;

public class Student extends Person {

    private final int before;
    private final int after;

    public Student(int before, int after) {
        this.before = before;
        this.after = after;
    }

    @Override
    public int age() {
        return this.before+this.after;
    }
}
