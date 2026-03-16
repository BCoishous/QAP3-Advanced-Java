public class MovablePoint extends Point {

    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getters
    public float getXSpeed() { return xSpeed; }
    public float getYSpeed() { return ySpeed; }

    // Setters
    public void setXSpeed(float xSpeed) { this.xSpeed = xSpeed; }
    public void setYSpeed(float ySpeed) { this.ySpeed = ySpeed; }

    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint at " + super.toString()
             + " with speed (" + xSpeed + ", " + ySpeed + ")";
    }
}