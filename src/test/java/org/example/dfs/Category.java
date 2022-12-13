package org.example.dfs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.lv.Tad;
import org.example.pages.LocatorCategory;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Category {
    LocatorCategory cats = new LocatorCategory();
    @Given("user hover \"Computers\" category")
    public void hover(){
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(cats.hover()).perform();
    }
    @And("user click on sub-category")
    public void subCat(){cats.subCats().click();}
    @Then("page of sub-category name shows up")
    public void subNames(){
        String expectedResult = "Desktops";
        Assert.assertTrue(cats.subName().getText().contains(expectedResult));
    }
}
