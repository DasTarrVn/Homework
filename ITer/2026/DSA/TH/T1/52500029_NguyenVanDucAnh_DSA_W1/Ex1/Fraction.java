public class Fraction {
    private int numer = 0;
    private int denom = 1;

    public Fraction() {
    }

    public Fraction(int x, int y) {
        this.numer = x;
        this.denom = y;
    }

    public Fraction(Fraction f) {
        this.numer = f.numer;
        this.denom = f.denom;
    }

    @Override
    public String toString() {
        return "Numer=" + numer + "\n" +
                "Denom=" + denom;
    }

    @Override
    public boolean equals(Object f) {
        if (f instanceof Fraction) {
            Fraction other = (Fraction) f;
            return numer == other.numer && denom == other.denom;
        }
        return false;
    }
}
