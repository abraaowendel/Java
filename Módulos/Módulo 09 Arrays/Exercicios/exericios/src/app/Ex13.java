package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employoee;

public class Ex13 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos funcionarios deseja registrar: ");
        int n = input.nextInt();

        List<Employoee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            System.out.printf("%n#%d Funcionário%n", i+1);
            System.out.print("Id: ");
            Integer id = input.nextInt();

            System.out.print("Nome: ");
            input.nextLine();
            String name = input.nextLine();

            System.out.print("Salário: ");
            Double salary = input.nextDouble();
            Employoee emp = new Employoee(id, name, salary);

            list.add(emp);
            System.out.println("---------------------------------");
        }

        System.out.println("Digite o id do funcionário que receberá aumento: ");
        Integer id = input.nextInt();

        Integer pos = hasId(list, id);

        if (pos != null) {
            System.out.print("Digite a porcentagem de aumento: ");
            Double percentagem = input.nextDouble();
            list.get(pos).increaseSalary(percentagem);
        } else {
            System.out.println("Esse id não existe!");
        }

        System.out.println("\nLista de funcionários: ");

        for (Employoee employoee : list) {
            System.out.println(employoee);
        }

        input.close();
    }

    public static Integer hasId(List<Employoee> list, Integer id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
