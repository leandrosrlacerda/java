package interfaces.ex1.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import interfaces.ex1.model.entities.CarRental;
import interfaces.ex1.model.entities.Vehicle;
import interfaces.ex1.model.services.BrazilTaxService;
import interfaces.ex1.model.services.RentalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = input.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(input.nextLine(), dateTimeFormatter);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(input.nextLine(), dateTimeFormatter);
		
		CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Entre com o preço por hora: ");
		double pricePerHour = input.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = input.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		rentalService.processInvoice(carRental);
		
		System.out.println();
		System.out.println("FATURA");
		System.out.println("Pagamento básico: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f", carRental.getInvoice().getTax()));
		System.out.println("Pagamento total: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));
		
		
		
		
		input.close();
	}

}
