package Hw4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] args) {
        int[] setNumbers = new int[400];
        randomNumbers(setNumbers);
        System.out.println(arithmeticAverage(setNumbers) + " - Среднее арифметическое случайных чилел;");
        System.out.println(geometricAverage(setNumbers) + " - Среднее геометрическое случайных чисел.");
    }

    public static void randomNumbers(int[] setRandom) {
        for (int i = 0; i < setRandom.length; i++) {
            setRandom[i] = ThreadLocalRandom.current().nextInt(1, 10);
        }
        System.out.println("Набор случайных чисел:" + Arrays.toString(setRandom));
    }

    public static double arithmeticAverage(int[] setArithmetic) {
        double average = 0;
        double sum = 0;
        for (int i = 0; i < setArithmetic.length; i++) {
            sum += setArithmetic[i];
        }
        average = sum / setArithmetic.length;
        return average;
    }

    public static double geometricAverage(int[] setGeometric) {
        double average = 0;
        double multiplication = 1;
        for (int i = 0; i < setGeometric.length; i++) {
            multiplication *= setGeometric[i];
        }
        average = Math.pow(multiplication, (double) 1 / setGeometric.length);
        return average;
    }
}
