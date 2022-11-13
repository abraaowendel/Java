import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o Caminho: ");
        String strPath  = input.nextLine();

        File path = new File(strPath);
        System.out.println("Caminho completo: " + path.getPath());
        System.out.println("Nome do arquivo/pasta: " + path.getName());
        System.out.println("Pai: " + path.getParent());
        System.out.println(path.getTotalSpace());
        input.close();
    }
}
