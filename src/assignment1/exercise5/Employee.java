package assignment1.exercise5;

public class Employee {
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int salary;

    public Employee(int salary){
        this.salary=salary;
    }
   public void calculateSalary(){

       System.out.println("Basic Salary is  "+salary);
   }
}
