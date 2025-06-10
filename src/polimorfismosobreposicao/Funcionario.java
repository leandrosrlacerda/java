package polimorfismosobreposicao;

public class Funcionario {

    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nSalário: " + calcularSalario();
    }
}
