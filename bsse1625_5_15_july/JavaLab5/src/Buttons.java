import javax.swing.*;
import java.awt.*;

public class Buttons extends JButton {
    public Buttons(String text, int x, int y, int width, int height){
        super(text);
        setBounds(x, y, width, height);
        setBackground(new Color(67, 160, 71));
        setForeground(new Color(255, 255, 255));
        setFont(new Font("SansSerif", Font.BOLD, 16));
        setBorder(BorderFactory.createLineBorder(new Color(67, 160, 71), 2, true));
        setFocusPainted(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));

    }
}
