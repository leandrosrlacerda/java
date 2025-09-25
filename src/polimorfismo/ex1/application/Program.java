package polimorfismo.ex1.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import polimorfismo.ex1.entities.Employee;
import polimorfismo.ex1.entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		List<Employee> employees = new ArrayList<Employee>();

		System.out.print("Enter the number of employees: ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = input.next().charAt(0);
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Hours: ");
			int hours = input.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = input.nextDouble();

			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additinalCharge = input.nextDouble();

				employees.add(new OutsourceEmployee(name, hours, valuePerHour, additinalCharge));
			} else {
				employees.add(new Employee(name, hours, valuePerHour));
			}
		}

		System.out.println();
		System.out.println("PAYMENTS:");

		for (Employee employee : employees) {
			System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
		}

		input.close();
	}
}
