import java.time.*;

public class Employee {
    private String ID;
    private String fullName;
    private int yearJoined;
    private double coefficientsSalary;
    private int numDaysOff;
    private final double BASIC_SALARY = 1150.0;

    public Employee() {
        ID = "0";
        fullName = "";
        yearJoined = 2020;
        coefficientsSalary = 1.0;
        numDaysOff = 0;
    }

    public Employee(String ID, String fullName, double coefficientsSalary) {
        this.ID = ID;
        this.fullName = fullName;
        yearJoined = 2020;
        this.coefficientsSalary = coefficientsSalary;
        numDaysOff = 0;
    }

    public Employee(String ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff) {
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = yearJoined;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = numDaysOff;
    }

    public double getSenioritySalary() {
        int currentYear = LocalDate.now().getYear();
        double yearOfWork = currentYear - this.yearJoined;
        if (yearOfWork >= 5)
            return (double) yearOfWork * BASIC_SALARY / 100;
        else {
            return 0;
        }
    }

    public String considerEmulation() {
        if (numDaysOff <= 1) {
            return "A";
        } else if (numDaysOff <= 3) {
            return "B";
        } else {
            return "C";
        }
    }

    public double getSalary() {
        String A = this.considerEmulation();
        double emuCoe;
        if (A.equals("A")) {
            emuCoe = 1;
        } else if (A.equals("B")) {
            emuCoe = 0.75;
        } else {
            emuCoe = 0.5;
        }
        double salary = BASIC_SALARY + BASIC_SALARY * (coefficientsSalary + emuCoe) + getSenioritySalary();
        return salary;
    }

    // bo sung
    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    public void setNumDaysOff(int numDaysOff) {
        this.numDaysOff = numDaysOff;
    }

    public double getBasicSalary() {
        return BASIC_SALARY;
    }
}
