import javax.swing.JLabel;
import java.awt.*;

public class Labels extends JLabel {
    public Labels(String text, int x, int y, int width, int height) {
        super(text);
        setBounds(x,y,width,height);
        Color lightGreen = new Color(26, 135, 126);
        setForeground(lightGreen);
        setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
    }
    public Labels(int x, int y, int width, int height) {
        setBounds(x,y,width,height);
        Color lightGreen = new Color(26, 135, 126);
        setForeground(lightGreen);
        setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
    }
}
