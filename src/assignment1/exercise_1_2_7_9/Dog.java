package assignment1.exercise_1_2_7_9;

public class Dog extends Animal{
    public void makeSound(){
        System.out.println("Dow is barking.....");
    }

    @java.lang.Override
    public void printInfo() {
        super.printInfo();
        this.makeSound();
        System.out.println("it is a dog type ");
    }
}
