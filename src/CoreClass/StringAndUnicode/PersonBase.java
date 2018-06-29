package CoreClass.StringAndUnicode;

public class PersonBase implements Comparable<PersonBase>{

    private String name;
    private int age;
    private boolean gender;
    private String address;
    public String zqq;

    public PersonBase(int age, String name){
        this.age = age;
        this.name = name;
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(PersonBase o) {
        if (this.age> o.age){
            return -1;
        }
        else if (this.age == o.age){
            return 0;
        }
        else{
            return 1;
        }
    }


    @Override
    public String toString() {
        return "com.old.time.Person("+ this.name + ","+this.age +")";
    }
//    public int compareTo(PersonBase p){
//        return 0;
//    }
}
