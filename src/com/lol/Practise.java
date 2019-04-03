package com.lol;

public class Practise {


    public static void main(String[] args) {
//        test1();

    }

    private static void test1() {
        Item bottle = new Item();
        bottle.name = "血瓶";
        bottle.price = 50;

        Item shose = new Item();
        shose.name = "草鞋";
        shose.price = 300;

        Item sord = new Item();
        sord.name = "长剑";
        sord.price = 300;
    }
}

class Item{
    String name;
    int price;
}

