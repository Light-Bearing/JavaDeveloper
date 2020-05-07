import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPhone {
    public JPanel getPanelPhone() {
        return panelPhone;
    }

    private JPanel panelPhone;

    public void setPanelMain(JPanel panelMainPhone) {
        this.panelMainPhone = panelMainPhone;
    }

    private JPanel panelMainPhone;
    private JLabel labelUnderLogo;
    private JPanel panelLogo;
    private JTextField textFieldPhoneNumber;
    private JButton buttonContinue;
    private JTextPane jPane;
    private JButton buttonClose;
    private JButton nuttonMinimaze;

    public void setFormCode(FormCode formCode) {
        this.formCode = formCode;
    }

    private FormCode formCode;

    public FormPhone() {
        panelMainPhone.setLayout(new BoxLayout(panelMainPhone, BoxLayout.Y_AXIS));

        buttonClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        nuttonMinimaze.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((JFrame) panelPhone.getParent().getParent().getParent()).setState(JFrame.ICONIFIED);
            }
        });
        buttonContinue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelPhone.remove(panelMainPhone);
                formCode.setRootPanel(panelPhone);
                panelPhone.add(formCode.getPanelMainCode());
                panelPhone.updateUI();
            }
        });
    }
}
