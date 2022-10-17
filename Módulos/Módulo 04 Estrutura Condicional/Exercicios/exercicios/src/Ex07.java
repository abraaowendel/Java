import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) throws Exception {
        double x, y;
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("X: ");
        x = input.nextDouble();

        System.out.print("Y: ");
        y = input.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else {

            if (x == 0) {
                System.out.println("X");
            } else if (y == 0) {
                System.out.println("Y");
            }

            else if (x > 0 && y > 0) {
                System.out.println("Q1");
            }

            else if (x < 0 && y > 0) {
                System.out.println("Q2");
            }

            else if (x < 0 && y < 0) {
                System.out.println("Q3");
            }

            else if (x > 0 && y < 0) {
                System.out.println("Q4");
            }
        }

        input.close();
    }
}
