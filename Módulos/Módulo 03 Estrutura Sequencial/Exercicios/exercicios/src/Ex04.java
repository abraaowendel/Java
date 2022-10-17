import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) throws Exception {

        int horas, numero;
        float salario, valorHora;

        Scanner inputC = new Scanner(System.in);

        System.out.print("Numero: ");
        numero = inputC.nextInt();

        System.out.print("Horas trabalhadas: ");
        horas = inputC.nextInt();

        System.out.print("Valor recebido por hora: ");

        valorHora = inputC.nextFloat();

        salario = valorHora * horas;

        Locale.setDefault(Locale.US);

        System.out.printf("Numero: %d%nSalário = U$ %.2f%n", numero, salario);

        inputC.close();

    }
}
