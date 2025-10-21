package interfaces.ex4.application;
import interfaces.ex4.services.BrazilInterestService;
import interfaces.ex4.services.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = input.nextDouble();
        System.out.print("Months: ");
        int months = input.nextInt();

        InterestService service = new BrazilInterestService(1.0);
        double payment = service.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("R$ %.2f ", payment));

        input.close();
    }
}
