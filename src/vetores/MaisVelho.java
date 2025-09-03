package vetores;

import java.util.Scanner;

public class MaisVelho {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = input.nextInt();
        int maiorIdade = 0, posicao = 0;
        Pessoa[] pessoas = new Pessoa[n];

        input.nextLine();

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            pessoas[i].setNome(input.nextLine());
            System.out.print("Idade: ");
            pessoas[i].setIdade(input.nextInt());
            input.nextLine();
        }

        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i].getIdade() > maiorIdade){
                maiorIdade = pessoas[i].getIdade();
                posicao = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + pessoas[posicao].getNome());
        System.out.println("IDADE DA PESSOA MAIS VELHA: " + pessoas[posicao].getIdade());

        input.close();
    }
}
