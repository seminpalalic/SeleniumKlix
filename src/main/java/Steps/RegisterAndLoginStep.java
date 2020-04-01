package Steps;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterAndLoginStep extends BaseUtil {

    public String winHandleBefore;
    private BaseUtil base;

    public RegisterAndLoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I open the page$")
    public void iOpenThePage() {
        webDriver.get("https://www.klix.ba");
    }

    @And("^I navigate to the register page$")
    public void iNavigateToTheRegisterPage() {
        WebDriverWait wait = new WebDriverWait(webDriver, 100);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kat_naslovnica\"]/header/div[1]/div[5]/ul/li[2]/div/a/i")));
        element.click();
    }

    @And("^I click on google sign$")
    public void iClickOnGoogleSign() {
        WebDriverWait wait = new WebDriverWait(webDriver, 100);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"my-signin2\"]/div/div")));
        element.click();
    }

    @And("^I enter my gmail email as \"([^\"]*)\"$")
    public void iEnterMyGmailEmailAs(String email) {

        winHandleBefore = webDriver.getWindowHandle();
        for (String winHandle : webDriver.getWindowHandles()) {
            webDriver.switchTo().window(winHandle);
        }
        WebDriverWait wait = new WebDriverWait(webDriver, 100);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"identifierId\"]")));
        element.sendKeys(email);
        //webDriver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(email);

    }

    @And("^I click on the next button on email page$")
    public void iClickOnTheNextButtonOnEmailPage() {
        WebDriverWait wait = new WebDriverWait(webDriver, 100);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"identifierNext\"]")));
        element.click();
    }

    @And("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) {
        WebDriverWait wait = new WebDriverWait(webDriver, 100);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")));
        element.sendKeys(password);
    }

    @And("^I click on the next button on password page$")
    public void iClickOnTheNextButtonOnPasswordPage() {
        WebDriverWait wait = new WebDriverWait(webDriver, 100);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"passwordNext\"]/span")));
        element.click();
        webDriver.switchTo().window(winHandleBefore);
    }
}
