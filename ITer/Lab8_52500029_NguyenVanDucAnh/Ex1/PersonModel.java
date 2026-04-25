import java.util.ArrayList;

public class PersonModel<T> {
    private ArrayList<T> al = new ArrayList<T>();

    public void add(T obj) {
        al.add(obj);
    }

    public void display() {
        for (T obj : al) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        PersonModel<Student> pm = new PersonModel<>();
        pm.add(new Student("Thanh", 2004, "STU001", 9.5));
        pm.add(new Student("Phat", 2007, "STU002", 2));
        pm.display();
        PersonModel<Employee> e = new PersonModel<>();
        e.add(new Employee("Man", 2007, "NL001", 2000000));
        e.add(new Employee("Duy", 1999, "NL002", 676767));
        e.display();
        PersonModel<Person> ps = new PersonModel<>();
        ps.add(new Person("Minh", 1111));
        ps.add(new Person("Kha", 2099));
        ps.display();
    }
}