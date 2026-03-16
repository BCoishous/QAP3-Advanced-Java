public abstract class Shape implements Scalable {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public abstract double area();
    public abstract double perimeter();

    @Override
    public abstract void scale(double factor);

    @Override
    public String toString() {
        return String.format("%s | Area: %.4f | Perimeter: %.4f",
                             name, area(), perimeter());
    }
}