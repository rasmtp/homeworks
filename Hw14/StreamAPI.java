package Hw14;

import java.util.Arrays;
import java.util.List;

class Figure {
    private String name;
    private double square;
    private double perimeter;

    public Figure(String name, double square, double perimeter) {
        this.name = name;
        this.square = square;
        this.perimeter = perimeter;
    }

    public String getName() {
        return name;
    }

    public double getSquare() {
        return square;
    }

    public double getPerimeter() {
        return perimeter;
    }
}

public class StreamAPI {
    public static void main(String[] args) {
        List<Figure> figures = Arrays.asList(
                new Figure("Figure1", 49, 24),
                new Figure("Figure2", 50, 28),
                new Figure("Figure3", 64, 32),
                new Figure("Figure4", 70, 36)
        );

        double minSquare = 50;

        figures.stream()
                .filter(figure -> figure.getSquare() > minSquare)
                .forEach(StreamAPI::printFigure);

        figures.stream()
                .filter(figure -> figure.getSquare() == 2 * figure.getPerimeter())
                .findFirst()
                .ifPresent(StreamAPI::printFigure);
    }

    public static void printFigure(Figure figure) {
        System.out.println(figure.getName() + ": " + "Square: " + figure.getSquare() + ", Perimeter: " + figure.getPerimeter());
    }
}
