import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        double raio, pi, formula;
        pi = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.print("Raio: ");
        raio = input.nextDouble();

        formula = pi * Math.pow(raio, 2);

        input.close();
        Locale.setDefault(Locale.US);
        System.out.printf("AREA = %f%n", formula);


    }
}
