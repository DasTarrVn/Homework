public class Car {
    private String brand;
    private String name;
    private String color;
    private double speed;
    private static double MAX_SPEED = 200;

    public Car() {
        brand = "honda";
        name = "name1";
        color = "blind";
        speed = 0.0;
    }

    public Car(String brand, String name, String color, double speed) {
        this.brand = brand;
        this.name = name;
        this.color = color;
        setSpeed(speed);
    }

    public Car(Car other) {
        this.brand = other.brand;
        this.name = other.name;
        this.color = other.color;
        setSpeed(other.speed);
    }

    // getter
    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getSpeed() {
        return speed;
    }

    // setter
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(double speed) {
        if (speed >= 0 && speed <= MAX_SPEED) {
            this.speed = speed;
        }
    }

    public void accelerate(int value) {
        if (value > 0 && (this.speed + value) <= MAX_SPEED) {
            this.speed += value;
        }
    }

    public void accelerate(int value, boolean turboMode) {
        int actualValue = turboMode ? value * 2 : value;
        if (value > 0 && (this.speed + actualValue) <= MAX_SPEED) {
            this.speed += actualValue;
        }
    }

    public void brake(int value) {
        this.speed = Math.max(0, this.speed - value);
    }

    public Car speedCompare(Car car2) {
        return (this.speed >= car2.speed) ? this : car2;
    }

    @Override
    public String toString() {
        return "Car[brand=" + brand + ", name=" + name + ", color=" + color + ", speed=" + speed + "]";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car other = (Car) obj;
            return this.getSpeed() == other.getSpeed() &&
                    this.getName().equals(other.getName()) &&
                    this.getColor().equals(other.getColor()) &&
                    this.getBrand().equals(other.getBrand());
        } else {
            return false;
        }
    }

}
