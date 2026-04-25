public class Rectangle {
    private double width;
    private double length;

    public Rectangle() {
        this.width = 0.0;
        // this.length = 0.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(Rectangle other) {
        this.width = other.width;
        this.length = other.length;
    }

    // Accessors (Getters)
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    // Mutators (Setters)
    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Methods for calculation
    public double calculateArea() {
        return width * length;
    }

    public double calculatePerimeter() {
        return 2 * (width + length);
    }

    // toString Method
    @Override
    public String toString() {
        return "Rectangle[width=" + width +
                ", length=" + length +
                ", area=" + calculateArea() +
                ", perimeter=" + calculatePerimeter() + "]";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            return this.getLength() == other.getLength() && this.getWidth() == other.getWidth();
        } else {
            return false;
        }
    }

}