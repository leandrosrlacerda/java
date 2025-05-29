package dimensional;

public class ThreeDimensionalPoint extends TwoDimensionalPoint {

    private double z_coord;

    public ThreeDimensionalPoint(double x, double y, double z) {
        super(x, y); // inicializa os atributos da classe pai
        this.z_coord = z;
    }

    public double getZCoordinate() {
        return z_coord;
    }

    public void setZCoordinate(double z) {
        z_coord = z;
    }

    @Override
    public String toString() {
        return "I am a 3 dimensional point.\n" + "My x coordinate is: " + getXCoordinate() +
                "\n" + "My y coordinate is: " + getYCoordinate() + "\n" + "My z coordinate is: " + getZCoordinate();
    }
}

