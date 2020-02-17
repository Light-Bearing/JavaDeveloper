import javax.swing.*;
import java.awt.*;

public class Loader {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        // Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        Integer windowWidth = 800, windowHeight = 600;
        // frame.setSize(dimension.width,dimension.height);
        frame.setSize(windowWidth, windowHeight);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Our first window application");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        System.out.println("Some text!");
    }
}
