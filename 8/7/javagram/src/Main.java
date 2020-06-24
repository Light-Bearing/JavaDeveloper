import forms.FormController;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame mainFrame = new FormController();

        Dimension dimensionMainForm = new Dimension();
        dimensionMainForm.setSize(800, 600);
        mainFrame.setSize(dimensionMainForm);

        mainFrame.setUndecorated(true);

        mainFrame.setLocationRelativeTo(null);

        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainFrame.setVisible(true);
    }
}
