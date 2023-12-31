package assignment2.exercise3_interface_and_polymorphism;


/*
Exercise 3: Interface and Polymorphism
Define an interface Drawable with a method draw().
Create two classes, Circle and Square, that implement the Drawable interface.
 In the main method, create an array of Drawable objects and call the draw() method for each object.

 */
public class Main {
    public static void main(String[] args) {

        Drawable[] drawables=new Drawable[2];
        Circle c=new Circle();
        Square s=new Square();
        drawables[0]=c;
        drawables[1]=s;

        //problem with getting the object name
        for (int i = 0; i < drawables.length; i++) {
            System.out.println("Object name is " + drawables[i]);
            drawables[i].draw();
        }



    }
}
