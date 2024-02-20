package Hw5;
public class Task1 {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 3;
        int[][] array = new int[rows][columns];

        fillArray(array);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillArray(int[][] array) {
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value;
                value++;
            }
            if (i % 2 != 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] *= -1;
                }
            }
        }
    }
}
