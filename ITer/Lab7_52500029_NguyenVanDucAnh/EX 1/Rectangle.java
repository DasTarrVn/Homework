public class Rectangle extends Shape {
    protected double length;
    protected double width;

    // 1
    public Rectangle() {
        super();
        length = 0.0;
        width = 0.0;
    }

    // 2
    public Rectangle(double length, double width, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    // 3
    @Override
    public double getArea() {
        return length * width;
    }

    // 4
    public double getPerimeter() {
        return (width + length) * 2;
    }

    // 5
    @Override
    public String toString() {
        return "Rectangle{" + "length=" + getLength() +
                ", width=" + getWidth() +
                ", color=" + getColor() +
                '}';
    }

    // Add method
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

}