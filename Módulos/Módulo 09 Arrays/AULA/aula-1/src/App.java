import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.print("Altura de quantas pessoas: ");
        int n = input.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura [%d]: ", i);
            vect[i] = input.nextDouble();
        }
        
        double sum = 0;
        for (double d : vect) {
            sum += d;
        }

        System.out.printf("Média: %.2f", sum / n);

        input.close();
    }
}
