import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) throws Exception {

        int fatorial = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("N: ");
        int n = input.nextInt();

        if (n == 0) {
            System.out.println("1");
        } else {
            for (int i = n; i >= 1; i--) {
                fatorial = fatorial * i;
            }
            System.out.println(fatorial);
        }
        input.close();
    }
}
