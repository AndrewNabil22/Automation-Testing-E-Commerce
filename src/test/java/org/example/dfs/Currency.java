package org.example.dfs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;

import java.util.List;

public class Currency {
    @When("user select euro")
    public void euro(){
        WebElement currency = Hooks.driver.findElement(By.id("customerCurrency"));
        Select select = new Select(currency);
        select.selectByVisibleText("Euro");
    }

    @Then("euro icon displayed")
    public void euroIconDisplayed() {
        for (int x=0 ; x < 4; x++)
        {
           List<WebElement> currency = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
           String prices = currency.get(x).getText();
           System.out.println(prices);
        }
    }
}
