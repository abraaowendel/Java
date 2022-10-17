import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        int n;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n = input.nextInt();

        if (n > -1) {
            System.out.println("NÃO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }

        input.close();
    }
}
