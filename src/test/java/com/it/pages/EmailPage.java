package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPage extends BasePage {
    @FindBy(xpath = "//textarea[@name='to']")
    private WebElement inputRecipient;

    @FindBy(xpath = "//span//input[@name='subject']")
    private WebElement inputTheme;

    @FindBy(xpath = "//div//textarea[@id='text']")
    private WebElement inputText;

    @FindBy(xpath = "//p//input[@tabindex='12']")
    private WebElement btnSubmit;

    public void createEmail(String recipient, String theme, String text) {
        inputRecipient.sendKeys(recipient);
        inputTheme.sendKeys(theme);
        inputText.click();
        inputText.sendKeys(text);
        btnSubmit.click();
    }
}
