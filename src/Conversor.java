import java.util.Scanner;

/*
Program that asks to enter an amount in euros through the screen and returns the conversion in US dollars.
        The message with the result will be: *** euros are equivalent to *** US dollars.
*/
public class Conversor {
    public static void main(String[] args) {
        System.out.println("PLease enter an amount in euros that you want to convert to USD: ");
        Scanner scanner = new Scanner(System.in);
        double eur = scanner.nextDouble();
        double usd = eur * 1.09;

        System.out.println(eur + " Euros are equivalent to " + usd + " US dollars");
    }
}
