public class Manager extends Employee {
    private String position;
    private String department;
    private double salaryCoefficientPosition;

    public Manager() {
        super();
        position = "Administrative office";
        this.salaryCoefficientPosition = 5.0;
    }

    public Manager(String ID, String fullName, double coefficientsSalary, String position,
            double salaryCoefficientPosition) {
        super(ID, fullName, coefficientsSalary);
        this.position = position;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
        super.setYearJoined(2024);
    }

    public Manager(String ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff,
            String position, String department, double salaryCoefficientPosition) {
        super(ID, fullName, yearJoined, coefficientsSalary, numDaysOff);
        this.position = position;
        this.department = department;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    @Override
    public String considerEmulation() {
        return "A";
    }

    public double bonusByPosition() {
        double positionBonus = getBasicSalary() * salaryCoefficientPosition;
        return positionBonus;
    }

    @Override
    public double getSalary() {

        double salary = getBasicSalary() + getBasicSalary() * (getCoefficientsSalary() + 1) + getSenioritySalary()
                + bonusByPosition();
        return salary;
    }
}
