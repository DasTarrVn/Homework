public class TestEx3 {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println(point);
        // Expected: Point{x=0, y=0, xSpeed=2, ySpeed=3}

        point.moveUp();
        point.moveRight();
        System.out.println(point);
        // Expected: Point{x=2, y=3, xSpeed=2, ySpeed=3}

        MovableCircle circle = new MovableCircle(5, 5, 1, 2, 10);
        System.out.println(circle);
        // Expected: Circle has a center{x=5, y=5}

        circle.moveDown();
        circle.moveLeft();
        System.out.println(circle);
        // Expected: Circle has a center{x=4, y=3}
    }
}