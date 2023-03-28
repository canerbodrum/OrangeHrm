package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        dc.sendKeysFunction(dc.userName,"randomUser2");
        dc.sendKeysFunction(dc.password1,"Romdom.123");
        dc.sendKeysFunction(dc.password2,"Romdom.123");
        String admin=dc.eemployeName.getText();
        dc.sendKeysFunction(dc.employee,admin);
        wait.until(ExpectedConditions.stalenessOf(dc.cikan));
        dc.clickFunction(dc.cikan);


    }
}
