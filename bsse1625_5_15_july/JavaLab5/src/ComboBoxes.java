import javax.swing.*;
import java.awt.*;

public class ComboBoxes extends JComboBox<String> {
    public ComboBoxes(String[] items, int x, int y, int width, int height) {
        super(items);
        setBounds(x, y, width, height);
        Color darkGray = new Color(64, 64, 64);
        setBackground(Color.LIGHT_GRAY);
        setForeground(Color.BLACK);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, false));
        setFont(new Font("SansSerif", Font.PLAIN, 15));
    }
}
