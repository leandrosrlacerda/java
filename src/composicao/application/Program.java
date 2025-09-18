package composicao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import composicao.model.entities.Client;
import composicao.model.entities.Order;
import composicao.model.entities.OrderItem;
import composicao.model.entities.Product;
import composicao.model.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = input.nextLine();
		System.out.print("Email: ");
		String email = input.next();
		System.out.print("Birth date (DD/MM/YYY): ");
		// o .parse converte uma STRING para DATE
		Date birthDate = sdf.parse(input.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		// .valueOf converte a STRING no tipo ENUM
		OrderStatus status = OrderStatus.valueOf(input.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int N = input.nextInt();
		
		
		for (int i = 1; i <= N; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			input.nextLine();
			String productName = input.nextLine();
			System.out.print("Product price: ");
			Double productPrice = input.nextDouble();
			System.out.print("Quantity: ");
			int quantity = input.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem item = new OrderItem(quantity, productPrice, product);
			
			order.addItem(item);
			
		}
		
		System.out.println();
		System.out.println(order);
		
		input.close();
	}
}
