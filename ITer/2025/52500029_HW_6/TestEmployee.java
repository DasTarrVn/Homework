public class TestEmployee {
    public static void main(String[] args) {
        // Default constructor
        Employee emp1 = new Employee();
        System.out.println("Employee 1 (Default):\n" + emp1.toString());
        // Parameterized constructor
        Employee emp2 = new Employee(101, "Nguyen Van A", 5000);
        System.out.println("Employee 2 (Parameterized):\n" + emp2.toString());
        // Copy constructor
        Employee emp3 = new Employee(emp2);
        System.out.println("Employee 3 (Copy of Emp2):\n" + emp3.toString());
        System.out.println("=== 2. TEST GETTERS & SETTERS ===");
        emp1.setId(102);
        emp1.setFullname("Tran Thi B");
        emp1.setSalary(6000);
        System.out.println("Employee 1 (After setter):");
        System.out.println("ID: " + emp1.getId());
        System.out.println("Name: " + emp1.getFullname());
        System.out.println("Salary: " + emp1.getSalary() + "\n");
        System.out.println("=== 3. TEST METHODS ===");
        System.out.println("Employee 2 Annual Salary: " + emp2.getAnnualSalary());
        System.out.println("Employee 2 Salary before raise: " + emp2.getSalary());
        emp2.raiseSalary(10); // Tăng 10%
        System.out.println("Employee 2 Salary after 10% raise: " + emp2.getSalary() + "\n");
        System.out.println("=== 4. TEST EQUALS ===");
        Employee emp4 = new Employee(101, "Nguyen Van A", 5000); // Giống thông tin gốc của emp2
        System.out.println("emp3 equals emp4? " + emp3.equals(emp4)); // True (vì emp3 copy từ emp2 ban đầu)
        System.out.println("emp2 equals emp3? " + emp2.equals(emp3)); // False (vì emp2 đã được tăng lương)
    }
}