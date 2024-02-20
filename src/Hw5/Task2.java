package Hw5;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {10, 8, 6, 4, 5};
        System.out.println(isDescending(array));
    }

    public static boolean isDescending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
