package assignment1.exercise8;
import java.lang.String;
public class Student extends Person{

    private String grade;

    public java.lang.String getGrade() {
        return grade;
    }

    public void setGrade(java.lang.String grade) {
        this.grade = grade;
    }

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade=grade;
        System.out.println("constractor is calling or invoking..for Student class.. ");
    }
    public  void  printInfo(){
        System.out.println("student name is : "+getName());
        System.out.println("student age is : "+getAge());
        System.out.println("student grade is : "+getGrade());
    }

}
