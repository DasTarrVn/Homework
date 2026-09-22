public class Fraction {
    private int numer;
    private int denom;

    public Fraction() {
        this.numer = 0;
        this.denom = 1;
    }

    public Fraction(int numer, int denom) {
        this.numer = numer;
        this.denom = (denom == 0) ? 1 : denom;
    }

    public Fraction(Fraction f) {
        if (f != null) {
            this.numer = f.numer;
            this.denom = f.denom;
        } else {
            this.numer = 0;
            this.denom = 1;
        }
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public int getDenom() {
        return denom;
    }

    public void setDenom(int denom) {
        this.denom = (denom == 0) ? 1 : denom;
    }

    @Override
    public String toString() {
        return numer + "/" + denom;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
            return this.numer * other.denom == this.denom * other.numer;
        }
        return false;
    }
}
