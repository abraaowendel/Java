import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) throws Exception {
        int x, i;

        Scanner input = new Scanner(System.in);

        System.out.print("Valor: ");
        x = input.nextInt();

        for (i = 1; i <= x; i += 2) {
            System.out.print(i + " ");
        }

        input.close();
    }
}
