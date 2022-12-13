package org.example.dfs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.LocatorTag;
import org.testng.Assert;

public class Tag {
    LocatorTag tag = new LocatorTag();
    @Given("user clicks on \"Electronics\" category")
    public void elecCats(){tag.elecCat().click();
    }
    @When("user clicks on \"Awesome\" tag")
    public void awTag(){tag.awesomeTag().click();}
    @And("user clicks on \"game\" tag")
    public void gaTag(){tag.gameTag().click();}
    @Then("tags shows up")
    public void asser(){
        String expectedResult = "Products tagged with 'game'";
        Assert.assertTrue(tag.assertion().getText().contains(expectedResult));
    }
}
