package assignment2.even_odd;
import java.util.Scanner;
public class Even_Odd {
   public void getEvenOdd(int n){

       if(n%2==0){
           System.out.println("the number "+n+ " is an even number");
       }else{
           System.out.println("the number "+n+ " is a odd number");
       }
   }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=(s.nextInt());
        Even_Odd eo=new Even_Odd();
        eo.getEvenOdd(n);

    }
}
