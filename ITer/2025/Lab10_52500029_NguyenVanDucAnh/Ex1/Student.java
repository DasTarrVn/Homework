public class Student {
    String name;
    String address;
    String sex;
    Double score;

    public class StudentOperator {
        public void print() {
            System.out.println("Student[" + name + ","
                    + address + ","
                    + sex + ","
                    + score + "]");
        }

        public String type() {
            if (score > 8) {
                return "A";
            } else if (score >= 5) {
                return "B";
            } else {
                return "C";
            }
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Nguyen Van A";
        student.address = "Hanoi";
        student.sex = "Nam";
        student.score = 9.5;

        Student.StudentOperator operator = student.new StudentOperator();

        operator.print();
    }
}
