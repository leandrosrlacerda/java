package folhadepagamento;

public class Main {
    public static void main(String[] args) {

        ComissionedEmployee c = new ComissionedEmployee("Mr.", "Lacerda", 5.50, 1.00);
        c.addSales(5);
        System.out.println("First name: " + c.getFirstName());
        System.out.println("Last name: " + c.getLastName());
        System.out.println("Base pay: " + c.getSalary());
        System.out.println("Total pay: " + c.calculatePay());

    }
}
