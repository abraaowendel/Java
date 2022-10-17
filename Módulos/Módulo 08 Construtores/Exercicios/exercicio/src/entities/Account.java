package entities;

public class Account {

    private String name;
    private int accountNumber;
    private double balance;

    public Account(String name, int number) {
        this.name = name;
        accountNumber = number;
    }
    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
    public int getAccountNumber(){
        return accountNumber;
    }

    public void setDeposit(double value) {
        balance += value;
    }

    public void setWithdraw(double value) {
        balance -= value + 5;
    }

    public String toString() {
        return "Olá, " + name + "\nSaldo em conta: R$" + String.format("%.2f", balance);
    }

}
