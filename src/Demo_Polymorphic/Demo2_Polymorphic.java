package Demo_Polymorphic;

public class Demo2_Polymorphic {
    public static void main(String[] args) {
        Father f = new Son();  //父类引用指向子类对象
        System.out.println(f.num);


    }
}

class Father{
    int num =10;

}

class Son extends Father{
    int num = 20;
}
