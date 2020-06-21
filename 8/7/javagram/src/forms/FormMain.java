package forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormMain extends JPanel {
    private JPanel rootPanel;
    private JPanel captionPanel;
    private JPanel mainPanel;
    private JButton buttonMinimisaded;
    private JButton buttonClose;

    public FormMain() {
        buttonClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        buttonMinimisaded.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ((JFrame) rootPanel.getParent().getParent().getParent()).setState(JFrame.ICONIFIED);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        rootPanel = this;
    }

    public void setMainPanel(JPanel panel) {
        rootPanel.remove(mainPanel);
        mainPanel = panel;
        rootPanel.add(mainPanel);
    }
}
