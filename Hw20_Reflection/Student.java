package Hw20_Reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface ShowInfo {
    boolean show() default true;
}

public class Student {
    @ShowInfo
    private String firstName;
    @ShowInfo
    private String lastName;
    //намерено убрал аннотацию
    private int age;
    @ShowInfo
    private int examScore;

    void passExamSuccessfully() {
        this.examScore = 100;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExamScore() {
        return examScore;
    }

    public void setExamScore(int examScore) {
        this.examScore = examScore;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Ivan");
        student.setLastName("Chernikov");
        student.setAge(20);
        student.setExamScore(52);

        student.passExamSuccessfully();

        StudentInfoPrinter.printStudentInfo(student);

        PersonFactory personFactory = new PersonFactory();
        Person person = personFactory.createPerson("Andrii", 41, "Sumska 29/1729");
        personFactory.printFields(person);
    }
}

class StudentInfoPrinter {
    public static void printStudentInfo(Student student) {
        Class<?> studentClass = student.getClass();
        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(ShowInfo.class)) {
                ShowInfo showInfoAnnotation = field.getAnnotation(ShowInfo.class);
                if (showInfoAnnotation.show()) {
                    try {
                        field.setAccessible(true);
                        System.out.println(field.getName() + ": " + field.get(student));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class Person {
    private String name;

    public String getName() {
        return name;
    }

    private int age;

    public int getAge() {
        return age;
    }

    private String address;

    public String getAddress() {
        return address;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

class PersonFactory {
    public Person createPerson(String name, int age, String address) {
        return new Person(name, age, address);
    }

    public void printFields(Object obj) {
        Class<?> objClass = obj.getClass();
        Field[] fields = objClass.getDeclaredFields();
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                System.out.println(field.getName() + ": " + field.get(obj));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
