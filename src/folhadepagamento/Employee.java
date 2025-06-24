package folhadepagamento;

public abstract class Employee {

    private String first_name;
    private String last_name;
    private double salary;

    public Employee(String first_name, String last_name, double salary){
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public String getFirstName(){
        return this.first_name;
    }

    public String getLastName(){
        return this.last_name;
    }

    public abstract double calculatePay();

    public void printPaycheck(){
        String full_name = last_name + ", " + first_name;
        System.out.println("Pay: " + full_name + " $" + calculatePay());
    }
}
