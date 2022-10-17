import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(new Locale("en", "US"));

        int n, i;
        double n1, n2, n3, media;

        Scanner input = new Scanner(System.in);

        System.out.print("Casos de teste: ");
        n = input.nextInt();

        for (i = 0; i < n; i++) {

            System.out.print("n1: ");
            n1 = input.nextDouble();

            System.out.print("n2: ");
            n2 = input.nextDouble();

            System.out.print("n3: ");
            n3 = input.nextDouble();

            media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
            System.out.printf("Média: %.1f%n", media);
        }

        input.close();
    }
}
