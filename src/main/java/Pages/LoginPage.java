package Pages;

import Transformation.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div")
    private WebElement googleSignInButton;

    public LoginPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void clickOnGoogleSignInButton() {
        Wait.waitAndClick(googleSignInButton);
    }

}
