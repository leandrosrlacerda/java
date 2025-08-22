package estruturacondicional;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1 = lerDoubleAceitandoVirgulaOuPonto(input, "Digite a primeira nota: ");
        double nota2 = lerDoubleAceitandoVirgulaOuPonto(input, "Digite a segunda nota: ");
        double notaFinal;

        notaFinal = nota1 + nota2;

        if (notaFinal >= 60) {
            System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
            System.out.println("Aluno aprovado!");
        } else {
            System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
            System.out.println("Aluno reprovado!");
        }

        input.close();

    }

    private static double lerDoubleAceitandoVirgulaOuPonto(Scanner input, String prompt) {

        while (true) {
            System.out.println(prompt);
            String linha = input.nextLine().trim();

            // ignora entradas vazias
            if (linha.isEmpty()){
                System.out.println("Entrada vazia. Tente novamente.");
                continue;
            }

            // normaliza para ponto, caso tenha virgula
            linha = linha.replace(',', '.');

            try {
                return Double.parseDouble(linha);
            }catch (NumberFormatException e){
                System.out.println("Valor inválido. Digite um número (ex.: 7,5 ou 7.5).");
            }
        }
    }
}
