package org.example.dfs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.LocatorReset;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Reset {
    LocatorReset reset = new LocatorReset();
    @Given("user clicks on forget password button")
    public void forgetButn(){
        reset.forgetButton().click();
    }
    @When("user clicks on recover")
    public void recoverButn(){
        reset.recoveryButton().click();
    }
    @Then("confirmation message is displayed")
    public void confirmationMessage(){
        Assert.assertTrue(Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p")).isDisplayed());
    }
}
