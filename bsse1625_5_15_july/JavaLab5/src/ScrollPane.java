import javax.swing.*;
import java.awt.*;

public class ScrollPane extends JScrollPane {
    public ScrollPane(TextArea textArea, int x, int y, int width, int height) {
        super(textArea);
        setBounds(x, y, width, height);
        Color darkGray = new Color(64, 64, 64);
        setBorder(BorderFactory.createLineBorder(darkGray, 1, false));
        getViewport().setBackground(Color.WHITE);
    }
}
