package com.it.helpers;

import com.it.pages.EmailPage;
import com.it.users.Email;

public class EmailHelper extends EmailPage {
    public void createEmail(Email email) {
        createEmail(email.recipient,email.theme,email.text);
    }
}
