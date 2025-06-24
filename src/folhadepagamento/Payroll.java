package folhadepagamento;

public class Payroll {

    private int total_hours;
    private int total_sales;
    private double total_pay;

    // esse método emprega o polimorfismo de inclusão ( esse metodo funciona para qualquer funcionário - ele simplemente funciona para todos os objetos Employee )
    public void payEmployees(Employee[] employees) {

/*        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];*/
        for (Employee employee : employees) {
            total_pay += employee.calculatePay();
            employee.printPaycheck();
        }
    }

    public void recordEmployeeInfo(ComissionedEmployee comissionedEmployee) {
        total_sales += comissionedEmployee.getSales();
    }

    public void recordEmployeeInfo(HourlyEmployee hourlyEmployee) {
        total_hours += hourlyEmployee.getHours();
    }

    public void printReport() {
        System.out.println("Payroll Report:");
        System.out.println("Total Hours: " + total_hours);
        System.out.println("Total Sales: " + total_sales);
        System.out.println("Total Paid: " + total_pay);
    }

}
