package my.Project.Forms;

import javax.swing.*;
import java.awt.event.ActionListener;

public class FormCode {
    private JLabel jLabelPhoneNumber;
    private JTextPane наДанныйНомерТелефонаTextPane;
    private JTextField textField1;
    private JButton buttonContinue;
    private JPanel rootPanel;

    public void addApplyAction(ActionListener listener) {
        buttonContinue.addActionListener(listener);
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
