import java.util.*;

public class StudentRecordSystem {
    public static void main(String[] args) {
        ArrayList<Student<?>> studentList = new ArrayList<>();

        Student<Integer> stu1 = new Student<>("Alice", 52400001);
        stu1.addGrade("Database", 9.0);
        stu1.addGrade("Java", 8.5);
        studentList.add(stu1);

        Student<String> stu2 = new Student<>("Bob", "C2400001");
        stu2.addGrade("Algebra", 9.5);
        stu2.addGrade("Calculus", 8.8);
        studentList.add(stu2);

        for (Student<?> student : studentList) {
            System.out.println("Grades for " + student.getName() + " (ID: " + student.getStudentId() + "):");

            HashMap<String, Double> grades = student.getGrades();
            for (String subject : grades.keySet()) {
                Double grade = grades.get(subject);
                System.out.println("- " + subject + ": " + grade);
            }
        }
    }
}
