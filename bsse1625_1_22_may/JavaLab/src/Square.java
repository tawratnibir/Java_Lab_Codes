public class Square extends Rectangle{
    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return this.length;
    }
    public void setSide(double side) {
        this.length = side;
    }
    public String toString() {
        String fillNess;
        if(isFilled()) {
            fillNess = "Filled";
        }
        else{
            fillNess = "Not filled";
        }
        return "A square of color: " + getColor() + "\nSide: " + getSide() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\nAnd " + fillNess + ".";
    }
}
