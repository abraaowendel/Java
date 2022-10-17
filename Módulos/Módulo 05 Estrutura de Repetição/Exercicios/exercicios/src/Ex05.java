import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) throws Exception {
        int in, on, i, n, x;

        in = on = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Quantidade de números: ");
        n = input.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print("Número: ");
            x = input.nextInt();

            if (x >= 10 && x <= 20) {
                in++;
            } else {
                on++;
            }
        }

        System.out.printf("%d in%n%d out%n", in, on);
        input.close();
    }
}
