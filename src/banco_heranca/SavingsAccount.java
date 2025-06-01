package banco_heranca;

public class SavingsAccount extends BankAccount{

    // taxa de juros
    private double interestRate;

    public SavingsAccount(double initBalance, double interestRate){
        super(initBalance);
        this.interestRate = interestRate;
    }

    // calcula e adiciona juros ao saldo
    public void addInterest(){
        double balance = getBalance();
        double rate = getInterestRate();
        double interest = balance * rate;
        balance += interest;
        setBalance(balance);

    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // consulta a taxa de juros
    public double getInterestRate() {
        return interestRate;
    }
}

/*
*Conta poupanca

juros de 2%
balance = balance + (balance * interest_rate)  */
