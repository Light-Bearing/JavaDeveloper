package org.skillbox.javaDev.lesson8_2;

import javax.swing.*;
import javax.swing.event.CaretListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
    }

    private void onClickButton() {
        this.rootPanel.getParent().getParent().getParent().setVisible(false);
        String fio = textSurname.getText() + " " + textName.getText() + " " +textPatronymic.getText();
        shortForm.getTextFIO().setText(fio);
        shortForm.getRootPanel().getParent().getParent().getParent().setVisible(true);
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void setShortForm(ShortForm shortFrame) {
        this.shortForm = shortFrame;
    }

    public JTextField getTextSurname(){
        return textSurname;
    }

    public  JTextField getTextName(){
        return textName;
    }
    public JTextField getTextPatronymic(){
        return textPatronymic;
    }
}
