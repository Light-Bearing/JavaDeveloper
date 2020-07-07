package my.Project;



import my.Project.Forms.FormController;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame mainFrame = new FormController();

        Dimension dimensionMainForm = new Dimension();
        dimensionMainForm.setSize(900, 625);
        mainFrame.setSize(dimensionMainForm);
        mainFrame.setUndecorated(true);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }
}
