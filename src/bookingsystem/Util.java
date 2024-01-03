package bookingsystem;

import java.util.Scanner;

public class Util {


    //register user method
    public void registerUser(){

        Scanner sn=new Scanner(System.in);
        System.out.print("Please enter your Name :");
        String Name=sn.nextLine();
        System.out.print("Please enter your Email ID : ");
        String Email= sn.nextLine();
        System.out.print("Please enter your Address : ");
        String Address=sn.nextLine();
        System.out.print("Please enter your phone number :");
        long PhoneNumber= sn.nextLong();
        //calling the class UserRegistration constructor.
        UserRegistration userinfo=new UserRegistration(Name,Email,Address,PhoneNumber);
        userinfo.WriteInfo();

    }
    public void bookReservation(){
      //will be implemented later
    }
    public void generateBill(){
        //will be implemented later
    }
    public void userFeedback(){
        //will be implemented later
    }
}
