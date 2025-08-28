package classes.atributos.metodos;

import java.util.Scanner;

public class MainRetangulo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Entre com a largura e a altura do retangulo: ");
        retangulo.width = input.nextDouble();
        retangulo.height = input.nextDouble();

        System.out.println(retangulo);

        input.close();
    }
}
