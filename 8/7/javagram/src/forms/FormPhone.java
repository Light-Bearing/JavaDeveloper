package forms;

import javax.swing.*;
import java.awt.event.ActionListener;

public class FormPhone {

    private JPanel panelPhone;
    private JButton buttonContinue;
    private JPanel logoPanel;
    private JLabel label;
    private JTextField textField1;
    private JTextPane введитеКодСтраныИTextPane;

    public JPanel getRootPanel() {
        return panelPhone;
    }

    public void addApplyAction(ActionListener listener) {
        buttonContinue.addActionListener(listener);
    }
}
