//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape triangle = new Shape("red", true);
        System.out.println(triangle.toString());
        Shape circle = new Shape();
        System.out.println(circle.toString());
        circle.setColor("yellow");
        circle.setFilled(false);
        System.out.println(circle.getColor());
        System.out.println(circle.isFilled());
        System.out.println(circle.toString());
        Rectangle rec = new Rectangle(5.0, 4.0);
        System.out.println(rec.toString());
        Circle crc = new Circle(5.0);
        System.out.println(crc.toString());
        Square sq = new Square(4.0, "black", false);
        System.out.println(sq.toString());
    }
}