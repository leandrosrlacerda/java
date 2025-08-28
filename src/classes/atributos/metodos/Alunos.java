package classes.atributos.metodos;

public class Alunos {

    public String name;
    public double primeiroTrimestre;
    public double segundoTrimestre;
    public double terceiroTrimestre;

    public double notaFinal() {
        return (primeiroTrimestre + segundoTrimestre + terceiroTrimestre);
    }

    public double missingPoints(){
        if (notaFinal() < 60.0) {
            return 60.0 - notaFinal();
        } else {
            return 0.0;
        }
    }
}
