package app;

public class Square implements GeometricFigures {

    private final double length;

    public Square (double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*length;
    }
}
