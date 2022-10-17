import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) throws Exception {
        double n;

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n = input.nextDouble();

        if (n < 0 || n > 100) {
            System.out.println("FORA DO INTERVALO.");
        } else {
            if (n <= 25) {
                System.out.println("Intervalo [0,25]");
            } else if (n <= 50) {
                System.out.println("Intervalo [25,50]");
            } else if (n <= 75) {
                System.out.println("Intervalo [50,75]");
            } else {
                System.out.println("Intervalo [75,100]");
            }
        }
        input.close();
    }
}
