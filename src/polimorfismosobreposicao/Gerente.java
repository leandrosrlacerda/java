package polimorfismosobreposicao;

public class Gerente extends Funcionario{

    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }
    // sobreposicao
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonus;
    }
}
