
public class TestEx2 {
    public static void main(String[] args) {

        Person p1 = new Person("Nguyen Van Duc Anh", "District 7");
        System.out.println(p1.toString());

        Student s1 = new Student("Nguyen Van Duc Anh", "District 7", "Information Technology", 2026, 1500.50);
        System.out.println(s1.toString());

        Staff t1 = new Staff("Nguyen Tran B", "Nha Be", "Ton Duc", 3000.00);
        System.out.println(t1.toString());

        Person p2 = new Student("Le Van C", "District 1", "Computer Science", 2025, 1200.00);
        System.out.println(p2.toString());
    }
}