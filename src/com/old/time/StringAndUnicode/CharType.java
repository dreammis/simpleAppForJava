package com.old.time.StringAndUnicode;

public class CharType {
    public static void main(String[] args) {
        for (WeekDay day : WeekDay.values()){
            System.out.println(day.name());
        }

    }
}

enum WeekDay{
    SUM, MON, TUE, WED, THU, FRI, SAT;
}
