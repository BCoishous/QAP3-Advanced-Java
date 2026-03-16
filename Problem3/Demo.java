public class Demo {

    public static void main(String[] args) {

        Shape[] shapes = {
            new Circle(5.0),
            new Ellipse(7.0, 3.0),
            new Triangle(3.0, 4.0, 5.0),
            new EquilateralTriangle(6.0)
        };

        System.out.println("=== Shape Array Output ===");
        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}