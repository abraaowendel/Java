package app;

import java.util.Locale;
import java.util.Scanner;
import entities.PersonalData;

public class Ex11 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas: ");
        int n = input.nextInt();

        PersonalData[] vect = new PersonalData[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Altura da %dª pessoa: ", i + 1);
            double altura = input.nextDouble();
            System.out.printf("Genero da %dª pessoa [M|F]: ", i + 1);
            String sexo = input.next();
            vect[i] = new PersonalData(altura, sexo.toUpperCase());
        }

        double maiorAltura = vect[0].getAltura();
        double menorAltura = maiorAltura;

        double mediaAlturaF = 0;
        int quantHomens = 0, quantMulheres = 0;

        for (int i = 0; i < vect.length; i++) {

            if (vect[i].getSexo().equals("F")) {
                mediaAlturaF += vect[i].getAltura();
                quantMulheres++;
            } else {
                quantHomens++;
            }

            if (vect[i].getAltura() > maiorAltura) {
                maiorAltura = vect[i].getAltura();
            }
            if (vect[i].getAltura() < menorAltura) {
                menorAltura = vect[i].getAltura();
            }

        }

        System.out.printf("%nMenor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaF / quantMulheres);
        System.out.printf("Numero de homens = %d%n", quantHomens);

        input.close();
    }
}
