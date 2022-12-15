package org.example.pages;

import org.example.dfs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorReset {

    public WebElement forgetButton() {
        WebElement frgtButn = Hooks.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.form-fields > div.inputs.reversed > span > a"));
        return frgtButn;
    }

    public WebElement recoveryButton(){
        WebElement recoverButn = Hooks.driver.findElement(By.name("send-email"));
        return recoverButn;
    }
}
