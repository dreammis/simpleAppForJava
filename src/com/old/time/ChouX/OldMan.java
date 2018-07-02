package com.old.time.ChouX;

public class OldMan extends Person {

    private int young ;
    private int old;

    public OldMan(int young, int old) {
        this.young = young;
        this.old = old;
    }
    @Override
    public int age(){
        return this.young*this.old;
    }

}
