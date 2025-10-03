package arquivos.ex2.application;

import arquivos.ex2.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the file path: ");
        String pathStr = input.nextLine();

        File path = new File(pathStr);
        String pathFolder = path.getParent();

        boolean success = new File(pathFolder + "/out").mkdir();

        String targetFileStr = pathFolder + "/out/summary.csv";

        try (BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader(pathStr))){
            String line = bufferedReader.readLine();
            while (line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                products.add(new Product(name, price, quantity));

                line = bufferedReader.readLine();
            }

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFileStr))){

                for (Product product : products) {
                    bufferedWriter.write(product.getName() + ", " + String.format("%.2f", product.totalValue()));
                    bufferedWriter.newLine();
                }

                System.out.println("File saved with success!");
            }
            catch (IOException e){
                System.out.println("Error writing file: " + e.getMessage());
            }
        }
        catch (IOException e){
            System.out.println("Error writing file: " + e.getMessage());
        }

        input.close();
    }
}
