package folhadepagamento;

public class Main {
    public static void main(String[] args) {

        Payroll payroll = new Payroll();

        ComissionedEmployee employee1 = new ComissionedEmployee("Leandro", "Lacerda", 3600.00, 2.5);
        employee1.addSales(5);
        System.out.println("First name: " + employee1.getFirstName());
        System.out.println("Last name: " + employee1.getLastName());
        System.out.println("Base pay: " + employee1.getSalary());
        System.out.println("Total pay: " + employee1.calculatePay());

       HourlyEmployee employee2 = new HourlyEmployee("Ana Luiza", "Prinz", 6000.00);
       employee2.addHours(10);
       payroll.recordEmployeeInfo(employee1);
       payroll.recordEmployeeInfo(employee2);
       payroll.payEmployees(new Employee[]{employee1, employee2});
       payroll.printReport();


    }
}
