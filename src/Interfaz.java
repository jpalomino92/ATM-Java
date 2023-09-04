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

        System.out.println("Please provide your DNI");
        Scanner scanner = new Scanner(System.in);
        String identifier = scanner.nextLine();
        System.out.println("Please introduce your password");
        String password = scanner.nextLine();
        Atm atm = new Atm(identifier,password);


        int option;

        do {
            System.out.println("Choose one of the following options: ");
            System.out.println("        Type 1 to check your balance.");
            System.out.println("        Type 2 to deposit money.");
            System.out.println("        Type 3 to withdraw money.");
            System.out.println("        Type 4 to check your recent transactions.");
            System.out.println("Once you have entered the option, press the Enter key.");
            System.out.println("To exit Type any other number.");


            option = scanner.nextInt();

            switch (option){
                case 1:
                    atm.showBalance();
                    break;
                case 2:
                    atm.depositCash();
                    break;
                case 3:
                    atm.withdrawMoney();
                    break;
                case 4:
                    atm.checkLastMovements();
                    break;
                default:
                    atm.exit();
            }

        }while( option == 1 | option == 2 | option == 3 | option == 4);
    }
}
