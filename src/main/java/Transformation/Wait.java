package Transformation;

import Base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait extends BaseUtil {

    private BaseUtil base;

    public Wait(BaseUtil base) {
        this.base = base;
    }

    public static void waitAndWrite(WebElement webElement, String text) {
        WebDriverWait wait = new WebDriverWait(webDriver, 100);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.sendKeys(text);
    }

    public static void waitAndClick(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, 100);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

}
