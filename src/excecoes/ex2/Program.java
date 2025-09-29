package excecoes.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        System.out.println("***METHOD1 START***");
        method2();
        System.out.println("***METHOD1 END***");
    }

    public static void method2() {
        System.out.println("***METHOD2 START***");
        Scanner input = new Scanner(System.in);

        try {
            String[] vect = input.nextLine().split(" ");
            int position = input.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Input error");
            e.printStackTrace();
        }

        System.out.println("End of program");

        input.close();
        System.out.println("***METHOD2 END***");
    }
}
