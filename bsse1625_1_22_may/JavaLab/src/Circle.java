public class Circle extends Shape{
    private double PI = 3.1415926;
    double radius = 1.0;
    public Circle() {
        super();
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        double radius = this.radius;
        return PI * radius * radius;
    }
    public double getPerimeter() {
        double radius = this.radius;
        return 2 * PI * radius;
    }
    public String toString() {
        String fillNess;
        if(isFilled()) {
            fillNess = "Filled";
        }
        else{
            fillNess = "Not Filled";
        }
        return "A circle with radius of " + getRadius() + ", color of " + getColor() + ".\nThe area is: " + getArea() + "\nThe perimeter is: " + getPerimeter() + " and " + fillNess + ".";
    }
}
