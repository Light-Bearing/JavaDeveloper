import javax.swing.*;
import java.awt.*;

public class SimpleForm {

    public static void main(String[] args) {
        // write your code here
        JFrame frame = new JFrame();
        Form form = new Form();
        frame.setContentPane(form.getRootPanel());

        frame.setTitle("Simple form");
        Dimension dimension = new Dimension();
        dimension.setSize(400, 320);
        frame.setSize(dimension);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }

}
