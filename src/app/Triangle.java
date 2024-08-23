package app;

public class Triangle implements GeometricFigures {

    private final double height;
    private final double length;

    public Triangle (double height, double length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*height*0.5;
    }
}
