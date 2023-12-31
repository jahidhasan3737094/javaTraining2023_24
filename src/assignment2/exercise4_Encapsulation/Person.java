package assignment2.exercise4_Encapsulation;

public class Person {
    private String name;
    private int age;
    private String address;

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
        if (age>0)
        {
            this.age = age;
        }else
            System.out.println("age cannot be negative number");


    }

    public java.lang.String getAddress() {
        return address;
    }

    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    public void info(){
        System.out.println("person name is "+getName());
        System.out.println("person address is "+getAddress());
        System.out.println("person age is "+getAge());

    }
    public Person(String name,String address,int age){
        this.name=name;
        this.address=address;
        setAge(age);
    }
    public static void main(String[] args){
        Person p=new Person("jahid","NYC",5);
        p.setName("jahid");
        p.setAddress("nyc");
        p.setAge(10);
        p.info();


    }
}
