public class MovableCircle implements Movable {
    int radius;
    MovablePoint center;

    // 1
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    // 2
    @Override
    public String toString() {
        return "Circle has a center{" + "x=" + center.getX() +
                ", y=" + center.getY() +
                '}';
    }

    // 3
    @Override
    public void moveUp() {
        center.moveUp();
    }

    // 4
    @Override
    public void moveDown() {
        center.moveDown();
        ;
    }

    // 5
    @Override
    public void moveLeft() {
        center.moveLeft();
        ;
    }

    // 6
    @Override
    public void moveRight() {
        center.moveRight();
        ;
    }

}
