package assignment1.exercise5;

public class Manager extends Employee{
    public int getBonuses() {
        return bonuses;
    }

    public void setBonuses(int bonuses) {
        this.bonuses = bonuses;
    }

    private int bonuses;

    public int getIncentives() {
        return incentives;
    }

    public void setIncentives(int incentives) {
        this.incentives = incentives;
    }

    private int incentives;
public Manager(int salary,int bonuses,int incentives){
    super(salary);
    this.bonuses=bonuses;
    this.incentives=incentives;

}
    @java.lang.Override
    public void calculateSalary() {
        super.calculateSalary();
        System.out.println("Manager's Salary with bonuses and incentives is "+ (getSalary()+bonuses+incentives));
    }
}
