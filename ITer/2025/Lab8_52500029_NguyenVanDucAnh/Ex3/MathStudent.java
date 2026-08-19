class MathStudent extends Student {
    private String sID;

    public MathStudent(String sName, double gpa, String sID) {
        super(sName, gpa);
        this.sID = sID;
    }

    @Override
    public String getRank() {
        if (gpa >= 5)
            return "Passed";
        else
            return "Failed";
    }

    @Override
    public String toString() {
        return "MathStudent [ID=" + sID + ", Name=" + sName + ", GPA=" + gpa + ", Rank=" + getRank() + "]";
    }
}