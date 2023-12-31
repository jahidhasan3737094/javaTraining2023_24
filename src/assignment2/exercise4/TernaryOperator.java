package assignment2.exercise4;
import java.util.Scanner;
public class TernaryOperator {

    /*
    exercise4: Write a Java program that compares two numbers and
     prints the larger one using the ternary operator.
     */
    private void Compare(int number1, int number2) {
        /*
        variable = (condition) ? expressionTrue :  expressionFalse;
         */
        String result=(number1<number2) ?(number2+" is the big number"):(number1+" is the big number ");
        System.out.println(result);

    }

    public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the two number ");
     int number1=s.nextInt();
     int number2=s.nextInt();
     TernaryOperator t=new TernaryOperator();
     t.Compare(number1,number2);
    }


}
