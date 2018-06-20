package PartTwo;
import CoreClass.StringAndUnicode.PersonBase;
import jdk.nashorn.api.tree.NewTree;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Class cls = String.class;
        String s = "Hello";
        Class s_class = s.getClass();
        System.out.println(s_class.getMethods());
        s_class.getName();
        s_class.getSimpleName();
        s_class.getPackage().getName();
        s_class.isInterface();
        PersonBase pb = new PersonBase(39, "xiaolan");
        Field[] fileds = pb.getClass().getFields();
        for (int i=0; i< fileds.length; i++) {
            System.out.println(fileds[i].getName());
        }
        for (Field f: fileds){
            System.out.printf(f.getName());
        }

        System.out.println(pb.getClass().getFields());



        Integer n = new Integer(123);
        Class iclass = n.getClass();
        Field[] fs = iclass.getFields();
        for (Field f: fs){
//            System.out.println(f.getName());
//            System.out.println(f.getType());
            System.out.println(f.getModifiers());
        }
    }
}
