import javax.swing.*;
import java.awt.*;

public class TextArea extends JTextArea{
    public TextArea(){
        setLineWrap(true);
        setWrapStyleWord(true);
        setBorder(BorderFactory.createLineBorder(Color.GRAY));
        setEnabled(true);
        setEditable(true);
        Color darkGray = new Color(64, 64, 64);
        setBackground(Color.LIGHT_GRAY);
        setForeground(darkGray);
        setCaretColor(darkGray);
        setFont(new Font("SansSerifSansSerif", Font.BOLD, 16));
        setBorder(BorderFactory.createLineBorder(darkGray, 1, false));
    }
}
