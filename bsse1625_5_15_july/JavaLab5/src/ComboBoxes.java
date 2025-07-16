import javax.swing.*;
import java.awt.*;

public class ComboBoxes extends JComboBox<String> {
    public ComboBoxes(String[] items, int x, int y, int width, int height) {
        super(items);
        setBounds(x, y, width, height);
        Color darkGray = new Color(64, 64, 64);
        setBackground(new Color(238, 224, 190));
        setForeground(darkGray);
        setBorder(BorderFactory.createLineBorder(darkGray, 1, false));
        setFont(new Font("SansSerif", Font.PLAIN, 15));
    }
}
