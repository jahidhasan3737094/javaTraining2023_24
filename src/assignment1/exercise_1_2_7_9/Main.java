package assignment1.exercise_1_2_7_9;

public class Main {
    public static void main(String[] args) {
        System.out.println("wellcome");
        Animal obj1=new Animal();
        obj1.setName("burfy");
        obj1.setAge(10);
        obj1.printInfo();

        Dog d1=new Dog();
        d1.setName("tomy");
        d1.setAge(11);
        d1.printInfo();

        Cat c1=new Cat();
        c1.setName("mini");
        c1.setAge(4);
        c1.printInfo();
        obj1.displayAnimalType(c1);
        obj1.displayAnimalType(d1);

    }
}
