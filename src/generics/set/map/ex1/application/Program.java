package generics.set.map.ex1.application;

import generics.set.map.ex1.services.PrintService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        PrintService<String> service =  new PrintService<>();

        System.out.print("How many values? ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            String value = input.next();
            service.addValue(value);
        }

        service.print();
        System.out.println("First: " + service.fisrt());

        input.close();
    }

}
