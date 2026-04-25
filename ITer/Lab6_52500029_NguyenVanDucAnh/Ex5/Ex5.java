public class Ex5 {
    public static void main(String[] args) {

        Employee emp1 = new Employee("E01", "Nguyen Van A", 2018, 1.2, 2);
        System.out.println("--- Employee Info ---");
        System.out.println("Emulation Grade: " + emp1.considerEmulation());
        System.out.println("Seniority Salary: " + emp1.getSenioritySalary());
        System.out.println("Total Salary: " + emp1.getSalary());

        Manager mgr1 = new Manager();
        System.out.println("\n--- Default Manager Info ---");
        System.out.println("Emulation Grade: " + mgr1.considerEmulation());
        System.out.println("Position Bonus: " + mgr1.bonusByPosition());
        System.out.println("Total Salary: " + mgr1.getSalary());

        Manager mgr2 = new Manager("M01", "Tran Thi B", 2015, 2.5, 5, "Director", "IT", 4.0);
        System.out.println("\n--- Parameterized Manager Info ---");
        System.out.println("Emulation Grade: " + mgr2.considerEmulation());
        System.out.println("Seniority Salary: " + mgr2.getSenioritySalary());
        System.out.println("Position Bonus: " + mgr2.bonusByPosition());
        System.out.println("Total Salary: " + mgr2.getSalary());
    }
}