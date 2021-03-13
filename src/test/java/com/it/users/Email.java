package com.it.users;

public class Email {
    public String recipient;
    public String theme;
    public String text;

    public Email(String recipient, String theme, String text) {
        this.recipient = recipient;
        this.theme = theme;
        this.text = text;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email = (Email) o;

        if (recipient != null ? !recipient.equals(email.recipient) : email.recipient != null) return false;
        if (theme != null ? !theme.equals(email.theme) : email.theme != null) return false;
        return text != null ? text.equals(email.text) : email.text == null;
    }

    @Override
    public int hashCode() {
        int result = recipient != null ? recipient.hashCode() : 0;
        result = 31 * result + (theme != null ? theme.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Email{" +
                "recipient='" + recipient + '\'' +
                ", theme='" + theme + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
