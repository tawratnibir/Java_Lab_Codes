public class Rectangle extends Shape{
    double width = 1.0;
    double length = 1.0;
    public Rectangle() {
        super();
    }
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return this.width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return this.length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
    public String toString() {
        String fillNess;
        if(this.isFilled()) {
            fillNess = "Filled";
        }
        else{
            fillNess = "Not filled";
        }
        return "A rectangle with color: " + getColor() + "\nLength: " + getLength() + "\nWidth: " + getWidth() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\nAnd " + fillNess + ".";
    }
}
