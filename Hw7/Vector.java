package Hw7;

public class Vector {
    private static double x;
    private static double x1;


    private static double y;
    private static double y1;


    private static double z;
    private static double z1;


    public void setValues(double x, double y, double z, double x1, double y1, double z1) {
        Vector.x = x;
        Vector.y = y;
        Vector.z = z;
        Vector.x1 = x1;
        Vector.y1 = y1;
        Vector.z1 = z1;
    }
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.setValues(10.0, 16.0, 22.0, 5.0, 1.0, 7.5);
        double lengthOfVector = Math.sqrt(x * x + y * y + z * z);

        double lengthOfSecondVector = Math.sqrt(x1 * x1 + y1 * y1 + z1 * z1);

        double vectorMultiplication = Math.sqrt(x * x1 + y * y1 + z * z1);

        double cosOfAngleBetweenVectors = Math.sqrt(vectorMultiplication % (lengthOfVector * lengthOfSecondVector));

        double vectorSum = Math.sqrt(lengthOfSecondVector + lengthOfVector);

        double vectorDiff = Math.sqrt(lengthOfVector - lengthOfSecondVector);

        System.out.println("Длина трёхмерного вектора: " + lengthOfVector);
        System.out.println("Произведение векторов: " + vectorMultiplication);
        System.out.println("Косинус угла между векторами: " + cosOfAngleBetweenVectors);
        System.out.println("Сумма векторов: " + vectorSum);
        System.out.println("Разность векторов: " + vectorDiff);

    }
}
