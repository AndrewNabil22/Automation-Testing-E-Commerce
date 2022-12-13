package org.example.dfs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.LocatorLogin;
import org.example.pages.LocatorRegister;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Login {
    LocatorLogin log = new LocatorLogin();
    LocatorRegister register = new LocatorRegister();

    @Given("user go to login page")
    public void loginPage() {log.loginPage().click();}
    @When("user enter an existing email")
    public void exEmail(){
            log.logEmail().sendKeys("andrewnabil41@gmail.com");
    }
    @When("user clicks on forget password button")
    public void forgetButn(){
        log.forgetButton().click();
    }
    @And("user enter an valid password")
    public void exPassword(){
            log.logPass().sendKeys("Andrew10Aa@");
    }
    @And("user clicks on recover")
    public void recoverButn(){
        log.recoveryButton().click();
    }
    @When("user login with \"invalid\"")
    public void invalidData(){
           log.logEmail().sendKeys("test@glsdl.co");
           log.logPass().sendKeys("16549wewwsd59");
    }
    @And("user clicks on login button")
    public void logButton(){
            log.loginButton().click();
    }
    @Then("user login to the system successfully")
    public void loginSuccessfully(){
            log.logSuc();
            Assert.assertTrue(Hooks.driver.findElement(By.className("ico-account")).isDisplayed());
              System.out.println("Logged in Successfully");
    }
    @Then("user could not login to the system")
    public void loginUnSuccessfully() throws InterruptedException {
        log.logunSuc().isDisplayed();
        System.out.println("Login was unsuccessful.");
        System.out.println("the color of this message is red");
    }
    @Then("confirmation message is displayed")
    public void confirmationMessage(){
        Assert.assertTrue(Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p")).isDisplayed());
    }
}
