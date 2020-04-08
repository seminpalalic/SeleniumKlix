package Steps;

import Base.BaseUtil;
import Pages.GoogleEmailPage;
import Pages.GooglePasswordPage;
import Pages.HomePage;
import Pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegisterAndLoginStep extends BaseUtil {

    private BaseUtil base;

    public RegisterAndLoginStep(BaseUtil base) {
        this.base = base;
    }

    /*
    @Given("^I open the page$")
    public void iOpenThePage() {
        webDriver.get("https://www.klix.ba");
    }

    @And("^I navigate to the register page$")
    public void iNavigateToTheRegisterPage() throws InterruptedException {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickLoginButton();
        TimeUnit.SECONDS.sleep(2);
    }

    @And("^I click on google sign$")
    public void iClickOnGoogleSign() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickOnGoogleSignInButton();
    }

    @And("^I enter my gmail email as \"([^\"]*)\"$")
    public void iEnterMyGmailEmailAs(String email) {
        GoogleEmailPage googleEmailPage = new GoogleEmailPage(webDriver);
        googleEmailPage.switchToTheGoogleSignInWindow();
        googleEmailPage.enterEmail(email);
    }

    @And("^I click on the next button on email page$")
    public void iClickOnTheNextButtonOnEmailPage() {
        GoogleEmailPage googleEmailPage = new GoogleEmailPage(webDriver);
        googleEmailPage.clickOnTheNextButton();
    }

    @And("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) {
        GooglePasswordPage googlePasswordPage = new GooglePasswordPage(webDriver);
        googlePasswordPage.enterPassword(password);
    }

    @And("^I click on the next button on password page$")
    public void iClickOnTheNextButtonOnPasswordPage() throws InterruptedException {
        GooglePasswordPage googlePasswordPage = new GooglePasswordPage(webDriver);
        googlePasswordPage.clickOnTheNextButton();
        googlePasswordPage.switchToTheHomePageWindow();
        TimeUnit.SECONDS.sleep(5);
    }
     */
}
