package entities;

public class Account {

    private String name;
    private int accountNumber;
    private double balance;

    public Account(String name, int number) {
        this.name = name;
        accountNumber = number;
    }

    public Account(String name, int number, double initialDeposit) {
        this.name = name;
        this.accountNumber = number;
        deposit(initialDeposit);
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double value) {
        balance += value;
    }

    public void withdraw(double value) {
        balance -= value + 5;
    }

    public String toString() {
        return "Conta: "
                + accountNumber +
                ", Titular: " +
                name +
                ", Saldo em conta: R$"
                + String.format("%.2f", balance);
    }

}
