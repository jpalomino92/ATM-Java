public class CuentaBancaria {
        String owner;
        AccountType accountType;
        double balance;

        final double COMISION = 1.2;

        CuentaBancaria(String owner, AccountType type, double balance){
            this.owner = owner;
            this.accountType = type;
            this.balance = balance ;
        }
        CuentaBancaria(String owner, double balance){
        this(owner,AccountType.SAVINGS,balance) ;
        }

        CuentaBancaria(){
            this("",AccountType.SAVINGS,0);
        }

        void withdrawMoney(double quantity) {
            if (quantity < 0){
                return;
            }
            double comision = calculateComision();

            balance -= quantity;
            balance -= comision;
        }

        double calculateComision(){
            switch (accountType){
                case SAVINGS:
                    return COMISION;
                default:
                    return 0;
            }
        }

        void depositCash(double quantity) {
            if (quantity < 0){
                return;
            }
            balance += quantity;
        }

        void changeAccountType(AccountType newType) {
            accountType = newType;
        }

        double getBalance(){
            return balance;
        }



}
