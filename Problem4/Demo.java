public class Demo {

    public static void scaleAll(Scalable[] items, double factor) {
        for (Scalable item : items) {
            item.scale(factor);
        }
    }

    public static void main(String[] args) {

        Shape[] shapes = {
            new Circle(5.0),
            new Ellipse(7.0, 3.0),
            new Triangle(3.0, 4.0, 5.0),
            new EquilateralTriangle(6.0)
        };

        System.out.println("=== Before Scaling ===");
        for (Shape s : shapes) {
            System.out.println(s);
        }

        scaleAll(shapes, 2.0);

        System.out.println("\n=== After Scaling by 2.0 ===");
        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}