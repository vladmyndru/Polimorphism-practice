package app;

public class Main {

    static String totalArea;

    public static void main(String[] args) {

        GeometricFigures [] figures = new GeometricFigures[] {
                new Circle(10),
                new Square(1),
                new Triangle(5, 10)
            };

        totalArea = Rounder.roundValue(totalArea(figures));
        System.out.println("Total area of all geometric figures: " + totalArea);
            }

        private static double totalArea (GeometricFigures[] figures) {
            double totalArea = 0;
            for (GeometricFigures geometricFigure : figures) {
                totalArea += geometricFigure.getArea();
            }
            return totalArea;
    }
}

