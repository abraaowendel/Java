import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) throws Exception {
        int inicio, fim, diferenca;

        Scanner input = new Scanner(System.in);

        System.out.print("INICIO: ");
        inicio = input.nextInt();

        System.out.print("FIM: ");
        fim = input.nextInt();

        if (inicio > -1 && inicio < 24 && fim > -1 && fim < 24) {
            if (inicio < fim) {
                diferenca = fim - inicio;
            } else {
                diferenca = 24 - inicio + fim;
            }
            System.out.printf("O JOGO DUROU %dHORA(S)%n", diferenca);
        } else {
            System.out.println("HORÁRIO INVÁLIDO.");
        }

        input.close();
    }
}
