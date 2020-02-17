package org.skillbox.lesson3;

import org.javagram.TelegramApiBridge;
import org.javagram.response.AuthAuthorization;
import org.javagram.response.AuthCheckedPhone;
import org.javagram.response.AuthSentCode;
import org.javagram.response.object.User;
import org.telegram.api.TLAbsUser;
import org.telegram.api.auth.TLAuthorization;
import org.telegram.api.requests.TLRequestAuthSignIn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, type phone number:");
        String phoneNumber = reader.readLine().trim();

        TelegramApiBridge bridge = new TelegramApiBridge("149.154.167.50:443", 718505, "432dbe82e512be4a98b3cb8a835179c6");

        AuthCheckedPhone authCheckPhone = bridge.authCheckPhone(phoneNumber);

        if (authCheckPhone.isRegistered()) {
            bridge.authSendCode(phoneNumber);

            System.out.println("Please, type confirm code:");
            String code = reader.readLine().trim();

            AuthAuthorization authSignIn = bridge.authSignIn(code);
            String name = authSignIn.getUser().getFirstName() + " " + authSignIn.getUser().getLastName();
            System.out.println("Autorizated name: " + name.trim());
        } else {
            System.out.println("Please registred nuber");
        }
    }
}
