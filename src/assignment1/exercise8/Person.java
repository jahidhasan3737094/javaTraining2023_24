package assignment1.exercise8;

public class Person {
    private String name;
    private int age;

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("constractor is calling or invoking..for Person class.. ");
    }
}
