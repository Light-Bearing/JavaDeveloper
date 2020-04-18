package org.skillbox.javaDev.lesson8_2;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame frame = new JFrame();
        JFrame shortFrame = new JFrame();

        FullForm fullForm = new FullForm();

        ShortForm shortForm =new ShortForm();

        frame.setContentPane(fullForm.getRootPanel());
        shortFrame.setContentPane(shortForm.getRootPanel());

        fullForm.setShortForm(shortForm);
        shortForm.setFullForm(fullForm);

        frame.setTitle("Full form");
        shortFrame.setTitle("short form");

        Dimension dimensionFullForm= new Dimension();
        Dimension dimensionShortForm= new Dimension();
        dimensionFullForm.setSize(400,220);
        dimensionShortForm.setSize(400,120);
        frame.setSize(dimensionFullForm);
        frame.setMaximumSize(dimensionFullForm);
        frame.setMinimumSize(dimensionFullForm);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        shortFrame.setSize(dimensionShortForm);
        shortFrame.setMinimumSize(dimensionShortForm);
        shortFrame.setMaximumSize(dimensionShortForm);
        shortFrame.setLocationRelativeTo(null);
        shortFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
