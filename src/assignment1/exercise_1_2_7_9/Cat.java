package assignment1.exercise_1_2_7_9;

public class Cat extends Animal{
    public void makeSound(){
        System.out.println("Cat is making sound mao mao.....");
    }

    @java.lang.Override
    public void printInfo() {
        super.printInfo();
        this.makeSound();
        System.out.println("it is a cat type");
    }
}
