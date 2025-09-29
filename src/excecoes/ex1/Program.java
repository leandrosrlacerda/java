package excecoes.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            String[] vect = input.nextLine().split(" ");
            int position = input.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
        } catch (InputMismatchException e){
            System.out.println("Input error");
        }

        System.out.println("End of program");

        input.close();
    }
}
