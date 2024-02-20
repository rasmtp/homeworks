package Hw2;

//Заданы плоские декартовы координаты треугольника. Например A(1, 5), B(3, 5), C(6, 7)
//• Найти площадь треугольника и вывести в консоль.

public class Task2 {
    public static void main(String[] args) {
        double x1 = 1,
                x2 = 3,
                x3 = 6;
        double y1 = 5,
                y2 = 5,
                y3 = 7;
        double a = Math.sqrt((x1-x2) * (x1-x2) + (y1-y2) * (y1-y2));
        double b = Math.sqrt((x1-x3) * (x1-x3) + (y1-y3) * (y1-y3));
        double c = Math.sqrt((x2-x3) * (x2-x3) + (y2-y3) * (y2-y3));
        if (a + b <= c || a + c <= b || b + c <= a)
            System.out.println("Треугольник не существует");
        else
        {
            double p = (a + b + c) / 2;
            double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Площадь: " + square);
        }
    }
}