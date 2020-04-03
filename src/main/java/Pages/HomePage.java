package Pages;

import Transformation.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(how = How.CLASS_NAME, using = "icon_user")
    private WebElement loginButton;
    @FindBy(how = How.CLASS_NAME, using = "li_sport")
    private WebElement sportButton;

    public HomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickSportButton() {
        Wait.waitAndClick(sportButton);
    }

}
