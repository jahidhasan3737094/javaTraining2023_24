package assignment1.exercise5;

public class Developer extends Employee{
    private int bonuses;
    private int incentives;
    public Developer(int salary,int bonuses,int incentives) {
        super(salary);
        this.bonuses=bonuses;
        this.incentives=incentives;

    }

    public int getBonuses() {
        return bonuses;
    }

    public void setBonuses(int bonuses) {
        this.bonuses = bonuses;
    }

    public int getIncentives() {
        return incentives;
    }

    public void setIncentives(int incentives) {
        this.incentives = incentives;
    }

    @java.lang.Override
    public void calculateSalary() {
        super.calculateSalary();
        System.out.println("Developer's Salary with bonuses and incentives is "+ (getSalary()+bonuses+incentives));
    }
}
