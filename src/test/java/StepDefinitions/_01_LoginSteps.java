package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _01_LoginSteps {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @Given("Navigate to Site")
    public void navigateToSite() {
        GWD.getDriver().get("https://opensource-demo.orangehrmlive.com/");
    }

    @When("login as an Admin")
    public void loginAsAnAdmin() {

        dc.sendKeysFunction(dc.idBox, "Admin");
        dc.sendKeysFunction(dc.pass, "admin123");
        dc.clickFunction(dc.login);
    }

    @Then("Required  message should be displayed")
    public void requiredMessageShouldBeDisplayed() {
        Assert.assertTrue(dc.required.isDisplayed());
    }
}
