package org.example.pages;

import org.example.dfs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LocatorLogin {
    public WebElement loginPage() {
        WebElement login = Hooks.driver.findElement(By.className("ico-login"));
        return login;
    }

    public WebElement logEmail() {
        WebElement exEmail = Hooks.driver.findElement(By.id("Email"));
        return exEmail;
    }

    public WebElement logPass() {
        WebElement validPass = Hooks.driver.findElement(By.id("Password"));
        return validPass;
    }

    public WebElement loginButton() {
        WebElement logButn = Hooks.driver.findElement(By.cssSelector("form > div > button[type=\"submit\"]"));
        return logButn;
    }

    public WebElement logSuc() {
        WebElement suc = Hooks.driver.findElement(By.className("ico-logout"));
        return suc;
    }

    public WebElement logunSuc() {
        WebElement unSuc = Hooks.driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]"));
        return unSuc;
    }

    public WebElement forgetButton() {
        WebElement frgtButn = Hooks.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.form-fields > div.inputs.reversed > span > a"));
        return frgtButn;
    }

    public WebElement recoveryButton(){
        WebElement recoverButn = Hooks.driver.findElement(By.name("send-email"));
        return recoverButn;
    }
}
