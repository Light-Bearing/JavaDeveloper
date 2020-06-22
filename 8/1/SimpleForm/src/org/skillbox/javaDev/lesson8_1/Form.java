package org.skillbox.javaDev.lesson8_1;

import javax.swing.*;
import java.awt.event.*;
import java.util.regex.Pattern;

public class Form {
    private final String PATTERN_SURNAME = "[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]*-?[а-яё]*";
    private final String PATTERN_NAME = "[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]*";
    private final String PATTERN_PATRONYMIC = "[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]*";
    private JPanel rootPanel;
    private JButton Button;
    private JTextField jTextSurname;
    private JTextField jTextName;
    private JTextField jTextPatronymic;

    public JPanel getRootPanel() {
        return rootPanel;
    }


    public Form() {

        jTextSurname.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (!valideInput(PATTERN_SURNAME, jTextSurname.getText() + e.getKeyChar()))
                    e.consume();
            }
        });
        jTextName.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (!valideInput(PATTERN_NAME, jTextName.getText() + e.getKeyChar()))
                    e.consume();

            }
        });
        jTextPatronymic.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if (!valideInput(PATTERN_PATRONYMIC, jTextPatronymic.getText() + e.getKeyChar()))
                    e.consume();
            }
        });
    }

    private boolean valideInput(String pattern, String input) {
        return Pattern.compile(pattern).matcher(input).matches();
    }
}
