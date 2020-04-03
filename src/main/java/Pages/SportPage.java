package Pages;

import Base.BaseUtil;
import Transformation.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SportPage extends BaseUtil {

    @FindBy(how = How.XPATH, using = "//a[@class='headingUrl tch_sport'][contains(text(),'arka')]")
    private WebElement basketballButton;
    private BaseUtil base;

    public SportPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public SportPage(BaseUtil base) {
        this.base = base;
    }

    public void clickOnBasketballButton() {
        Wait.waitAndClick(basketballButton);
    }

}
