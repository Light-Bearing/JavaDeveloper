package my.Project.Forms;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FormMain extends JPanel {
    private JPanel captionPanel;
    private JButton buttonMinimized;
    private JButton buttonClose;
    private JPanel mainPanel;
    private JPanel rootPanel;
    private BufferedImage iconClose;
    private BufferedImage iconMinimized;

    public FormMain() {
        try {
            iconClose = ImageIO.read(new File("D:\\project\\skillbox\\JavaDeveloper\\9\\javagram\\src\\res\\icon\\icon-close.png"));
            iconMinimized = ImageIO.read(new File("D:\\project\\skillbox\\JavaDeveloper\\9\\javagram\\src\\res\\icon\\icon-hide.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        buttonClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        buttonMinimized.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ((JFrame) rootPanel.getParent().getParent().getParent()).setState(JFrame.ICONIFIED);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        rootPanel = this;
        buttonClose = new JButton(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(iconClose,0,0,null);
            }
        };
        buttonMinimized = new JButton(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(iconMinimized,0,0,null);
            }
        };
    }

    public void setMainPanel(JPanel panel) {
        rootPanel.remove(mainPanel);
        mainPanel = panel;
        rootPanel.add(mainPanel);
    }
}
