package ua.romanenko.hw5;
public class Task3 {
    public static void main(String[] args) {
        int[][] Array1 = {
                {1, 2},
                {3, 4}
        };
        int[][] Array2 = Array2(Array1);
        System.out.println("До:");
        printArray(Array1);

        System.out.println("После:");
        printArray(Array2);
    }

    public static int[][] Array2 (int[][] array) {
        int n = array.length;
        int[][] Array2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            Array2 [i][j] = array[j][i];
            }
        }
        return Array2;
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

