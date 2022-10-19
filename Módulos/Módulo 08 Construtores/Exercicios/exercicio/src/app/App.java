package app;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double value;
        Account account;

        System.out.print("Digite o número da conta: ");
        int accountNumber = input.nextInt();

        System.out.print("Digite o nome do Titular da conta: ");
        String name = input.next();

        Account acc = new Account(name, accountNumber);

        System.out.print("Deseja fazer um deposito inicial [Y/N]? ");
        String response = input.next();

        if (response.toUpperCase().equals("Y") == true) {
            System.out.print("\nQuanto deseja depositar: ");
            value = input.nextDouble();
            account = new Account(name, accountNumber, value);
        }
        else{
            account = new Account(name, accountNumber);
        }

        System.out.printf("%n%s%n", acc.toString());

        int choice;

        do {
            System.out.println("\n[1] Fazer um depósito:\n[2] Sacar\n[3] Saldo bancário\n[4] Trocar nome\n[5] Sair\n");
            System.out.print("Sua escolha: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Quanto deseja depositar: ");
                    value = input.nextDouble();
                    acc.deposit(value);
                    System.out.printf("Deposito de %.2f foi realizado com sucesso.%n", value);
                    System.out.printf("Nova movimentação: %n%s%n", acc.toString());
                    break;
                case 2:
                    System.out.print("Quanto deseja sacar: ");
                    value = input.nextDouble();

                    if (value > acc.getBalance()) {
                        System.out.println("Saldo bancário insuficiente.");
                    } else {
                        acc.withdraw(value);
                        System.out.printf("Foram sacados R$%.2f da sua conta.%nForam cobrado R$5 reais pelo saque.%n",
                                value);
                        System.out.printf("Nova movimentação: %n%s%n", acc.toString());
                    }
                    break;
                case 3:
                    System.out.printf("%s%n", acc.toString());
                    break;
                case 4:
                    System.out.print("Digite o novo nome do Titular: ");
                    name = input.next();
                    acc.setName(name);
                    System.out.println("Nome do Titular foi alterado com sucesso.");
                    System.out.printf("%s%n", acc.toString());
                    break;
                case 5:
                    System.out.println("O Sistema será desligado, volte sempre...\n");
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
                    break;
            }

        } while (choice != 5);

        input.close();
    }
}