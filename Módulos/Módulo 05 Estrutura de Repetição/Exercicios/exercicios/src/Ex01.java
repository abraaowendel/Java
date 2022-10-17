import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int PasswordUser;
        boolean Auth = false;

        while (Auth == false) {
            System.out.print("Digite sua senha: ");
            PasswordUser = input.nextInt();

            if (PasswordUser == 2002) {
                System.out.printf("%nAcesso liberado.%n");
                Auth = true;
            } else {
                System.out.printf("Acesso negado.%n");
            }

        }
        input.close();
    }
}
