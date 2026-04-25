public class Employee extends Person {
    private String id;
    private double salary;

    public Employee(String name, int birthYear, String id, double salary) {
        super(name, birthYear);
        this.id = id;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [" + super.toString() + ", ID: " + id + ", Salary: $" + salary + "]";
    }
}