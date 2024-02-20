package ua.romanenko.hw1;

public class Task3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a + " " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
