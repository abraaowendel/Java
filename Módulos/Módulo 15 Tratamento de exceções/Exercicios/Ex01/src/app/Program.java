package app;

import java.util.Locale;
import java.util.Scanner;

import models.entities.Account;
import models.exceptions.DomainExceptions;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Informe os dados da Conta: ");
        System.out.print("Número: ");
        int number = input.nextInt();
        System.out.print("Titular: ");
        input.nextLine();
        String holderName = input.nextLine();
        System.out.print("Saldo inicial: ");
        double initialBalance = input.nextDouble();
        System.out.print("Limite de saque: ");
        double withdrawLimit = input.nextDouble();

        Account account = new Account(number, holderName, initialBalance, withdrawLimit);

        System.out.println();
        System.out.print("Informe uma quantia para sacar: ");

        try {
            account.withdraw(input.nextDouble());
            System.out.println(account);
        }
        catch(DomainExceptions e){
            System.out.println("Erro de saque: " + e.getMessage());
        }
        
        input.close();
    }
}
