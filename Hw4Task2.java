import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Hw4Task2 {
    public static void main(String[] args) {
        int[] setNumbers = new int[1000];
        Hw4Task1.randomNumbers(setNumbers);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Простые числа в массиве:");
        for (int i = 0; i < setNumbers.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                }
            }

            if (isPrime) {

                System.out.println(i);
            }
        }
    }

    public static void randomNumbers(int[] setRandom) {
        for (int i = 0; i < setRandom.length; i++) {
            setRandom[i] = ThreadLocalRandom.current().nextInt(1, 10);
        }
        System.out.println("Набор случайных чисел:" + Arrays.toString(setRandom));
    }
}

