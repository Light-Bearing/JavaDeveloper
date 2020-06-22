package org.skillbox.javaDev.lesson8_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


import static org.skillbox.javaDev.lesson8_2.TextControl.*;

public class FullForm {

    private JPanel rootPanel;
    private JTextField textSurname;
    private JButton button;
    private JTextField textName;
    private JTextField textPatronymic;
    private ShortForm shortForm;

    public FullForm() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                onClickButton();
            }
        });
        textPatronymic.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER && e.isControlDown()) onClickButton();
            }
        });
        textName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER && e.isControlDown()) onClickButton();
            }
        });
        textSurname.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER && e.isControlDown()) onClickButton();
            }
        });
        textSurname.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (!valideInput(PATTERN_SURNAME, textSurname.getText() + e.getKeyChar()))
                    e.consume();
            }
        });
        textName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (!valideInput(PATTERN_NAME, textName.getText() + e.getKeyChar()))
                    e.consume();
            }
        });
        textPatronymic.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (!valideInput(PATTERN_PATRONYMIC, textPatronymic.getText() + e.getKeyChar()))
                    e.consume();
            }
        });
    }

    private void onClickButton() {
        this.rootPanel.getParent().getParent().getParent().setVisible(false);
        String fio = textSurname.getText() + " " + textName.getText() + " " + textPatronymic.getText();
        shortForm.getTextFIO().setText(fio.trim());
        shortForm.getRootPanel().getParent().getParent().getParent().setVisible(true);
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void setShortForm(ShortForm shortFrame) {
        this.shortForm = shortFrame;
    }

    public JTextField getTextSurname() {
        return textSurname;
    }

    public JTextField getTextName() {
        return textName;
    }

    public JTextField getTextPatronymic() {
        return textPatronymic;
    }
}
