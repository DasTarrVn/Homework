import java.util.Comparator;

public class StudentDescendingComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        double diff = s2.getAvg() - s1.getAvg();
        if (diff > 0) return 1;
        if (diff < 0) return -1;
        return 0;
    }
}