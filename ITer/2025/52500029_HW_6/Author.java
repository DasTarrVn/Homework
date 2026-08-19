import java.time.Year;

public class Author {
    private String fullname;
    private int birthyear;

    public Author() {
        this.fullname = "";
        this.birthyear = 0;
    }

    public Author(String f, int y) {
        this.fullname = f;
        this.birthyear = y;
    }

    public Author(Author a) {
        this.fullname = a.fullname;
        this.birthyear = a.birthyear;
    }

    public String getFullname() {
        return this.fullname;
    }

    public int getBirthyear() {
        return this.birthyear;
    }

    public void setFullname(String t) {
        this.fullname = t;
    }

    public void setBirthyear(int q) {
        this.birthyear = q;
    }

    @Override
    public String toString() {
        return "Author [fullname=" + this.fullname + ", birthyear=" + this.birthyear + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Author) {
            Author other = (Author) obj;
            return this.getFullname().equals(other.getFullname()) &&
                    this.getBirthyear() == other.getBirthyear();
        } else {
            return false;
        }
    }

    public int getAge() {
        int currentYear = Year.now().getValue();
        return currentYear - this.birthyear;
    }
}