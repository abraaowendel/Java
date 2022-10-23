import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int linha, coluna;

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas linhas: ");
        linha = input.nextInt();
        System.out.print("Quantas colunas: ");
        coluna = input.nextInt();

        int[][] matriz = new int[linha][coluna];
        System.out.println("------------------------------");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.printf("Digite o %dº numero da %d° linha: ", j + 1, i+1);
                matriz[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("------------------------------");
        
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

        input.close();

    }
}
