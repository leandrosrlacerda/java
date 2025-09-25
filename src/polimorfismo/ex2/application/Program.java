package polimorfismo.ex2.application;

import polimorfismo.ex2.entities.ImportedProduct;
import polimorfismo.ex2.entities.Product;
import polimorfismo.ex2.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = input.next().charAt(0);
            System.out.print("Name: ");
            input.nextLine();
            String name = input.next();
            System.out.print("Price: ");
            double price = input.nextDouble();
            if (ch == 'c') {
                products.add(new Product(name, price));
            } else if (ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(input.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                products.add(new UsedProduct(name, price, manufactureDate));
            } else {
                System.out.print("Customs fee: ");
                double fee = input.nextDouble();
                products.add(new ImportedProduct(name, price, fee));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }

        input.close();
    }
}
