package interfaces.ex2.aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import interfaces.ex2.model.entities.Contract;
import interfaces.ex2.model.entities.Installment;
import interfaces.ex2.model.services.ContractService;
import interfaces.ex2.model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		System.out.println("Entre com os dados do contrato");
		System.out.print("Número: ");
		int number = input.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(input.next(), formatter);
		System.out.print("Valor do contrato: ");
		double totalValue = input.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.print("Entre com o número de parcelas: ");
		int n = input.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, n);
		
		System.out.println("Parcelas:");
		
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
		
		input.close();
		
	}
}
