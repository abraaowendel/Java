import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) throws Exception {
        int a,b;

        Scanner input = new Scanner(System.in);

        System.out.print("A: ");
        a = input.nextInt();

        System.out.print("B: ");
        b = input.nextInt();

        if(a % b == 0 || b % a == 0){
            System.out.println("SÃO MULTIPLOS");
        }
        else{
            System.out.println("NÃO SÃO MULTIPLOS");
        }
    
        input.close();
    }
}
