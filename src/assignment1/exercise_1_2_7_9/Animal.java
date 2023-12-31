package assignment1.exercise_1_2_7_9;

public class Animal {
    private String name;
    private int age;
    public void setName(String newName) {
        this.name = newName;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printInfo(){
        System.out.println("Name is "+name);
        System.out.println("age is  "+age);

    }
    public void displayAnimalType(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("The animal is a Dog");
        } else if (animal instanceof Cat) {
            System.out.println("The animal is a Cat");
        } else {
            System.out.println("Unknown animal type");
        }
    }
}
