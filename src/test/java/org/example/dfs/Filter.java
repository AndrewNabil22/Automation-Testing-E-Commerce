package org.example.dfs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.LocatorFilter;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Filter {
    LocatorFilter fil = new LocatorFilter();

    @Given("user hover \"Apparel\" category")
    public void hvrApparel() {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(fil.hoverApparel()).perform();
    }
    @When("user click on sub-category \"Shoes\"")
        public void apparelShoes() {
            fil.subCat().click();
    }
    @And("user click on \"Red\" filter")
    public void colorFilter(){
        fil.colorFilter().click();
    }
    @Then("only Red shoes shows up")
    public void successFilter(){
        Assert.assertEquals(fil.sucRedFilter(),"https://demo.nopcommerce.com/shoes?viewmode=grid&orderby=0&pagesize=6&specs=15");
    }
}
