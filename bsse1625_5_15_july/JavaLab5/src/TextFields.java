import javax.swing.*;
import java.awt.*;

public class TextFields extends JTextField {
    public TextFields(int x, int y, int width, int height) {
        super();
        setBounds(x,y,width,height);
        setBackground(new Color(238, 224, 190));
        setForeground(Color.BLACK);
        Color darkGray = new Color(64, 64, 64); // or (50,50,50), (40,40,40) for even darker
        setCaretColor(darkGray);
        setBorder(BorderFactory.createLineBorder(darkGray, 2, false)); // 2px, rounded
        setFont(new Font("SansSerif", Font.PLAIN, 16));
        setMargin(new Insets(5,10,5,10)); // top, left, bottom, right
    }
}
