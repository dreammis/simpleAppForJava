package ChouX;

public class Main {
    public static void main(String[] args) {
        Person s1 = new Student(10, 30);
        System.out.println(s1.age());
        Person oldman = new OldMan(40, 80);
        System.out.println(oldman.age());
    }
}
