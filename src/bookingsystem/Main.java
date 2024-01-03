package bookingsystem;

import java.util.Scanner;

public class Main {


    public static void displayMenu(){
        System.out.println("  hotel booking management  ");

        System.out.println("  Please select your preffered choice ");

        System.out.println("\t1. register account\n" +
                "\t2. book reservation \n" +
                "\t3. generate bill\n" +
                "\t4. feedback ");
        System.out.println(" please provide your option: ");

    }


    public static void main(String[] args) {

        //creating util object;
        Util util=new Util();
        Scanner scan = new Scanner(System.in);
        char choice;
        do{
            displayMenu();
            int number;
            Scanner sn=new Scanner(System.in);
            number=sn.nextInt();
            switch(number){
                case 1: System.out.println("welcome to register");
                    util.registerUser();
                    break;
                case 2: System.out.println("Welcome to reservation");
                    break ;
                case 3:System.out.println("Welcome to bill");
                    break;
                case 4: System.out.println("Welcome to feedback");
                case 5:
                    System.out.println("Exiting the program");
                    return; // Exit the program when the user chooses to exit
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");

            }
            System.out.println("Do you want to continue? (Y/N)");
            choice = scan.next().charAt(0);
        }while(Character.toUpperCase(choice)=='Y');




    }
}
