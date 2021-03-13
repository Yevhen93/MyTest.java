package com.it.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {
    @FindBy(xpath = "//li//a[@href='/compose/1628277482/']")
    private WebElement btnCreateLetter;

    public void createLetter() {
        btnCreateLetter.click();
    }

    @FindBy(xpath = "//span[@class='sn_menu_title']")
    private WebElement lbMail;


    public String getMailUser() {
        return lbMail.getText();

    }


}
