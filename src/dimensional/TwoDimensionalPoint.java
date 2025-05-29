package dimensional;

public class TwoDimensionalPoint {

    private double x_coord;
    private double y_coord;

    public TwoDimensionalPoint(double x, double y) {
        this.x_coord = x;
        this.y_coord = y;
    }

    public double getXCoordinate() {
        return x_coord;
    }

    public void setXCoordinate(double x) {
        x_coord = x;
    }

    public double getYCoordinate(){
        return y_coord;
    }

    public void setYCoordinate(double y){
        y_coord = y;
    }

    @Override
    public String toString() {
        return "I am a 2 dimensional point.\n" + "My x coordinate is: " + getXCoordinate() + "\n" + "My y coordinate is: " + getYCoordinate();
    }
}
