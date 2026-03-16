public class Circle extends Ellipse {

    public Circle(double radius) {
        super(radius, radius);
        name = "Circle";
    }

    public double getRadius() { return a; }

    @Override
    public double area() {
        return Math.PI * a * a;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * a;
    }
}