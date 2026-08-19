public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    // 1
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // 2
    public String toString() {
        return "Point{" + "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    // 3
    @Override
    public void moveUp() {
        y += ySpeed;
    }

    // 4
    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    // 5
    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    // 6
    @Override
    public void moveRight() {
        x += xSpeed;
    }

    // Extra method
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
