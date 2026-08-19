import java.util.*;
import java.io.*;

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

    public static <E> boolean writeFile(String path, ArrayList<E> lst) {
        try (PrintWriter pw = new PrintWriter(path)) {
            for (E student : lst) {
                pw.println(student);
            }
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file");
            return false;
        }

    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new ITStudent("Alice", 8.5, 101));
        list.add(new ITStudent("Bob", 6.0, 102));
        list.add(new MathStudent("Charlie", 4.5, "M01"));
        list.add(new MathStudent("David", 7.0, "M02"));
        writeFile("result.txt", list);
    }
}
