package excecoes.ex5.model.entities;

import excecoes.ex5.model.exceptions.DomainException;

public class Account {

    private Integer number;
    private String holder; // titular
    private Double balance; // saldo
    private Double withdrawLimit; // limite de saque

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) {
        validateWithdraw(amount);
        this.balance -= amount;
    }

    public void validateWithdraw(Double amount){
        if (amount > this.withdrawLimit) {
            throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
        }
        if (this.balance < amount) {
            throw new DomainException("Not enough balance");
        }
    }

}
