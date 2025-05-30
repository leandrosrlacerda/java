package dimensional;

public class Line {

    private TwoDimensionalPoint p1;
    private TwoDimensionalPoint p2;

    public Line(TwoDimensionalPoint p1, TwoDimensionalPoint p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public TwoDimensionalPoint getEndPoint1() {
        return p1;
    }

    public TwoDimensionalPoint getEndPoint2() {
        return p2;
    }

/*    Este código implementa a fórmula da distância euclidiana: d = √[(x₂-x₁)² + (y₂-y₁)²]
    Por exemplo:
            - Se p1 tem coordenadas (1,1) e p2 tem coordenadas (4,5):
            - x = (4-1)² = 9
            - y = (5-1)² = 16
            - distance = √(9 + 16) = √25 = 5 */

    public double getDistance(){
        double x = Math.pow(p2.getXCoordinate() - p1.getXCoordinate(), 2);
        double y = Math.pow(p2.getYCoordinate() - p1.getYCoordinate(), 2);
        double distance = Math.sqrt(x + y);
        return distance;
    }

    public TwoDimensionalPoint getMidPoint(){
        double x = (p1.getXCoordinate() + p2.getXCoordinate()) / 2;
        double y = (p1.getYCoordinate() + p2.getYCoordinate()) / 2;
        return new TwoDimensionalPoint(x, y);
    }
}
