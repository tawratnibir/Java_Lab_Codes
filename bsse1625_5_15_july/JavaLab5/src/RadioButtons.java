import javax.swing.JRadioButton;
import java.awt.*;

public class RadioButtons extends JRadioButton {
    public RadioButtons(String text, int x, int y, int width, int height) {
        super(text);
        setBounds(x, y, width, height);
        Color lightGreen = new Color(8, 252, 28);
        Color darkGray = new Color(64, 64, 64);
        setBackground(Color.BLACK);
        setForeground(lightGreen);
        setFont(new Font("SansSerif", Font.BOLD, 15));
        setFocusPainted(false);
        setOpaque(false);
    }
}
