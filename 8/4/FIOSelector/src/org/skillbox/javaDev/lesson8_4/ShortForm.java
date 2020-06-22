package org.skillbox.javaDev.lesson8_4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static org.skillbox.javaDev.lesson8_4.TextControl.*;

public class ShortForm {
    private JPanel rootPanel;
    private JTextField textFIO;
    private JButton button;
    private FullForm form;

    public ShortForm() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                onClickButton();
            }
        });
        textFIO.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER && e.isControlDown()) onClickButton();
            }
        });

        textFIO.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (!valideInput(PATTERN_FIO, textFIO.getText() + e.getKeyChar()))
                    e.consume();
            }
        });
    }

    private void onClickButton() {
        String[] array = textFIO.getText().split(" ");
        if (array.length > 0)
            form.getTextSurname().setText(array[0]);
        else form.getTextSurname().setText("");
        if (array.length > 1)
            form.getTextName().setText(array[1]);
        else form.getTextName().setText("");
        if (array.length > 2)
            form.getTextPatronymic().setText(array[2]);
        else form.getTextPatronymic().setText("");
        form.getRootPanel().getParent().getParent().getParent().setVisible(true);
        rootPanel.getParent().getParent().getParent().setVisible(false);
    }

    public void setFullForm(FullForm form) {
        this.form = form;
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JTextField getTextFIO() {
        return textFIO;
    }
}
