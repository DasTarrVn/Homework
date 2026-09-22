public class Student {
    private String name;
    private double mathematics;
    private double programming;
    private double DSA1;

    public Student(String name, double mathematics, double programming, double DSA1) {
        this.name = name;
        this.mathematics = mathematics;
        this.programming = programming;
        this.DSA1 = DSA1;
    }

    public String getName() {
        return name;
    }

    public double getAvg() {
        return (mathematics + programming + DSA1) / 3.0;
    }

    @Override
    public String toString() {
        return String.format("Student[Name: %-10s | Math: %.1f | Prog: %.1f | DSA1: %.1f | Avg: %.2f]",
                name, mathematics, programming, DSA1, getAvg());
    }
}