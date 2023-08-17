/*
Program that emulates the interface of an ATM. The program will present the following options to the user indefinitely until they enter a number different from those indicated:

Choose one of the following options:
Type 1 to check your balance
Type 2 to deposit money
Type 3 to withdraw money
Type 4 to check your recent transactions
To exit, type any other number
Once you have entered the option, press the Enter key.

After the user has chosen the option, the program will display a sentence explaining the chosen option.

*/

import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        int option;

        do {
            System.out.println("Choose one of the following options: ");
            System.out.println("        Type 1 to check your balance.");
            System.out.println("        Type 2 to deposit money.");
            System.out.println("        Type 3 to withdraw money.");
            System.out.println("        Type 4 to check your recent transactions.");
            System.out.println("Once you have entered the option, press the Enter key.");
            System.out.println("To exit Type any other number.");

            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("Checking balance");
                    break;
                case 2:
                    System.out.println("Depositing cash");
                    break;
                case 3:
                    System.out.println("withdrawing money");
                    break;
                case 4:
                    System.out.println("last transactions");
                    break;
                default:
                    System.out.println("Exiting");
            }

        }while( option == 1 | option == 2 | option == 3 | option == 4);
    }
}
