package com.pookz.home;

public class Demo2_Wrap {
    public static void main(String[] args) {
        /*
        * 使用装饰器的好处
        * 1. 耦合性不强
        * 2. 被装饰的类与装饰的类的变化无关
        *
        * */
        Man m = new Man(new Boy());
        m.cry();
    }
}


interface Power{
    public void cry();
}

class Boy implements Power{
    @Override
    public void cry() {
        System.out.println("only can cry!");
    }
}

class Man implements Power{
    private Boy b;

    public Man(Boy b){
        this.b = b;
    }


    @Override
    public void cry() {
        b.cry();
        System.out.println("also can fuck!");
    }
}

