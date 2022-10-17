package app;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Ex04 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double currencyDolar = input.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double amountDolar = input.nextDouble();

        double value = CurrencyConverter.Conversion(currencyDolar, amountDolar);

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.CalculateIof(value));
        input.close();

    }
}