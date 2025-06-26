package banco_heranca;

public abstract class BankAccount {

    // saldo da conta
    private double balance;

    public BankAccount(double initDeposit) {
        setBalance(initDeposit);
    }

    // deposita dinheiro na conta
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    // saca dinheiro da conta
    public double withdraw(double amount) {
        if (amount >= balance) {
            System.out.println("Insufficient funds");
            return balance;
        } else {
            balance -= amount;
        }
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


/*
*Conta

depositar
sacar
verificar saldo
*/











