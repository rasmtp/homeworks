package Hw1;

public class Task4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(a);
        System.out.println(b);
        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}