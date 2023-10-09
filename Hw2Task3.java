import java.util.Scanner;

public class Hw2Task3 {
    public static class CheckEvenOdd {
        public static void main(String[] args) {
            int num;
            System.out.println("Введите число: ");
            Scanner input = new Scanner(System.in);
            num = input.nextInt();
            if (num % 2 == 0) {
                System.out.println("Число чётное");
            } else {
                System.out.println("Число нечётное");
            }
        }
    }
}

