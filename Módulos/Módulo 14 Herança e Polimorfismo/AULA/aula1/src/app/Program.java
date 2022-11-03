package app;

import entities.Account;
import entities.BusinessAccount;

public class Program {
    public static void main(String[] args) throws Exception {

        Account acc  = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1001, "Maria", 0.0, 500.0);
        Account acc1 = bacc;
    }
}
