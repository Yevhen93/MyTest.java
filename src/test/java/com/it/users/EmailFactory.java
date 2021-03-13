package com.it.users;

import java.util.ResourceBundle;

public class EmailFactory {
    static ResourceBundle resourceEmail = ResourceBundle.getBundle("email");

    public static Email getEmail() {
        return new Email(resourceEmail.getString("recipient"),
                resourceEmail.getString("theme"),
                resourceEmail.getString("text"));
    }
}
