package com.old.time;

public class StudentExtend extends PersonExtend {
    private int score;
    public void setScore(int score){
        this.score = score;
    }
    public int getScore(){
        return this.score;
    }
    public String getTall(){
        return this.tall;
    }

    public StudentExtend(String name){
        super(name);
    }

}
