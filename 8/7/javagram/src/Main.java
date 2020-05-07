import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame phoneFrame = new JFrame();

        FormPhone formPhone = new FormPhone();
        FormCode formCode =new FormCode();
        FormMain formMain = new FormMain();
        formCode.setMainForm(formMain);
        phoneFrame.setContentPane(formPhone.getPanelPhone());


        Dimension dimensionMainForm= new Dimension();

        dimensionMainForm.setSize(800,600);
        formPhone.setFormCode(formCode);
        phoneFrame.setSize(dimensionMainForm);
        phoneFrame.setMaximumSize(dimensionMainForm);
        phoneFrame.setMinimumSize(dimensionMainForm);
        phoneFrame.setLocationRelativeTo(null);
        phoneFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        phoneFrame.setVisible(true);
    }
}
