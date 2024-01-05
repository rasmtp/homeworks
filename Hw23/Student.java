package Hw23;
public class Student {
    private String name;
    private int age;
    private String university;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", university='" + university + '\'' +
                '}';
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setUniversity(String university) {
        this.university = university;
    }
    public String getUniversity() {
        return university;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}

