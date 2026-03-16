public class Triangle extends Shape {

    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(double s1, double s2, double s3) {
        super("Triangle");
        if (s1 + s2 <= s3 || s2 + s3 <= s1 || s3 + s1 <= s2) {
            System.err.println("Error: " + s1 + ", " + s2 + ", " + s3
                             + " cannot form a valid triangle.");
            System.exit(1);
        }
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public double getSide1() { return side1; }
    public double getSide2() { return side2; }
    public double getSide3() { return side3; }

    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double area() {
        double s = perimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}