public class Demo {

    public static void main(String[] args) {

        Point p1 = new Point(1.0f, 2.0f);
        System.out.println("=== Point ===");
        System.out.println(p1);

        MovablePoint mp = new MovablePoint(0.0f, 0.0f, 1.5f, 2.5f);
        System.out.println("\n=== MovablePoint ===");
        System.out.println("Initial: " + mp);

 mp.move();
        System.out.println("After move 1: " + mp);

        mp.move();
        System.out.println("After move 2: " + mp);

        mp.move();
        System.out.println("After move 3: " + mp);
    }
}