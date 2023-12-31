package assignment2.oop.exercise1;

public class MethodOverloading {

    /*
    Exercise 1: Polymorphism
 Create a Java program that demonstrates method overloading.
 Define a class with multiple methods having the same name but different parameter types.
 Use this class in the main method to showcase method overloading.
     */

    private int add(int a,int b){
        return a+b;
    }

    private int add(int a,int b,int c){
        return a+b+c;
    }
    private double add(int a,double b){
        return (double) a+b;
    }
    private double add(double a,double b,double c){
        return a+b+c;
    }

    public static void main(String[] args){
        MethodOverloading m=new MethodOverloading();
        System.out.println("result is "+m.add(3,5));

        System.out.println("result is "+m.add(3,5,8));

        System.out.println("result is "+m.add(3,5.1));
    }
}

