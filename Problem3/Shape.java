public abstract class Shape {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public abstract double area();
    public abstract double perimeter();

    @Override
    public String toString() {
        return String.format("%s | Area: %.4f | Perimeter: %.4f",
                             name, area(), perimeter());
    }
}