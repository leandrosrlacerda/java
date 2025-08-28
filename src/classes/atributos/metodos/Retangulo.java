package classes.atributos.metodos;

import java.util.Scanner;

public class Retangulo {

    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        // teorema de pitagoras
        return Math.hypot(width, height);
    }

    public String toString() {
        return "ÁREA = "
                + String.format("%.2f",area())
                + "\nPERIMETRO = "
                + String.format("%.2f",perimeter())
                + "\nDIAGONAL = "
                + String.format("%.2f",diagonal());
    }

}
