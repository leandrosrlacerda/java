package interfaces.ex3.application;

import interfaces.ex3.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "./in.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            String employee = bufferedReader.readLine();
            while (employee != null){

                String[] fields = employee.split(",");

                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employee = bufferedReader.readLine();
            }
            Collections.sort(list);

            for (Employee emp : list){
                System.out.println(emp.getName() + " - " + emp.getSalary());
            }

        } catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }

    }
}
