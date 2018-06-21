public class Person {
        private String name;
        private int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Person(String name){
            this.name = name;
            this.age = 18;
        }

    public static void main(String[] args) {
        Person xiaoming = new Person("xiaoming", 13);
        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);
        Person xiaohong  = new Person("xiaohong");
        System.out.println(xiaohong.name);
        System.out.println(xiaohong.age);
    }





}
