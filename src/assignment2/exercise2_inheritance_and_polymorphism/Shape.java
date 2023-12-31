package assignment2.exercise2_inheritance_and_polymorphism;

public class Shape {

    public  double  calculateArea(){
        return 0;
    }

    public static void main(String [] args){

        Circle c=new Circle();
        double circle = c.calculateArea(1);

        Rectangle r=new Rectangle();
         double recatangle= r.calculateArea(5,6);

        System.out.println("Area of cirle is "+circle);
        System.out.println("Area of rectangle is "+recatangle);

    }


}
