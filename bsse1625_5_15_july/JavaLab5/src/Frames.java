import javax.swing.JFrame;
import java.awt.*;

public class Frames extends JFrame {
    public Frames(String text, int sizeHeight, int sizeWidth) {
        super(text);
        setSize(sizeWidth, sizeHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(Color.BLACK);
    }
}
