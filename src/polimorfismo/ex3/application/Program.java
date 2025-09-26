package polimorfismo.ex3.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import polimorfismo.ex3.entities.Circle;
import polimorfismo.ex3.entities.Rectangle;
import polimorfismo.ex3.entities.Shape;
import polimorfismo.ex3.entities.enums.Color;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		List<Shape> shapes = new ArrayList<Shape>();

		System.out.print("Enter the number of shapes: ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char c = input.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(input.next());

			if (c == 'r') {
				System.out.print("Width: ");
				double width = input.nextDouble();
				System.out.print("Height: ");
				double height = input.nextDouble();

				shapes.add(new Rectangle(color, width, height));
				
			} else {
				System.out.print("Radius: ");
				double radius = input.nextDouble();

				shapes.add(new Circle(color, radius));
			}
		}
		
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		
		for (Shape shape : shapes) {
			System.out.println(String.format("%.2f", shape.area()));
		}

		input.close();
	}
}
