import javax.swing.*;
import java.awt.event.ActionEvent;
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
    private JButton button1;

    public void setRootPanel(JPanel rootPanel) {
        this.rootPanel = rootPanel;
    }

    private JPanel rootPanel;

    public void setMainForm(FormMain mainForm) {
        this.mainForm = mainForm;
    }

    private FormMain mainForm;

    public FormCode() {
        panelMainCode.setLayout(new BoxLayout(panelMainCode, BoxLayout.Y_AXIS));


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rootPanel.remove(panelMainCode);
                rootPanel.add(mainForm.getPanelMain());
                rootPanel.updateUI();
            }
        });
    }
}
