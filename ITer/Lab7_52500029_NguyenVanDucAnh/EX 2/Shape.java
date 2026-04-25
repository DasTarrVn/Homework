public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        color = "Unknown";
        filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Shape) {
            Shape other = (Shape) obj;
            return this.getArea() == other.getArea();
        } else {
            return false;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(String color) {
        setColor(color);
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{color=" + color + ", filled=" + filled + "}";
    }
    // Add method

}