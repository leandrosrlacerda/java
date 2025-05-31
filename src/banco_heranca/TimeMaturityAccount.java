package banco_heranca;

public class TimeMaturityAccount extends SavingsAccount {

    private boolean mature;
    private double feeRate;

    public TimeMaturityAccount(double initBalance, double interestRate, double feeRate){
        super(initBalance, interestRate);
        this.feeRate = feeRate;
    }

    // sobrepõe withdraw de BankAccount
    // Tem um status de vencimento (mature) que afeta saques
    public double withdraw(double amount){
        super.withdraw(amount);
        if(!isMature()){
            // taxa para saque antecipado
            double charge = amount * feeRate;
            amount -= charge;
        }
        return amount;
    }

    // verifica o vencimento
    public boolean isMature() {
        return mature;
    }

    // define o vencimento
    public void setMature(boolean mature) {
        this.mature = true;
    }

    // % de taxa para saque antecipado
    public double getFeeRate() {
        return feeRate;
    }
    // configura % de taxa para saque antecipado
    public void setFeeRate(double feeRate) {
        this.feeRate = feeRate;
    }
}

/*
*Conta com vencimento programado

sem penalidade

balance = balance - withdraw_amount

com penalidade

amount_given_to_depositor = amount - (amount * penalty_rate)  */
