package my.Project.Forms;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FormPhone {
    private JPanel rootPanel;
    private BufferedImage background;
    private JPanel logoPanel;
    private BufferedImage logo;
    private JTextPane hintTextPane;
    private JTextField textFieldPhone;
    private BufferedImage phonePic;
    private JButton buttonContinue;
    private BufferedImage buttonBackraund;

    {
        StyledDocument doc = hintTextPane.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
    }

    public FormPhone() {
        try {
            background = ImageIO.read(new File("D:\\project\\skillbox\\JavaDeveloper\\9\\javagram\\src\\res\\imj\\background.png"));
            logo = ImageIO.read(new File("D:\\project\\skillbox\\JavaDeveloper\\9\\javagram\\src\\res\\logo\\logo.png"));
            phonePic = ImageIO.read(new File("D:\\project\\skillbox\\JavaDeveloper\\9\\javagram\\src\\res\\icon\\icon-phone.png"));
            buttonBackraund = ImageIO.read(new File("D:\\project\\skillbox\\JavaDeveloper\\9\\javagram\\src\\res\\imj\\button-background.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void addApplyAction(ActionListener listener) {
        buttonContinue.addActionListener(listener);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        rootPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(background, 0, 0, null);
            }
        };
        logoPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(logo, 0, 0, null);
            }
        };
        textFieldPhone = new JTextField() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(phonePic, 14, 10, null);
            }
        };
        Border phoneBorder = BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 0, 2, 0, Color.WHITE),
                BorderFactory.createEmptyBorder(0, 45, 0, 0));
        textFieldPhone.setBorder(phoneBorder);
        buttonContinue = new JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(buttonBackraund, 0, 0, null);
                g.setFont(new Font("Arial",Font.ROMAN_BASELINE,30));
                g.setColor(Color.WHITE);
                g.drawString("ПРОДОЛЖИТЬ",65,40);
            }
        };


    }
}
