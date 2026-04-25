public abstract class Shape {
    protected String color;

    public Shape() {
        color = "Unknown";
    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // Add method

}