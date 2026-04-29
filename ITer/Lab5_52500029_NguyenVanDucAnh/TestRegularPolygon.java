public class TestRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon p3 = new RegularPolygon("p3", 3, 2.0);
        System.out.println(p3.toString());
        System.out.println("Perimeter: " + p3.getPerimeter());
        RegularPolygon p4 = new RegularPolygon("q1", 4, 1.5);
        System.out.println("\n" + p4.toString());
        System.out.println("Perimeter: " + p4.getPerimeter());
        RegularPolygon p5 = new RegularPolygon("p5", 5);
        System.out.println("\n" + p5.toString());
        RegularPolygon p6 = new RegularPolygon();
        p6.setName("p6");
        p6.setEdgeAmount(6);
        p6.setEdgeLength(3.0);
        System.out.println("\n" + p6.toString());
        System.out.println("Name: " + p6.getName() + " | Edge Length: " + p6.getEdgeLength());
        RegularPolygon p7 = new RegularPolygon("p7", 8, 4.0);
        System.out.println("\n" + p7.toString());
        System.out.println("Area (returns -1 due to > 6 edges): " + p7.getArea());
        System.out.println("\n-- Test Copy Constructor --");
        RegularPolygon cloneP4 = new RegularPolygon(p4);
        System.out.println("Clone of q1: " + cloneP4.toString());
    }
}