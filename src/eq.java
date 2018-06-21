public class eq {
    // 子类可见
    public String name;
    // 仅该类可见
    private double salary;

    public eq (String eName){
        name = eName;
    }
    public void setSalary(double empSal){
        salary = empSal;
    }

    public void printEmp(){
        System.out.println("名字 : "+name);
        System.out.println("薪水 : "+salary);
    }

    public static void main(String[] args) {
        eq e1 = new eq("liu");
        e1.setSalary(1000);
        e1.printEmp();
    }

}
