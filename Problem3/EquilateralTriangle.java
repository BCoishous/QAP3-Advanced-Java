public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double side) {
        super(side, side, side);
        name = "EquilateralTriangle";
    }

    @Override
    public double area() {
        return (Math.sqrt(3) / 4) * side1 * side1;
    }
}