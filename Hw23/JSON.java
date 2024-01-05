package Hw23;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JSON {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Student student = objectMapper.readValue(new File("C:\\Users\\roman\\IdeaProjects\\Homeworks\\src\\homeworks\\Hw23\\student.json"), Student.class);

            System.out.println("Чтение файла json:");
            System.out.println(student);

            student.setName("Kolia");
            student.setAge(19);
            student.setUniversity("MIT");

            String jsonString = objectMapper.writeValueAsString(student);
            System.out.println("Cериализация в строку json:");
            System.out.println(jsonString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

