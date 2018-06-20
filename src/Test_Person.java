

public class Test_Person {
    public static void main(String[] args) {
        System.out.println(11);
    }
}

class Studentq{
    private String name;
    private int age;

    public Studentq(){ }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Studentq(String name, int age){
        this.name = name;
        this.age = age;

    }

    public void eat(){
        System.out.println("学生吃饭");
    }
    public void study(){
        System.out.println("学生学习");
    }
}

class Teacher1{
    private String name;
    private int age;

    public Teacher1(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher1(String name, int age){
        this.name = name;
        this.age = age;

    }
    public void eat(){
        System.out.println("老师吃饭");
    }
    public void teach(){
        System.out.println("老师教学");
    }

}