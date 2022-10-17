import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) throws Exception {
        float a, b, c;
        double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        Locale.setDefault(Locale.US);

        System.out.print("A: ");
        a = inputF.nextFloat();

        System.out.print("B: ");
        b = inputF.nextFloat();

        System.out.print("C: ");
        c = inputF.nextFloat();

        areaTriangulo = a * c / 2;
        areaCirculo = Math.PI * (Math.pow(c, 2));
        areaTrapezio = ((a + b) * c) / 2;
        areaQuadrado = (Math.pow(b, 2));
        areaRetangulo = a * b;

        System.out.printf("%nTRIÂNGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO:   %.3f%n", areaCirculo);
        System.out.printf("TRAPÉZIO:  %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO:  %.3f%n", areaQuadrado);
        System.out.printf("RETÂNGULO: %.3f%n%n", areaRetangulo);

        inputF.close();
    }
}
