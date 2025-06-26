package banco_heranca;

import java.util.Collection;
import java.util.Hashtable;

public class Bank {

    private Hashtable<String, BankAccount> accounts = new Hashtable<>();

    public void addAccount(String name, BankAccount account) {
        accounts.put(name, account);
    }

    // método calcula o saldo total de todas as contas bancárias armazenadas no banco
    public double totalHoldings() {
        return calculateTotalBalance(accounts.values());
    }

    private double calculateTotalBalance(Collection<BankAccount> bankAccounts) {
        return bankAccounts.stream()
                .mapToDouble(BankAccount::getBalance)
                .sum();
    }

    public int totalAccounts() {
        return accounts.size();
    }

    public void deposit(String name, double amount){
        BankAccount account = retrieveAccount(name);
        if (account != null){
            account.deposit(amount);
        }
    }

    public double balance(String name){
        BankAccount account = retrieveAccount(name);
        if (account != null){
            return account.getBalance();
        }
        return 0.0;
    }

    private BankAccount retrieveAccount(String name) {
        return accounts.get(name);
    }

}
