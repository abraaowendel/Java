package app;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double value;

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int accountNumber = input.nextInt();

        System.out.print("Digite o nome do Titular da conta: ");
        String name = input.next();

        Account acc = new Account(name, accountNumber);

        System.out.print("Deseja fazer um deposito inicial [Y/N]? ");
        String answer = input.next();

        if (answer.toUpperCase().equals("Y") == true) {
            System.out.print("\nQuanto deseja depositar: ");
            value = input.nextDouble();
            acc.setDeposit(value);
        }

        System.out.printf("%n%s%n", acc.toString());

        int choice;

        do {
            System.out.println("\n[1] Fazer um depósito:\n[2] Sacar\n[3] Saldo bancário\n[4] Sair\n");
            System.out.print("Sua escolha: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Quanto deseja depositar: ");
                    value = input.nextDouble();
                    acc.setDeposit(value);
                    break;
                case 2:
                    System.out.print("Quanto deseja sacar: ");
                    value = input.nextDouble();

                    if (value > acc.getBalance()) {
                        System.out.println("Saldo bancário insuficiente.");
                    } else {
                        acc.setWithdraw(value);
                        System.out.printf("Foram sacados R$%.2f da sua conta.%nForam cobrado R$5 reais pelo saque.%n",
                                value);
                    }

                    break;
                case 3:
                    System.out.printf("Conta %d, Titular: %s, Saldo em conta: R$%f%n", acc.getAccountNumber(),
                            acc.getName(), acc.getBalance());
                    break;
                case 4:
                    System.out.println("O Sistema será desligado, volte sempre...\n");
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
                    break;
            }

        } while (choice != 4);

        input.close();
    }
}