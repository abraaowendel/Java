import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        int n1, n2, result;
        
        Scanner inputE = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n1 = inputE.nextInt();

        System.out.print("Digite outro número: ");
        n2 = inputE.nextInt();

        inputE.close();
        result = n1 + n2;

        System.out.printf("SOMA entre %d e %d é igual a %d%n", n1, n2, result);
    }
}

    

    