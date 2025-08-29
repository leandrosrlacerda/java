package construtores.sobrecarga.encapsulamento;

public class Account {

    private String holder;
    private final int number;
    private double balance;


    public Account(String name, int number, double initialDeposit) {
        this.holder = name;
        this.number = number;
        depositar(initialDeposit);
    }

    public Account(String name, int number) {
        this.holder = name;
        this.number = number;
    }

    public String getName() {
        return holder;
    }

    public void setName(String name) {
        this.holder = name;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void depositar(double valor) {
        this.balance += valor;
    }

    public void sacar(double valor) {
        this.balance -= valor + 5.00;
    }

    @Override
    public String toString() {
        return  "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
