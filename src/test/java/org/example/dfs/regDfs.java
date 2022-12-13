package org.example.dfs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.example.pages.LocatorRegister;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class regDfs {
    LocatorRegister reg = new LocatorRegister();

    @Given("user go to register page")
    public void registerPage()
    {
        reg.registrationLink().click();
    }
    @When("user select gender type")
    public void gender()
    {
        reg.genders().click();
    }
    @And("user enter first name and last name")
    public void names(){
        reg.firstName().sendKeys("Andrew");
        reg.lastName().sendKeys("Nabil");
    }
    @And("user enter date of birthday")
    public void dateOfBirthDay() {
        Select selectD = new Select(reg.dateOfBirthDay());
        selectD.selectByValue("1");
    }
    @And("user enter date of birthmonth")
            public void dateOfBirthMonth(){
        Select selectM = new Select(reg.dateOfBirthMonth());
        selectM.selectByValue("2");
    }
@And("user enter date of birthyear")
        public void dateOfBirthYear(){
        Select selectY = new Select(reg.dateOfBirthYear());
        selectY.selectByValue("1996");
    }
    @And("user enter email field")
    public void email(){
        reg.email().sendKeys("andrewnabil41@gmail.com");
    }
    @And("user fills Password fields")
    public void pass(){
        reg.password().sendKeys("Andrew10Aa@");
        reg.confirmPass().sendKeys("Andrew10Aa@");
    }
    @And("user clicks on register button")
    public void regButn(){
        reg.regButn().click();
    }
    @Then("success message is displayed")
    public void successMsg(){
        String expectedResult = "Your registration completed";
        Assert.assertEquals(reg.successMsg().contains(expectedResult), true);
    }

}
