import java.util.*;

public class TestEx3 {
    public static ArrayList<Student> findStudent(ArrayList<Student> lstStu) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : lstStu) {
            String rank = s.getRank();
            if (rank.equals("A") || rank.equals("Passed")) {
                result.add(s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new ITStudent("Alice", 8.5, 101)); // Rank A
        list.add(new ITStudent("Bob", 6.0, 102)); // Rank B
        list.add(new MathStudent("Charlie", 4.5, "M01")); // Failed
        list.add(new MathStudent("David", 7.0, "M02")); // Passed

        ArrayList<Student> topStudents = findStudent(list);
        System.out.println("Students with Rank 'A' or 'Passed':");
        for (Student s : topStudents) {
            System.out.println(s);
        }
    }
}