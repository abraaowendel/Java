import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        int n;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        n = input.nextInt();
        
        if(n % 2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
    
        input.close();
    }
}
