package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Ex03 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Nota 1: ");
        student.FirstNote = input.nextDouble();

        System.out.print("Nota 2: ");
        student.SecondNote = input.nextDouble();

        System.out.print("Nota 3: ");
        student.ThirdNote = input.nextDouble();

        student.Grades();

        System.out.printf("FINAL GRADE = %.2f%n", student.Total);
        System.out.printf("%s%n", student.PassOrFailed());
        input.close();

    }
}
