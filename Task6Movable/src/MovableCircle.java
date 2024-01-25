public class MovableCircle  implements Movanble{
    private MovablePoint qendra;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        qendra     = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        qendra.y += qendra.ySpeed;
    }

    @Override
    public void moveDown() {
        qendra.y -= qendra.ySpeed;
    }

    @Override
    public void moveLeft() {
        qendra.x += qendra.xSpeed;
    }

    @Override
    public void moveRight() {
        qendra.x -= qendra.xSpeed;
    }

    public String toString() {
        return String.format("MovableCircle at point %1$s with radius = %2$d"
                , qendra.toString(), radius);
    }
}
