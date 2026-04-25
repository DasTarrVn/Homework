public class Rectangle extends Shape {
    protected double length;
    protected double width;

    public Rectangle() {
        super();
        length = 0.0;
        width = 0.0;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

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

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + getLength() +
                ", width=" + getWidth() +
                ", color=" + getColor() +
                ", filled=" + isFilled() + '}';
    }
}