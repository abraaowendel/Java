import java.util.Scanner;
import java.util.function.Function;

public class Ex10 {
    public static void main(String[] args) throws Exception {
        int quadrado, cubo;

        Scanner input = new Scanner(System.in);

        System.out.print("N: ");
        int n = input.nextInt();

        for (int i = 1; i < n; i++) {
            quadrado = i * i;
            cubo = i * i * i;
            System.out.printf("%d %d %d%n", i, quadrado, cubo);
        }
       
        input.close();
    }
    
}
