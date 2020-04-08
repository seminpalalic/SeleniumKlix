package Pages;

import Transformation.Wait;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(how = How.ID, using = "my-signin2")
    private WebElement googleSignInButton;

    public LoginPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @Step("Click on google sign in button")
    public void clickOnGoogleSignInButton() {
        Wait.waitAndClick(googleSignInButton);
    }

}
