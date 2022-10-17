import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) throws Exception {
        double salario, valorImposto;

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.print("Salário: ");
        salario = input.nextInt();

        if (salario >= 0) {
            if (salario <= 2000) {
                System.out.println("ISENTO");
            } else {

                if (salario > 2000) {
                    valorImposto = (salario * 8) / 100;
                } else if (salario > 3000) {
                    valorImposto = (salario * 18) / 100;
                } else {
                    valorImposto = (salario * 28) / 100;
                }

                System.out.printf("R$ %.2f%n", valorImposto);
            }
        } else {
            System.out.printf("DIGITE UM SALÁRIO VÁLIDO.");
        }

        input.close();
    }
}
