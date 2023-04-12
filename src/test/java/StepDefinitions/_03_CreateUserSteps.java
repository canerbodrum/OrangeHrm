package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.time.Duration;

public class _03_CreateUserSteps {
    Robot robot=new Robot();
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));

    public _03_CreateUserSteps() throws AWTException {
    }

    @And("fill up the form by entering the required info to the all input boxes I click on Save button")
    public void fillUpTheFormByEnteringTheRequiredInfoToTheAllInputBoxesIClickOnSaveButton() {
        dc.clickFunction(dc.userRoleSelect);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@role='listbox']/*"),2));
        dc.clickFunction(dc.listbox.get(2));
        dc.clickFunction(dc.statusSelect);
        dc.clickFunction(dc.listbox.get(1));
        String admin=dc.eemployeName.getText();
        String bosluk= String.valueOf(admin.indexOf(" "));
        String soyad=admin.substring(Integer.parseInt(bosluk));
        dc.sendKeysFunction(dc.employee,admin);
        wait.until(ExpectedConditions.stalenessOf(dc.listbox.get(0)));
        wait.until(ExpectedConditions.textToBePresentInElement(dc.listbox.get(0), soyad));
        dc.clickFunction(dc.listbox.get(0));
        dc.clickFunction(dc.saveButton);

    }

    @Then("password not match")
    public void passwordNotMatch() {
        Assert.assertTrue(dc.passNotMatch.isDisplayed());
    }

    @And("Role Select And Status Select as ESS")
    public void roleSelectAndStatusSelectAsESS() {
        dc.clickFunction(dc.userRoleSelect);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@role='listbox']/*"),2));
        dc.clickFunction(dc.listbox.get(2));
        dc.clickFunction(dc.statusSelect);
        dc.clickFunction(dc.listbox.get(1));
        String admin=dc.eemployeName.getText();
    }

    @Then("invalid Not Match")
    public void invalidNotMatch() {
        Assert.assertTrue(dc.invalidNotMatch.isDisplayed());
    }

    @Then("Should be at least less characters")
    public void shouldBeAtLeastLessCharacters() {
        Assert.assertTrue(dc.userCharacter.isDisplayed());
    }

    @Then("add button is displayed")
    public void addButtonIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(dc.verifyAddButton));
        Assert.assertTrue(dc.verifyAddButton.isDisplayed());
    }

    @Then("all required elements is displayed")
    public void allRequiredElementsIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(dc.userRoleSelect));
        Assert.assertTrue(dc.userRoleSelect.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(dc.employee));
        Assert.assertTrue(dc.employee.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(dc.statusSelect));
        Assert.assertTrue(dc.statusSelect.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(dc.userName));
        Assert.assertTrue(dc.userName.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(dc.password1));
        Assert.assertTrue(dc.password1.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(dc.password2));
        Assert.assertTrue(dc.password2.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(dc.saveButton));
        Assert.assertTrue(dc.saveButton.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(dc.cancelButton));
        Assert.assertTrue(dc.cancelButton.isDisplayed());

    }

    @Then("Add User Heading is displayed")
    public void addUserHeadingIsDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(dc.headingVerify));
        Assert.assertTrue(dc.headingVerify.isDisplayed());

    }

    @Then("password Should have at least characters")
    public void passwordShouldHaveAtLeastCharacters() {
        Assert.assertTrue(dc.lessPass.isDisplayed());
    }

    @Then("Try Different Pass is displayed")
    public void tryDifferentPassIsDisplayed() {
        Assert.assertTrue(dc.differentPass.isDisplayed());
    }
}
