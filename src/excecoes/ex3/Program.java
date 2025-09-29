package excecoes.ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        File file = new File("in.txt");
        Scanner input = null;

        try{
            input = new Scanner(file);
            while(input.hasNextLine()){
                System.out.println(input.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found!" + e.getMessage());
        }
        finally{
            if(input != null){
                input.close();
            }
            System.out.println("Finally block executed");
        }

    }
}
