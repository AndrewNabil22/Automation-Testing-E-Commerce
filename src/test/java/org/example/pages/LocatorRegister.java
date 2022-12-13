package org.example.pages;

import org.example.dfs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorRegister {
    public WebElement firstName(){
        WebElement firstname = Hooks.driver.findElement(By.id("FirstName"));
        return firstname;
    }
    public WebElement lastName(){
        WebElement lastname = Hooks.driver.findElement(By.id("LastName"));
        return lastname;
    }
    public WebElement genders(){
        WebElement gender = Hooks.driver.findElement(By.id("gender-male"));
        return gender;
    }
    public WebElement registrationLink() {
        WebElement register = Hooks.driver.findElement(By.className("ico-register"));
        return register;
    }
    public WebElement email() {
        WebElement regEmail = Hooks.driver.findElement(By.id("Email"));
        return regEmail;
    }
    public WebElement password(){
        WebElement pass = Hooks.driver.findElement(By.id("Password"));
        return pass;
    }
    public WebElement confirmPass(){
        WebElement confirmPass = Hooks.driver.findElement(By.id("ConfirmPassword"));
        return confirmPass;
    }
    public WebElement regButn(){
        WebElement regButton = Hooks.driver.findElement(By.id("register-button"));
        return regButton;
    }
    public String successMsg(){
        String actualResult = Hooks.driver.findElement(By.className("result")).getText();
        return actualResult;
    }
    public WebElement dateOfBirthDay(){
        WebElement birthDay = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        return birthDay;
    }
    public WebElement dateOfBirthMonth(){
        WebElement birthMonth = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        return birthMonth;
    }
    public WebElement dateOfBirthYear() {
        WebElement birthYear = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        return birthYear;
    }
}
