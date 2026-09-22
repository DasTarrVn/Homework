import java.util.Arrays;

public class Main {
    public static void printList(Student[] students) {
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("An", 8.0, 7.5, 9.0); // avg = 8.17
        students[1] = new Student("Binh", 6.0, 5.0, 7.0); // avg = 6.00
        students[2] = new Student("Cuong", 9.5, 9.0, 9.5); // avg = 9.33
        students[3] = new Student("Dung", 7.0, 8.0, 7.5); // avg = 7.50

        printList(students);

        Arrays.sort(students, new StudentAscendingComparator());
        printList(students);

        Arrays.sort(students, new StudentDescendingComparator());
        printList(students);
    }
}