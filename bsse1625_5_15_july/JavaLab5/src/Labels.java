import javax.swing.JLabel;
import java.awt.*;

public class Labels extends JLabel {
    public Labels(String text, int x, int y, int width, int height) {
        super(text);
        setBounds(x,y,width,height);
        Color lightGreen = new Color(8, 252, 28);
        setForeground(lightGreen);
        setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
    }
    public Labels(int x, int y, int width, int height) {
        setBounds(x,y,width,height);
        Color lightGreen = new Color(8, 252, 28);
        setForeground(lightGreen);
        setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
    }
}
