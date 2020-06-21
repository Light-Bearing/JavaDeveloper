package forms;

import javax.swing.*;
import java.awt.*;

public class FormController extends JFrame {
    FormMain formMain;

    public FormController() throws HeadlessException {
        FormPhone formPhone = new FormPhone();
        setContentPanel(formPhone.getRootPanel());
        formPhone.addApplyAction(e -> changeFormPhone());
    }

    {
        formMain = new FormMain();
        setContentPane(formMain);
    }

    protected void changeFormPhone() {
        FormCode formCode = new FormCode();
        setContentPanel(formCode.getRootPanel());
        formCode.addApplyAction(e -> changeFormCode());
    }

    protected void changeFormCode() {
        FormMessage formMessage = new FormMessage();
        setContentPanel(formMessage.getRootPanel());
    }

    protected void setContentPanel(JPanel mainPanel) {
        formMain.setMainPanel(mainPanel);
        getContentPane().revalidate();
    }
}
