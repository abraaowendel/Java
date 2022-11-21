package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entitites.Contract;
import model.entitites.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");

        System.out.print("Numero: ");
        int number = input.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(input.next(), fmt);

        System.out.print("Valor do contrato: ");
        Double amount = input.nextDouble();

        System.out.print("Quantas parcelas: ");
        int months = input.nextInt();

        Contract contract = new Contract(number, date, amount);

        ContractService service = new ContractService(new PaypalService());

        service.processContract(contract, months);

        System.out.println("Parcelas: ");

        for (Installment obj : contract.getInstallment()) {
            System.out.println(obj);
        }

        input.close();
    }
}
