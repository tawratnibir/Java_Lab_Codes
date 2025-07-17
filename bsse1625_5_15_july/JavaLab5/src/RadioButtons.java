import javax.swing.JRadioButton;
import java.awt.*;

public class RadioButtons extends JRadioButton {
    public RadioButtons(String text, int x, int y, int width, int height) {
        super(text);
        setBounds(x, y, width, height);
        setBackground(new Color(249, 249, 249));
        setForeground(new Color(26, 35, 126));
        setFont(new Font("SansSerif", Font.BOLD, 15));
        setFocusPainted(false);
        setOpaque(false);
    }
}
