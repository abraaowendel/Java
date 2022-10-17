import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) throws Exception {

        int codigo, quant;
        double valorTotal;

        Scanner input = new Scanner(System.in);

        System.out.printf(
                "[1] Cachorro Quente R$4.00%n[2] X-Salada R$4.50%n[3] X-Bacon  R$5.00%n[4] Torrada Simples R$2.00%n[5] Refrigerante R$1.50");

        System.out.printf("%n%nDigite o Código: ");
        codigo = input.nextInt();

        if (codigo > 0 && codigo < 6) {

            System.out.print("Quantidade: ");
            quant = input.nextInt();

            if (codigo == 1) {
                valorTotal = quant * 4;
            } else if (codigo == 2) {
                valorTotal = quant * 4.50;
            } else if (codigo == 3) {
                valorTotal = quant * 5;
            } else if (codigo == 4) {
                valorTotal = quant * 2;
            } else {
                valorTotal = quant * 1.50;
            }
            Locale.setDefault(Locale.US);
            System.out.printf("Total R$%.2f%n", valorTotal);
        } else {
            System.out.println("Código Inválido.");
        }

        input.close();
    }
}
