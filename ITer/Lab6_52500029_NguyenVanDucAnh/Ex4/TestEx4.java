public class TestEx4 {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.5, "Blue", false);
        System.out.println(c1.toString());
        System.out.println("Area: " + c1.getArea());

        Rectangle r1 = new Rectangle(4.0, 5.0, "Green", true);
        System.out.println(r1.toString());
        System.out.println("Perimeter: " + r1.getPerimeter());

        Square s1 = new Square(3.0, "Yellow", true);
        System.out.println(s1.toString());

        s1.setWidth(10.0);
        System.out.println("After changing width to 10: " + s1.toString());
        System.out.println("Area: " + s1.getArea());

        Shape shape = new Square(5.0);
        System.out.println("Polymorphic shape: " + shape.toString());
    }
}