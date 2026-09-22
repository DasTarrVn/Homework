import java.util.Comparator;

public class StudentAscendingComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        double diff = s1.getAvg() - s2.getAvg();
        if (diff > 0) return 1;
        if (diff < 0) return -1;
        return 0;
    }
}