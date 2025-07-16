import javax.swing.*;
import java.awt.*;

public class Buttons extends JButton {
    public Buttons(String text, int x, int y, int width, int height){
        super(text);
        setBounds(x, y, width, height);
        setBackground(new Color(0,200,83));
        setForeground(Color.BLACK);
        setFont(new Font("SansSerif", Font.BOLD, 16));
        setBorder(BorderFactory.createLineBorder(new Color(0,200,83), 2, true));
        setFocusPainted(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));

    }
}
