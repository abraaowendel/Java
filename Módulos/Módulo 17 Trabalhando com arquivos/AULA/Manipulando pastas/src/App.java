import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o caminho: ");
        String strPath = input.nextLine();
        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("PASTAS: ");

        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);

        System.out.println("\nARQUIVOS: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean file = new File(strPath + "/newFolder").mkdir();
        System.out.println("Criado com sucesso");
        input.close();
    }
}
