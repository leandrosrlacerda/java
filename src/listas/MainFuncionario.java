package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainFuncionario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = input.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ": ");
            System.out.print("Id: ");
            Integer id = input.nextInt();

            while (hasId(list, id)){
                System.out.println("Id already exists! Try again:");
                System.out.print("Id: ");
                id = input.nextInt();
            }

            System.out.print("Name: ");
            input.nextLine();
            String name = input.next();
            System.out.print("Salary: ");
            Double salary = input.nextDouble();

            Funcionario f = new Funcionario(id, name, salary);
            list.add(f);

        }

        System.out.println();
        System.out.print("Enter the employee ID that will have salary increase: ");
        int id = input.nextInt();

       Funcionario f = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        //   Integer pos = position(list, id);

        if (f == null){
            System.out.println("Employee not found!");
        } else {
            System.out.print("Enter the percent: ");
            double percent = input.nextDouble();
            f.increaseSalario(percent);
        }

        System.out.println("List of employees: ");
        for (Funcionario funcionario : list) {
            System.out.println(funcionario);
        }

        input.close();
    }

    public static Integer position(List<Funcionario> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Funcionario> list, int id){
        Funcionario funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return funcionario != null;
    }

}
