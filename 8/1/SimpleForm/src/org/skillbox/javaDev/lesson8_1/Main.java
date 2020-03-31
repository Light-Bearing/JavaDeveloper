package org.skillbox.javaDev.lesson8_1;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame frame = new JFrame();
        Form form = new Form();
        frame.setContentPane(form.getRootPanel());

        frame.setTitle("Simple form");
        Dimension dimension= new Dimension();
        dimension.setSize(400,300);
        frame.setSize(dimension);
        frame.setMaximumSize(dimension);
        frame.setMinimumSize(dimension);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
