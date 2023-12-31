package assignment2.exercise3;
import java.util.Scanner;
public class Week {
    /*
    Exercise 3:Write a Java program that takes a number between 1 and 7 as
    input and prints the corresponding day of the week.

     */
    private void getTheDay(int number) {

        switch (number){
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Enter a  valid number ");

        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number  : ");
        int number=s.nextInt();
        Week w=new Week();
        w.getTheDay(number);

    }


}
