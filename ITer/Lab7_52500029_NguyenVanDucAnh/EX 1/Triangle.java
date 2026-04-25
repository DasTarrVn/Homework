public class Triangle extends Shape {
    private double base;
    private double height;

    // 1
    public Triangle() {
        super();
    }

    // 2
    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    // 3
    @Override
    public double getArea() {
        return (double) 0.5 * base * height;
    }

    // 4
    @Override
    public String toString() {
        return "Triangle{" + "base=" + base +
                ", height=" + height +
                ", color=" + getColor() +
                '}';
    }
}
