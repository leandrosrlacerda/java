package polimorfismosobreposicao;

public class Desenvolvedor extends Funcionario {

    private String nivelDePerformance;

    public Desenvolvedor(String nome, double salarioBase, String nivelDePerformance) {
        super(nome, salarioBase);
        this.nivelDePerformance = nivelDePerformance;
    }

    // sobrecarga
    public double calcularSalario(String nivel) {
        double base = super.calcularSalario();
        switch (nivel.toLowerCase()) {
            case "medio":
                return base * 1.10;
            case "alto":
                return base * 1.20;
            default:
                return base;
        }
    }

    public String getNivelDePerformance() {
        return nivelDePerformance;
    }
}
