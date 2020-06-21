package forms;

import javax.swing.*;
import java.awt.event.ActionListener;

public class FormCode {

    private JPanel panel1;

    public JPanel getPanelMainCode() {
        return panelMainCode;
    }

    private JPanel panelMainCode;
    private JLabel jLabelPhoneNumber;
    private JTextPane наДанныйНомерТелефонаTextPane;
    private JTextField textField1;
    private JButton buttonContinue;



    public void addApplyAction(ActionListener listener) {
        buttonContinue.addActionListener(listener);
    }

    public JPanel getRootPanel() {
        return panelMainCode;
    }
}
