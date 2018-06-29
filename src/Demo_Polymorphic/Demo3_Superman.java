package Demo_Polymorphic;

class Demo3_Superman {
    public static void main(String[] args) {
        Person p = new SuperMan("张三");  //父类引用指向子类对象
        System.out.println(p.name);

        p.buniess();

        SuperMan su = (SuperMan)p;  // 向下转型
        su.fly();
    }


}


class Person{
    String name = "John";

    public Person(String name) {
        this.name = name;
    }

    public void buniess(){
        System.out.println("谈生意");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "com.old.time.Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class SuperMan extends Person{
    String name = "superman";

    public SuperMan(String name) {
        super(name);
    }


    public void buniess(){
        System.out.println("谈几个亿的大生意");
    }

    public void fly(){
        System.out.println("fly to save people");
    }
}