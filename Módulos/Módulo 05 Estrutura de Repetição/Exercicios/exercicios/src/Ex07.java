import java.util.Scanner;
import java.util.Locale;

public class Ex07 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(new Locale("en", "US"));

        int n, i;
        double n1, n2, media;

        Scanner input = new Scanner(System.in);

        System.out.print("Números pares: ");
        n = input.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print("Dividendo: ");
            n1 = input.nextDouble();

            System.out.print("Denomidador: ");
            n2 = input.nextDouble();

            if (n2 != 0) {
                media = n1 / n2;
                System.out.printf("%.1f%n", media);
            } else {
                System.out.println("Divisão impossível.");
            }

        }

        input.close();
    }
}
