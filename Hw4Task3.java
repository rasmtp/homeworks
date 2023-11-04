import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Hw4Task3 {
    public static void main(String[] args) {
        int[] setNumbers = new int[2000];
        Hw4Task3.randomNumbers(setNumbers);
        System.out.println("Нечётные и заменённые на ноль чётные числа:");
        for (int i : setNumbers) {
            System.out.println(i);
        }
    }

    public static void randomNumbers(int[] setRandom) {
        for (int i = 0; i < setRandom.length; i++) {
            setRandom[i] = ThreadLocalRandom.current().nextInt(1, 10);
        }
        System.out.println("Набор случайных чисел:" + Arrays.toString(setRandom));
    }

    public static void changeEvenNumbersToZero(int[] evenNumbers) {
        for (int i = 0; i < evenNumbers.length; i++) {
            if (evenNumbers[i] % 2 == 0) {
                evenNumbers[i] = 0;
            }
        }
    }
}