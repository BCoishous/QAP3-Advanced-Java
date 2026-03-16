public class Ellipse extends Shape {

    protected double a;  
    protected double b;  

    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        a = Math.max(axis1, axis2);
        b = Math.min(axis1, axis2);
    }

    public double getA() { return a; }
    public double getB() { return b; }

    @Override
    public double area() {
        return Math.PI * a * b;
    }

    @Override
    public double perimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }
}