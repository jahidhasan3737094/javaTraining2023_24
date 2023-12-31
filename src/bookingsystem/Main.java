package bookingsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("  hotel booking management  ");

        System.out.println("  Please select your preffered choice ");

        System.out.println("\t1. register account\n" +
                "\t2. book reservation \n" +
                "\t3. generate bill\n" +
                "\t4. feedback ");
        System.out.println(" please provide your option: ");

        int number;
        Scanner scan=new Scanner(System.in);
        number=scan.nextInt();
        switch(number){
            case 1: System.out.println("welcome to register");
            break;
            case 2: System.out.println("Welcome to reservation");
            break ;
            case 3:System.out.println("Welcome to bill");
            break;
            case 4: System.out.println("Welcome to feedback");

        }


        Scanner sn=new Scanner(System.in);
        System.out.print("Please enter your First Name :");
        String FirstName=sn.nextLine();

        System.out.print("Please enter your Last Name :");
        String LastName=sn.nextLine();


        System.out.print("Please enter your Email ID : ");
        String Email= sn.nextLine();

        System.out.print("Please enter your Address : ");
        String Address=sn.nextLine();

        System.out.print("Please enter your phone number :");
        int PhoneNumber= sn.nextInt();

        RegisterAccount r=new RegisterAccount(FirstName,LastName,PhoneNumber,Email,Address);
        r.WriteInfo();

    }
}
