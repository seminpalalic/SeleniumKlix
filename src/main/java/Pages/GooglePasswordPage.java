package Pages;

import Base.BaseUtil;
import Transformation.Wait;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GooglePasswordPage extends BaseUtil {

    @FindBy(how = How.NAME, using = "password")
    private WebElement passwordInput;
    @FindBy(how = How.ID, using = "passwordNext")
    private WebElement nextButton;
    private BaseUtil base;

    public GooglePasswordPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public GooglePasswordPage(BaseUtil base) {
        this.base = base;
    }

    @Step("Enter password: {0}")
    public void enterPassword(String password) {
        Wait.waitAndWrite(passwordInput, password);
    }

    @Step("Click on the next button")
    public void clickOnTheNextButton() {
        Wait.waitAndClick(nextButton);
    }

    @Step("Switch to the home page window")
    public void switchToTheHomePageWindow() {
        webDriver.switchTo().window(winHandleBefore);
    }

}
