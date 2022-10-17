import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) throws Exception {

        int codigoPeca1, codigoPeca2, quantPeca1, quantPeca2;
        double valorPeca1, valorPeca2, valorTotal;

        Locale.setDefault(Locale.US);

        Scanner inputD = new Scanner(System.in);

        System.out.print("Código Peça 1: ");
        codigoPeca1 = inputD.nextInt();

        System.out.print("Quantidade de peças 1: ");
        quantPeca1 = inputD.nextInt();

        System.out.print("Valor da peça: ");
        valorPeca1 = inputD.nextDouble();

        System.out.print("Código Peça 2: ");
        codigoPeca2 = inputD.nextInt();

        System.out.print("Quantidade de peças 2: ");
        quantPeca2 = inputD.nextInt();

        System.out.print("ValorPeca2: ");
        valorPeca2 = inputD.nextDouble();

        valorTotal = (quantPeca1 * valorPeca1) + (quantPeca2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$%.2f%n", valorTotal);

        inputD.close();

    }
}
