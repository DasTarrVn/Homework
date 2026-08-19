public class Student extends Person {
    private String id;
    private double score;

    public Student(String name, int birthYear, String id, double score) {
        super(name, birthYear);
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public double getScore() {
        return score;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student [" + super.toString() + ", ID: " + id + ", Score: " + score + "]";
    }
}