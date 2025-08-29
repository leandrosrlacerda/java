package banco_heranca;

public class CheckingAccount extends BankAccount {

    // variavel de cota mensal de transações
    private int monthlyQuota;
    // numero de transações
    private int transactionCount;
    // Tarifa
    private double fee;

    public CheckingAccount(double initBalance, int monthlyQuota, double fee) {
        super(initBalance);
        setMonthlyQuota(monthlyQuota);
        setFee(fee);
    }

    // sobrepõe withdraw de BankAccount
    public double withdraw(double amount) {
        transactionCount++;
        return super.withdraw(amount);
    }

    // acessa as taxas se ultrapassou o limite de transações
    // Taxa por transação

    public void accessFee() {
        int extra = getTransactionCount() - getMonthlyQuota();
        if (extra > 0) {
            double total_fee = extra * getFee();
            double balance = getBalance() - total_fee;
            setBalance(balance);
        }
        transactionCount = 0;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getMonthlyQuota() {
        return monthlyQuota;
    }

    public void setMonthlyQuota(int monthlyQuota) {
        this.monthlyQuota = monthlyQuota;
    }

    public int getTransactionCount() {
        return transactionCount;
    }
}

/*
*Account com cheques
*
 fee = (total_transactions - monthly_quota) * per_transaction_fee*/
