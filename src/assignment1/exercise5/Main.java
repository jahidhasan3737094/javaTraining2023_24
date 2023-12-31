package assignment1.exercise5;

public class Main {
    public static void main(String[] args) {
        Manager m=new Manager(20000,8000,2000);
        //m.setSalary(2000);
        m.calculateSalary();

        Developer d=new Developer(21000,7000,1000);
        //m.setSalary(2000);
        d.calculateSalary();
    }
}
