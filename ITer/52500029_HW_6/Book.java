public class Book {
    private String title;
    private double price;
    private int qty;
    private Author author;

    // 1. Constructors
    public Book() {
        this.title = "Unknown";
        this.price = 0.0;
        this.qty = 0;
        this.author = new Author();

    }

    public Book(String title, double price, int qty) {
        this.title = title;
        this.price = price;
        this.qty = qty;
        this.author = new Author();
    }

    public Book(Book t) {
        this.title = t.title;
        this.price = t.price;
        this.qty = t.qty;
        this.author = new Author(t.author);
    }

    // 2. Getters
    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQty() {
        return this.qty;
    }

    public Author getAuthor() {
        return this.author;
    }

    // 3. Setters
    public void setTitle(String t) {
        this.title = t;
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public void setQty(int q) {
        this.qty = q;
    }

    public void setAuthor(Author a) {
        this.author = a;
    }

    // 4. toString & equals
    @Override
    public String toString() {
        return "Book [title=" + title + ", price=" + price + ", qty=" + qty
                + ", author=" + this.author.toString() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {

            Book other = (Book) obj;
            return this.getPrice() == other.getPrice() &&
                    this.getQty() == other.getQty() &&
                    this.getTitle().equals(other.getTitle()) &&
                    this.getAuthor().equals(other.getAuthor());
        } else {
            return false;
        }
    }

    // 5. Method
    public double getDiscount(int percent) {
        return this.price * (percent / 100.0);
    }
}