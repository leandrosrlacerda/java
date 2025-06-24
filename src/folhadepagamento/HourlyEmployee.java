package folhadepagamento;

public class HourlyEmployee extends Employee {

    private int hours;  // controla o número de horas trabalhadas

    public HourlyEmployee(String first_name, String last_name, double salary) {
        super(first_name, last_name, salary);
    }

    @Override
    public double calculatePay() {
        return getSalary() * hours;
    }

    public void addHours(int hours) {
        this.hours += hours;
    }

    public int getHours() {
        return this.hours;
    }

    public void resetHours() {
        this.hours = 0;
    }
}
