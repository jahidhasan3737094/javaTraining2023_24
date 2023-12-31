package assignment2.exercise1;
import java.util.Scanner;

/*
Exercise 2:Write a Java program that takes
 a student's score as input and prints their
 grade according to the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59

 */
public class Grade {

    public void gradeResult(int p){
        if( p>=90 && p<=100){
            System.out.println("your grade is A");
        } else if (p>=80 && p<=89) {
            System.out.println("your grade is B");
        }else if (p>=70 && p<=79) {
            System.out.println("your grade is C");
        }else if (p>=60 && p<=69) {
            System.out.println("your grade is D");
        }else if (p>=0 && p<=59) {
            System.out.println("your grade is F");
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the Grade point : ");
        int point=s.nextInt();
        Grade g=new Grade();
        g.gradeResult(point);

    }
}
