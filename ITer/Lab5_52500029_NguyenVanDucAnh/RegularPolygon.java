public class RegularPolygon {
    private String name;
    private int edgeAmount;
    private double edgeLength;

    public RegularPolygon() {
        this.name = "";
        this.edgeAmount = 3;
        this.edgeLength = 1;
    }

    public RegularPolygon(String name, int edgeAmount, double edgeLength) {
        this.name = name;
        this.edgeAmount = edgeAmount;
        this.edgeLength = edgeLength;
    }

    public RegularPolygon(String name, int edgeAmount) {
        this.name = name;
        this.edgeAmount = edgeAmount;
        this.edgeLength = 1; // Default
    }

    public RegularPolygon(RegularPolygon polygon) {
        this.name = polygon.name;
        this.edgeAmount = polygon.edgeAmount;
        this.edgeLength = polygon.edgeLength;
    }

    public String getName() {
        return name;
    }

    public int getEdgeAmount() {
        return edgeAmount;
    }

    public double getEdgeLength() {
        return edgeLength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEdgeAmount(int edgeAmount) {
        this.edgeAmount = edgeAmount;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    public String getPolygon() {
        if (edgeAmount == 3)
            return "Triangle";
        if (edgeAmount == 4)
            return "Quadrangle";
        if (edgeAmount == 5)
            return "Pentagon";
        if (edgeAmount == 6)
            return "Hexagon";
        if (edgeAmount > 6)
            return "Polygon has the number of edges greater than 6";
        return "Unknown";
    }

    public double getPerimeter() {
        return edgeAmount * edgeLength;
    }

    public double getArea() {
        double a = 0;
        switch (edgeAmount) {
            case 3:
                a = 0.433;
                break;
            case 4:
                a = 1.0;
                break;
            case 5:
                a = 1.72;
                break;
            case 6:
                a = 2.595;
                break;
            default:
                return -1; // If > 6 return -1
        }
        return (edgeLength * edgeLength) * a;
    }

    @Override
    public String toString() {
        return name + " - " + getPolygon() + " - " + getArea();
    }
}
