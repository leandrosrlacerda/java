package enumeracao.composicao.exercicio1.application;

import enumeracao.composicao.exercicio1.entities.Department;
import enumeracao.composicao.exercicio1.entities.HourContract;
import enumeracao.composicao.exercicio1.entities.Worker;
import enumeracao.composicao.exercicio1.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = input.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = input.nextLine();
        System.out.print("Level: ");
        String workerLevel = input.nextLine();
        System.out.print("Base salary: R$ ");
        double baseSalary = input.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #" + i + " data: ");
            System.out.print("Date (dd/MM/yyyy): ");
            Date contractDate = sdf.parse(input.next());
            System.out.print("Value per hour: R$ ");
            double valuePerHour = input.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = input.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = input.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));


        input.close();

    }
}
