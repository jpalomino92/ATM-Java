public class CuentaBancaria {
        String owner;
        String accountType;
        double balance;


        void withdrawMoney(double quantity) {
            if (quantity < 0){
                return;
            }
            balance -= quantity;
        }

        void depositCash(double quantity) {
            if (quantity < 0){
                return;
            }
            balance += quantity;
        }

        void changeAccountType(String newType) {
            accountType = newType;
        }

        double getBalance(){
            return balance;
        }



}
