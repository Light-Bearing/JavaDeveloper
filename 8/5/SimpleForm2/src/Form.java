import javax.swing.*;

public class Form {
    private JPanel mainPanel;
    private JPanel labelPanel;
    private JPanel editPanel;

    {
        mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.LINE_AXIS));
        labelPanel.add(new JLabel("Фамилия:")).setPreferredSize(labelPanel.getPreferredSize());
        labelPanel.add(new JLabel("Имя:")).setPreferredSize(labelPanel.getPreferredSize());
        labelPanel.add(new JLabel("Отчество:")).setPreferredSize(labelPanel.getPreferredSize());
        editPanel.add(new JTextField()).setPreferredSize(editPanel.getPreferredSize());
        editPanel.add(new JTextField()).setPreferredSize(editPanel.getPreferredSize());
        editPanel.add(new JTextField()).setPreferredSize(editPanel.getPreferredSize());
    }

    public JPanel getRootPanel(){
        return mainPanel;
    }
}
