package forms;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FormPhone {

    private JPanel panelPhone;
    private BufferedImage background;
    private JButton buttonContinue;
    private JPanel logoPanel;
    private JTextField textField1;
    private JTextPane hintTextPane;

    {
        StyledDocument doc = hintTextPane.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
    }

    public FormPhone() {
        try {
            background = ImageIO.read(new File("res/imj/background.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public JPanel getRootPanel() {
        return panelPhone;
    }

    public void addApplyAction(ActionListener listener) {
        buttonContinue.addActionListener(listener);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        panelPhone = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background, 0, 0, null);
            }
        };
    }
}
