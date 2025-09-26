package polimorfismo.ex4.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import polimorfismo.ex4.entities.Company;
import polimorfismo.ex4.entities.Individual;
import polimorfismo.ex4.entities.TaxPayer;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		List<TaxPayer> payers = new ArrayList<TaxPayer>(); 
		
		System.out.print("Enter the number of tax payers: "); // Introduza o número de contribuintes
		int n = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or Company (i/c)? ");
			char c = input.next().charAt(0);
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = input.nextDouble();
			
			if (c == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = input.nextDouble();
				
				payers.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = input.nextInt();
				
				payers.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:\n");
		
		double totalTaxes = 0.0; 
		
		for (TaxPayer taxPayer : payers) {
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
			totalTaxes += taxPayer.tax();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
		
		input.close();
		
	}
}
