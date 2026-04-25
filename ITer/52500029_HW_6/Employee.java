public class Employee {
    private int id;
    private String fullname;
    private int salary;

    // constructor
    public Employee() {
        this.id = -1;
        this.fullname = "unknown";
        this.salary = -1;
    }

    public Employee(int id, String fullname, int salary) {
        this.id = id;
        this.fullname = fullname;
        this.salary = salary;
    }

    public Employee(Employee other) {
        this.fullname = other.fullname;
        this.id = other.id;
        this.salary = other.salary;
    }

    // getter
    public int getId() {
        return this.id;
    }

    public String getFullname() {
        return this.fullname;
    }

    public int getSalary() {
        return this.salary;
    }

    // setter
    public void setId(int id) {
        this.id = id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // toString
    public String toString() {
        return "id=" + id + "\n" +
                "fullname=" + fullname + "\n" +
                "salary=" + salary + "\n";
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
            Employee other = (Employee) obj;
            return this.getId() == other.getId()
                    && this.getFullname().equals(other.getFullname())
                    && this.getSalary() == other.getSalary();
        } else {
            return false;
        }
    }

    // method
    public void raiseSalary(int percent) {
        this.salary = this.salary + (this.salary * percent) / 100;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }
}