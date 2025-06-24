package folhadepagamento;

public class ComissionedEmployee extends Employee {

    private double commission; // o custo por unidade
    private int units; // controle do número de unidades vendidas

    public ComissionedEmployee(String first_name, String last_name, double salary, double commission){
        super(first_name, last_name, salary);
        this.commission = commission;
    }
    @Override
    public double calculatePay(){
        return getSalary() + (commission * units);
    }

    public void addSales(int units){
        this.units += units;
    }

    public int getSales(){
        return this.units;
    }

    public void resetSales(){
        this.units = 0;
    }
}
