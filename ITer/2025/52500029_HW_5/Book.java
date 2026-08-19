public class Book {
    private String bookID;
    private String title;
    private String author;
    private double price;

    public Book() {
        bookID = "1";
        title = "title1";
        author = "author1";
        price = 0.0;
    }

    public Book(Book other) {
        this.bookID = other.bookID;
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }

    public Book(String bookID, String title, String author, double price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // getter
    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // setter
    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double percent) {
        if (percent >= 0 && percent <= 100) {
            this.price -= this.price * (percent / 100);
        }
    }

    public void comparePrice(Book other) {
        if (this.price >= other.price) {
            System.out.println(this.toString());
        } else {
            System.out.println(other.toString());
        }
    }

    @Override
    public String toString() {
        return "Book[bookID=" + bookID + ", title=" + title + ", author=" + author + ", price=" + price + "]";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book other = (Book) obj;
            return this.getPrice() == other.getPrice() &&
                    this.getBookID().equals(other.getBookID()) &&
                    this.getTitle().equals(other.getTitle()) &&
                    this.getAuthor().equals(other.getAuthor());
        } else {
            return false;
        }
    }
}