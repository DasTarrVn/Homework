public class TestEx4 {
    public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle();
        circle.setRadius(100.0);

        System.out.println("Radius: " + circle.getRadius());
        // Expected: Radius: 100.0

        System.out.println("Perimeter: " + circle.getPerimeter());
        // Expected: Perimeter: 628.3185307179587

        System.out.println("Area: " + circle.getArea());
        // Expected: Area: 31415.926535897932

        circle.resize(75);

        System.out.println("Radius after resize: " + circle.getRadius());
        // Expected: Radius after resize: 75.0

        System.out.println("Perimeter after resize: " + circle.getPerimeter());
        // Expected: Perimeter after resize: 471.23889803846896

        System.out.println("Area after resize: " + circle.getArea());
        // Expected: Area after resize: 17671.458676442586
    }
}