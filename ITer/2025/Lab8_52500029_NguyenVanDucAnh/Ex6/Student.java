import java.util.*;

class Student<T> {
    private String name;
    private T studentId;
    private HashMap<String, Double> grades;

    public Student(String name, T studentId) {
        this.name = name;
        this.studentId = studentId;
        this.grades = new HashMap<>();
    }

    public void addGrade(String subject, Double grade) {
        grades.put(subject, grade);
    }

    public String getName() {
        return name;
    }

    public T getStudentId() {
        return studentId;
    }

    public HashMap<String, Double> getGrades() {
        return grades;
    }
}