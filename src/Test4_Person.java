public class Test4_Person {
    public static void main(String[] args) {
        Student ming = new Student("小明", 32);
        Student zhao  = new Student();
        zhao.setName("赵");
        zhao.setAge(12);
        zhao.study();
        Teacher lao = new Teacher("小兰", 23);
        Teacher wei = new Teacher();
        wei.setAge(12);
        wei.setName("13");
        ming.study();
        lao.teach();
    }
}

class Person{
    private String name;
    private int age;

    public Person(){};
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

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

    public void eat(){
        System.out.println("吃饭啦");
    }
}

class Student extends Person{
    public Student(){};

    public Student(String name, int age){
        super(name, age);
    }

    public void study(){
        System.out.println(this.getName() + "在学习啦");
    }
}

class Teacher extends Person{
    public Teacher(){};


    public Teacher(String name, int age){
        super(name, age);
    }


    public void teach(){
        System.out.println(this.getName()+ "在上课啦");
    }
}