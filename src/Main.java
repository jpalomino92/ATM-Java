// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuentaDeJuan = new CuentaBancaria();

        cuentaDeJuan.owner = "Juan Palomino";
        cuentaDeJuan.accountType = "savings";
        cuentaDeJuan.balance = 25_000;

        double balance = cuentaDeJuan.getBalance();
        System.out.println("el saldo es " + balance);







    }
}