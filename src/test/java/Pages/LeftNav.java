package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LeftNav extends Parent{
    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    @FindBy(xpath = "(//li[@class='oxd-main-menu-item-wrapper'])[1]")
    public WebElement admin;

    public WebElement getWebElement(String strButton){

        switch (strButton)
        {
            case "admin": return admin;
            case "2":
            case "3":
            case "4":
        }

        return null;
    }
}


