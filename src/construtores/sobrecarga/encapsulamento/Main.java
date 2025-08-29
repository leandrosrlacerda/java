package construtores.sobrecarga.encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();
        System.out.print("Enter account holder name: ");
        String accountHolderName = input.next();
        input.nextLine();
        System.out.print("Is there initial deposit (y/n)? ");
        char response = input.next().charAt(0);


        if (response == 'y') {
            System.out.print("Initial deposit amount: ");
            double depositAmount = input.nextDouble();
             account = new Account(accountHolderName, accountNumber, depositAmount);
        } else {
             account = new Account(accountHolderName, accountNumber);
        }

        System.out.println("Account data: ");
        System.out.println(account);

        System.out.print("Enter deposit amount: ");
        double amount = input.nextDouble();

        account.depositar(amount);

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.print("Enter withdrawal amount: ");
        amount = input.nextDouble();

        account.sacar(amount);

        System.out.println("Updated account data: ");
        System.out.println(account);

        input.close();
    }
}
