import javax.swing.*;
import java.awt.*;

public class TextFields extends JTextField {
    public TextFields(int x, int y, int width, int height) {
        super();
        setBounds(x,y,width,height);
        setForeground(new Color(17,17,17));
        Color darkGray = new Color(64, 64, 64);
        setBackground(Color.LIGHT_GRAY);
        setCaretColor(darkGray);
        setBorder(BorderFactory.createLineBorder(darkGray, 2, true));
        setFont(new Font("SansSerif", Font.PLAIN, 16));
        setMargin(new Insets(5,10,5,10));
    }
}
