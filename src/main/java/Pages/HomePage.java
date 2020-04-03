package Pages;

import Transformation.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(how = How.XPATH, using = "/html/body/header/div[1]/div[5]/ul/li[2]/div")
    private WebElement loginButton;
    @FindBy(how = How.XPATH, using = "/html/body/header/div[1]/nav/ul[1]/li[4]/div/a")
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
