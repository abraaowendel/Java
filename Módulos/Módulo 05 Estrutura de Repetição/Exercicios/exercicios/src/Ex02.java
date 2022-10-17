import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        boolean stop = false;

        while (!stop) {
            System.out.print("X: ");
            int x = input.nextInt();

            System.out.print("Y: ");
            int y = input.nextInt();

            if (y != 0 && x != 0) {
                if (x > 0 && y > 0) {
                    System.out.println("Primeiro ");
                } else if (x < 0 && y > 0) {
                    System.out.println("Segundo");
                } else if (x < 0 && y < 0) {
                    System.out.println("Terceiro");
                } else {
                    System.out.println("Quarto");
                }
            } else {
                stop = true;
            }
        }
        input.close();
    }
}
