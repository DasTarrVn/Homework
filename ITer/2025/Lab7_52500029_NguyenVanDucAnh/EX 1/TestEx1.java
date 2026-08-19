public class TestEx1 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Rectangle(5.0, 3.0, "Red");
        shapes[1] = new Triangle(4.0, 6.0, "Blue");
        shapes[2] = new Rectangle();
        shapes[3] = new Triangle();

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape " + (i + 1) + ":");
            System.out.println(shapes[i].toString());
            System.out.println("Area = " + shapes[i].getArea());
        }
    }
}