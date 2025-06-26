package banco_heranca;

public class Main {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount(100, 0.02);
        savingsAccount.deposit(300);
        savingsAccount.addInterest();
        System.out.println("Current balance savingsAccount:" + savingsAccount.getBalance());

        TimeMaturityAccount timeMaturityAccount = new TimeMaturityAccount(100, 0.01, 0.005);
        timeMaturityAccount.deposit(300);
        timeMaturityAccount.addInterest();
        System.out.println("Current balance timeMaturityAccount:" + timeMaturityAccount.getBalance());
        timeMaturityAccount.setMature(false);
        timeMaturityAccount.withdraw(130);
        System.out.println("Current balance timeMaturityAccount:" + timeMaturityAccount.getBalance());

        CheckingAccount checkingAccount = new CheckingAccount(100, 2, 4);
        checkingAccount.deposit(1000);
        checkingAccount.withdraw(50);
        System.out.println("Current balance checkingAccount: " + checkingAccount.getBalance());

        OverdraftAccount overdraftAccount = new OverdraftAccount(100, 0.01);
        overdraftAccount.deposit(300);
        overdraftAccount.chargeInterest();
        System.out.println("Current balance overdraftAccount: " + overdraftAccount.getBalance());
        overdraftAccount.withdraw(50);
        System.out.println("Current balance overdraftAccount: " + overdraftAccount.getBalance());

        System.out.println();

        Bank accountBank = new Bank();
        accountBank.addAccount("conta", savingsAccount);
        accountBank.addAccount("conta2", overdraftAccount);
        System.out.println("Total balance: " + accountBank.totalHoldings());
        System.out.println("Number of accounts: " + accountBank.totalAccounts());
        System.out.println();
        System.out.println("O saldo da conta: " + accountBank.balance("conta"));
        System.out.println("O saldo da conta 2: " + accountBank.balance("conta2"));

    }

}
