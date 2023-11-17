package Hw11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

abstract class Figure {
    abstract double area();
    abstract double perimeter();
}

class Circle extends Figure {
    private double radius;

    Circle(double radius) {
        try {
            this.radius = radius;
        } catch (Exception e) {
            System.out.println("radius may be final");
        }
    }

    @Override
    double perimeter() {
        try {
            return 2 * Math.PI * radius;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3, 4, 5);

        List<Figure> figures = new ArrayList<>();
        figures.add(circle);
        figures.add(square);
        figures.add(triangle);

        Figure maxAreaFigure = Collections.max(figures, Comparator.comparing(Figure::area));
        System.out.println("Figure with the biggest area: " + maxAreaFigure.getClass().getSimpleName());
    }
}

class Square extends Figure {
    private double side;

    Square(double side) {
        try {
            this.side = side;
        } catch (Exception e) {
            System.out.println("side may be final");
        }
    }

    @Override
    double perimeter() {
        return 4 * side;
    }

    @Override
    double area() {
        return side * side;
    }
}

class Triangle extends Figure {
    private double side1;
    private double side2;
    private double side3;

    Triangle(double side1, double side2, double side3) {
        try {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } catch (Exception e) {
            System.out.println("side1, side2, side3 may be final");
        }
    }

    @Override
    double perimeter() {
        return side1 + side2 + side3;
    }

    double area(double angleInRadians) {
        return 0.5 * side1 * side2 * Math.sin(angleInRadians);
    }

    //Base height product
    double area(double base, double height) {
        return 0.5 * base * height;
    }

    @Override
    double area() {
        double s = perimeter() / 2;
        //semi perimeter for Heron's formula
        return area(s) + area(Math.toRadians(90)) + area(side2, side3);
    }
}




