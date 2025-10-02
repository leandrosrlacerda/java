package excecoes.ex5.application;

import excecoes.ex5.model.entities.Account;
import excecoes.ex5.model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = input.nextInt();
        System.out.print("Holder: ");
        input.nextLine();
        String holder = input.nextLine();
        System.out.print("Initial balance: ");
        Double balance = input.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withdrawLimit = input.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdrawal: "); // Insira o valor da retirada:
        Double amount = input.nextDouble();

        try {
            account.withdraw(amount);
            System.out.println("Updated account data:");
            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));

        } catch (DomainException e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}
