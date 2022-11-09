package models.entities;

import models.exceptions.DomainExceptions;

public class Account {

    private Integer number;
    private String holder;
    private Double balance = 0.0;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.withdrawLimit = withdrawLimit;
        deposit(balance);
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

    public void withdraw(Double amount) throws DomainExceptions {
        if (amount > withdrawLimit) {
            throw new DomainExceptions("Valor do saque ultrapassa o limite de saque.");
        }
        if (amount > balance) {
            throw new DomainExceptions("Sem saldo.");
        }

        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "Novo saldo: R$ " + balance;
    }
}
