package Steps;

import Base.BaseUtil;
import Pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginAndSaveDataStep extends BaseUtil {

    String appURL = "http://klix.ba";

    @BeforeClass
    public void initialize() {

        System.setProperty("webdriver.chrome.driver", "/Users/semin.palalic/Desktop/chromedriver");
        webDriver = new ChromeDriver();
    }

    @Test(priority = 1)
    @Description("Open the page")
    @Given("^I open the page$")
    public void iOpenThePage() {
        webDriver.get(appURL);
    }

    @Test(priority = 2)
    @Description("Navigate to the register page")
    @And("^I navigate to the register page$")
    public void iNavigateToTheRegisterPage() throws InterruptedException {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickLoginButton();
        TimeUnit.SECONDS.sleep(2);
    }

    @Test(priority = 3)
    @Description("Click on google sing in button")
    @And("^I click on google sign$")
    public void iClickOnGoogleSign() {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.clickOnGoogleSignInButton();
    }

    @Test(priority = 4)
    @Description("Enter email")
    @Parameters("email")
    @And("^I enter my gmail email as \"([^\"]*)\"$")
    public void iEnterMyGmailEmailAs(String email) {
        GoogleEmailPage googleEmailPage = new GoogleEmailPage(webDriver);
        googleEmailPage.switchToTheGoogleSignInWindow();
        googleEmailPage.enterEmail(email);
    }

    @Test(priority = 5)
    @Description("Click on next button")
    @And("^I click on the next button on email page$")
    public void iClickOnTheNextButtonOnEmailPage() {
        GoogleEmailPage googleEmailPage = new GoogleEmailPage(webDriver);
        googleEmailPage.clickOnTheNextButton();
    }

    @Test(priority = 6)
    @Parameters("password")
    @Description("Enter password")
    @And("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) {
        GooglePasswordPage googlePasswordPage = new GooglePasswordPage(webDriver);
        googlePasswordPage.enterPassword(password);
    }

    @Test(priority = 7)
    @Description("Click on next button")
    @And("^I click on the next button on password page$")
    public void iClickOnTheNextButtonOnPasswordPage() throws InterruptedException {
        GooglePasswordPage googlePasswordPage = new GooglePasswordPage(webDriver);
        googlePasswordPage.clickOnTheNextButton();
        googlePasswordPage.switchToTheHomePageWindow();
        TimeUnit.SECONDS.sleep(5);
    }

    @Test(priority = 8)
    @Description("Navigate to the sport page")
    @And("^I enter to the sport page$")
    public void iEnterToTheSportPage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickSportButton();
    }

    @Test(priority = 9)
    @Description("Navigate to the basketball page")
    @And("^I enter to the basketball page$")
    public void iEnterToTheBasketballPage() throws InterruptedException {
        SportPage sportPage = new SportPage(webDriver);
        sportPage.clickOnBasketballButton();
        TimeUnit.SECONDS.sleep(3);
    }

    @Test(priority = 10)
    @Description("Get all titles of articles and save the to the document")
    @And("^I get all titles of articles and save them to the document$")
    public void iGetAllTitlesOfArticlesAndSaveThemToTheDocument() throws IOException {
        BasketballPage basketballPage = new BasketballPage(webDriver);
        basketballPage.saveAllTitles();
        basketballPage.saveAllTitlesWithWordKorona();
    }

    @AfterClass
    public void tearDown() {
        webDriver.close();
    }

}