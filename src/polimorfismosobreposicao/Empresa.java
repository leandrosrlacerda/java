package polimorfismosobreposicao;

/*Você está criando um sistema de gerenciamento de funcionários de uma empresa. Todos os funcionários possuem um nome e um salário base. Há dois tipos específicos:
        •	Gerente, que recebe um bônus fixo adicional.
        •	Desenvolvedor, que pode receber bônus variável dependendo de um nível de performance ("baixo", "médio" ou "alto").*/

public class Empresa {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Leandro",4000, 1500);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Ana Luiza", 6000, "alto");

        System.out.println(gerente); // Usa override
        System.out.println("Nome: " + desenvolvedor.getNome() +
                " | Salário: " + desenvolvedor.calcularSalario(desenvolvedor.getNivelDePerformance())); // Usa overload

    }
}
