import java.util.Scanner;

import javax.swing.InputMap;

public class Ex03 {
    public static void main(String[] args) throws Exception {

        int a, g, d, choice;
        boolean stopOrContinue = false;

        Scanner input = new Scanner(System.in);

        a = 0;
        g = 0;
        d = 0;

        while (!stopOrContinue) {
            System.out.printf("%n[1] Álcool%n[2] Gasolina%n[3] Diesel%n[4] Sair%n%n");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    a++;
                    break;
                case 2:
                    g++;
                    break;
                case 3:
                    d++;
                    break;
                default:
                    stopOrContinue = true;
                    break;
            }
        }
        System.out.printf("MUITO OBRIGADO!%nÁlcool: %d%nGasolina: %d%nDiesel: %d%n%n", a, g, d);
        input.close();
    }
}
