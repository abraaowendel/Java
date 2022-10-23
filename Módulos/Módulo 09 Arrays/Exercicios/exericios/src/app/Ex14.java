package app;

import java.util.Locale;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int linha, coluna;

        System.out.print("Linhas: ");
        linha = input.nextInt();
        System.out.print("Colunas: ");
        coluna = input.nextInt();

        int[][] matriz = new int[linha][coluna];

        System.out.println("-----------------------");
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.printf("%dº Linha, %d° Coluna: ", l + 1, c + 1);
                matriz[l][c] = input.nextInt();
            }
            System.out.println("-----------------------");
        }

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c] + " ");
            }
            System.out.println();
        }

        System.out.print("Number: ");
        int number = input.nextInt();
        System.out.println();

        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if (matriz[l][c] == number) {
                    System.out.println(showDataMatriz(matriz, l, c));
                }
            }
        }
        input.close();
    }

    public static String showDataMatriz(int[][] matriz, int linha, int coluna) {
        String left, right, up, down;

        if (coluna - 1 >= 0) {
            left = "Left: " + matriz[linha][coluna - 1];
        } else {
            left = "Left: Nao há";
        }

        if (coluna + 1 < matriz[0].length) {
            right = "Rigth: " + matriz[linha][coluna + 1];
        } else {
            right = "Right: Nao há.";
        }
        if (linha - 1 >= 0) {
            up = "Up: " + matriz[linha - 1][coluna];
        } else {
            up = "Up: Nao há.";
        }

        if (linha + 1 < matriz.length) {
            down = "Down: " + matriz[linha + 1][coluna];
        } else {
            down = "Down: Nao há.";
        }

        return "Position: " + linha + ", " + coluna + "\n" +
                left + "\n" +
                right + "\n" +
                up + "\n" +
                down + "\n";

    }

}
