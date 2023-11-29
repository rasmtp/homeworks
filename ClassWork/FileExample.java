package ClassWork;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Optional;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\roman\\IdeaProjects\\homeworks\\src\\ClassWork\\text.txt");
        file.createNewFile();

        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
//        String str = randomAccesFile.readLine();
//        int number = Integer.parseInt(str);
        randomAccessFile.seek(10);

        System.out.println(randomAccessFile.readLine());
        System.out.println(randomAccessFile.getFilePointer());

        randomAccessFile.writeBytes("Alex");
        String kindOfFood = "";
        int hoursOfSleeping = 5;


            }
        }
