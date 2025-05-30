package dimensional;

public class Main {

    public static void main(String[] args) {

        TwoDimensionalPoint two = new TwoDimensionalPoint(3, 4);
        ThreeDimensionalPoint three = new ThreeDimensionalPoint(1, 2, 3);

        System.out.println(two.toString());
        System.out.println(three.toString());


        Line line = new Line(two, three);
        TwoDimensionalPoint midPoint = line.getMidPoint();

        System.out.println("Midpoint: (" + midPoint.getXCoordinate() + ", " + midPoint.getYCoordinate() +")");
        System.out.println("Distance: " + line.getDistance());
    }
}
