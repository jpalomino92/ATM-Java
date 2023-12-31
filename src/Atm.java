import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
Class that emulates the functionalities of an ATM.

The class will have an instance variable called currentBankAccount of type BankAccount.

The class will have a constructor that takes two parameters: a String identifying the user and another String containing a password.

Since this is an emulation, instead of connecting to the bank's database to retrieve the user's bank account,
we will create an object of the BankAccount class with an arbitrary name and a random balance.

This class will have the following methods:

displayBalance() -> This will display the balance of currentBankAccount.

depositMoney() -> This will ask the user how much money they want to deposit and will deposit it into currentBankAccount.

withdrawMoney() -> This will ask the user how much money they want to withdraw and will withdraw it from currentBankAccount.

checkRecentTransactions() -> This method, for now, will do nothing.

exit() -> This will thank the user for using their services.

*/
public class Atm {
    CuentaBancaria currentBankAccount;

    Atm(String identifier, String password){
        double RandomQuantity = ThreadLocalRandom.current().nextDouble(0,50000);
        currentBankAccount = new CuentaBancaria("Juan",RandomQuantity);

    }

    void showBalance(){
        System.out.println("Your balance is : " + currentBankAccount.getBalance());
    }
    void depositCash(){
        System.out.println("How much money do you want to deposit?");
        Scanner scanner = new Scanner(System.in);
        double quantity = scanner.nextDouble();
        currentBankAccount.depositCash(quantity);
    }

    void withdrawMoney(){
        System.out.println("How much money do you want to withdraw?");
        Scanner scanner = new Scanner(System.in);
        double quantity = scanner.nextDouble();
        currentBankAccount.withdrawMoney(quantity);
    }

    void checkLastMovements(){

    }
    void exit(){
        System.out.println("Thank you for using our services");
    }


}
