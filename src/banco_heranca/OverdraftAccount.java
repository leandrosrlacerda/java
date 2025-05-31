package banco_heranca;

public class OverdraftAccount extends BankAccount{

    private double creditRate;

    public OverdraftAccount(double initBalance, double creditRate){
        super(initBalance);
        this.creditRate = creditRate;
    }

    // cobra juros sobre qualquer dinheiro emprestado
    public void chargeInterest(){
        double balance = getBalance();
        if (balance < 0) {
            double charge = balance * getCreditRate();
            balance += charge;
            setBalance(balance);
        }
    }
    // consulta a taxa de crédito
    public double getCreditRate() {
        return creditRate;
    }
    // configura a taxa de crédito
    public void setCreditRate(double creditRate) {
        this.creditRate = creditRate;
    }

    // saca dinheiro da conta
    public double withdraw(double amount){
        setBalance(getBalance() - amount);
        return amount;
    }

}

 /*Conta com cheque especial

Juros apenas com saldo negativo
balance = balance + (balance * interest_rate)*/