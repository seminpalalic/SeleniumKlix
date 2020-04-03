package Pages;

import Base.BaseUtil;
import Transformation.Wait;
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

    public void enterPassword(String password) {
        Wait.waitAndWrite(passwordInput, password);
    }

    public void clickOnTheNextButton() {
        Wait.waitAndClick(nextButton);
    }

    public void switchToTheHomePageWindow() {
        webDriver.switchTo().window(winHandleBefore);
    }

}
