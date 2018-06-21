package StaticS;

import java.util.Objects;

public class Person {
    private static int number;
    private String name;
    private int age;

    public Person(String name){
        this.name = name;
        number++;
    }

    public String getName(){
        return this.name;
    }

    public static int getNumber(){
        return number;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this==o){
//            return true;
//        }
//        if (o instanceof Person){
//            Person p = (Person) o;
////            return (p.name == this.name || p.name != null && p.name.equals(this.name)) && p.age == this.age;
//              return Objects.equals(p.name, this.name) && p.age ==this.age;
//        }
//        return false;
//    }
}
