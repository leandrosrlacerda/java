package estruturacondicional;

import java.util.Scanner;

public class Operadora {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double valorPlano = 50.00;
        int franquia = 100;
        int minutosUtilizados;

        System.out.print("Digite os minutos utilizados: ");
        minutosUtilizados = input.nextInt();

        if(minutosUtilizados < 100){
            System.out.printf("valor a pagar: %.2f%n", valorPlano);
        } else {
            valorPlano = valorPlano + ((minutosUtilizados - franquia)) * 2;
            System.out.printf("valor a pagar: %.2f%n", valorPlano);
        }
        input.close();
    }
}
