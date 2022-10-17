import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) throws Exception {
        int a,b,c,d, formula;

        Scanner inputB = new Scanner(System.in);

        System.out.print("A: ");
        a = inputB.nextInt();

        System.out.print("B: ");
        b = inputB.nextInt();

        System.out.print("C: ");
        c = inputB.nextInt();

        System.out.print("D: ");
        d = inputB.nextInt();

        inputB.close();

        formula = a * b - c * d;

        System.out.printf("DIFERENÇA = %d%n", formula);
    }
}
