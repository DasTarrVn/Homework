public class Temperature {
    private double celsius;
    private String location;

    public Temperature() {
        this.celsius = 0.0;
        this.location = "Unknown";
    }

    public Temperature(double celsius, String location) {
        this.celsius = celsius;
        this.location = location;
    }

    public Temperature(Temperature other) {
        this.celsius = other.celsius;
        this.location = other.location;
    }

    // Accessors (Getters)
    public double getCelsius() {
        return celsius;
    }

    public String getLocation() {
        return location;
    }

    // Mutators (Setters)
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Methods for conversion
    public double toFahrenheit() {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public double toKelvin() {
        return celsius + 273.15;
    }

    // Compare and return the object with higher temperature
    public Temperature compares(Temperature tem) {
        if (this.celsius >= tem.getCelsius()) {
            return this;
        } else {
            return tem;
        }
    }

    // toString Method
    @Override
    public String toString() {
        return "Temperature[location=" + location +
                ", celsius=" + celsius +
                ", fahrenheit=" + toFahrenheit() +
                ", kelvin=" + toKelvin() + "]";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Temperature) {
            Temperature other = (Temperature) obj;
            return this.getCelsius() == other.getCelsius() &&
                    this.getLocation().equals(other.getLocation());
        } else {
            return false;
        }
    }
}