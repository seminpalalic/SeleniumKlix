package Pages;

import Base.BaseUtil;
import Transformation.Wait;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleEmailPage extends BaseUtil {

    @FindBy(how = How.NAME, using = "identifier")
    private WebElement emailInput;
    @FindBy(how = How.ID, using = "identifierNext")
    private WebElement nextButton;
    private BaseUtil base;

    public GoogleEmailPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public GoogleEmailPage(BaseUtil base) {
        this.base = base;
    }

    @Step("Switch to the google sign in window")
    public void switchToTheGoogleSignInWindow() {
        winHandleBefore = webDriver.getWindowHandle();
        for (String winHandle : webDriver.getWindowHandles()) {
            webDriver.switchTo().window(winHandle);
        }
    }

    @Step("Enter email: {0}")
    public void enterEmail(String email) {
        Wait.waitAndWrite(emailInput, email);//emailInput.sendKeys(email);
    }

    @Step("Click on the next button")
    public void clickOnTheNextButton() {
        Wait.waitAndClick(nextButton);
    }

}
