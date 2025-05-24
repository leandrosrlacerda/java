package banco;

public class Account {

    // dados privador (saldo)
    private double balance;

    // construtor
    public Account() {
    }

    public Account(double initial_deposit){
        balance = initial_deposit;
    }

    // metodo credita valor de amount na conta
    public void depositFunds(double amount){
        balance += amount;
    }

    // metodo retira o valor de amount na conta
    public double withdrawFunds(double amount){

        if (amount > balance) {
            System.out.println("Insufficient funds");
            return balance;
        } else {
        balance -= amount;
        return amount;
        }
    }

    // consulta o saldo
    public double getBalance() {
        return balance;
    }
}
