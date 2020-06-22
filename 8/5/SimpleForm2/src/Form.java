import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Form {
    private JPanel mainPanel;
    private JPanel labelPanel;
    private JPanel editPanel;

    private JTextField JTSurname = new JTextField();
    private JTextField JTName = new JTextField();
    private JTextField JTPatronymic = new JTextField();

    {
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.LINE_AXIS));
        labelPanel.add(new JLabel("Фамилия:")).setPreferredSize(labelPanel.getPreferredSize());
        labelPanel.add(new JLabel("Имя:")).setPreferredSize(labelPanel.getPreferredSize());
        labelPanel.add(new JLabel("Отчество:")).setPreferredSize(labelPanel.getPreferredSize());

        editPanel.add(JTSurname).setPreferredSize(editPanel.getPreferredSize());
        editPanel.add(JTName).setPreferredSize(editPanel.getPreferredSize());
        editPanel.add(JTPatronymic).setPreferredSize(editPanel.getPreferredSize());
    }

    public Form() {
        JTSurname.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (!TextControl.valideInput(TextControl.PATTERN_SURNAME, JTSurname.getText() + e.getKeyChar()))
                    e.consume();
            }
        });
        JTName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (!TextControl.valideInput(TextControl.PATTERN_NAME, JTName.getText() + e.getKeyChar()))
                    e.consume();
            }
        });
        JTPatronymic.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (!TextControl.valideInput(TextControl.PATTERN_PATRONYMIC, JTPatronymic.getText() + e.getKeyChar()))
                    e.consume();
            }
        });
    }

    public JPanel getRootPanel() {
        return mainPanel;
    }
}
