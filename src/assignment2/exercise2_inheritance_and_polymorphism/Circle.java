package assignment2.exercise2_inheritance_and_polymorphism;

public class Circle extends Shape{

    final static double pi=3.1416;

    public double calculateArea(int r) {
        return pi * r * r;
    }
}
