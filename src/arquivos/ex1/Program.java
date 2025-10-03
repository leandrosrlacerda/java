package arquivos.ex1;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a folder path:");
        String strPath = input.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }

        boolean succes = new File(strPath + "//teste").mkdir();
        System.out.println("SUCESS: " + succes);

        input.close();
    }
}
