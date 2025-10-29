package generics.set.map.ex2.application;

import generics.set.map.ex2.entities.Product;
import generics.set.map.ex2.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        String path = "./in.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String line = bufferedReader.readLine();
            while (line != null){

                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bufferedReader.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most expensive: " + x);

        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());;
        }

    }
}
