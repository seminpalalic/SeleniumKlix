package Steps;

import Base.BaseUtil;
import Transformation.SaveData;
import cucumber.api.java.en.And;
import cucumber.deps.com.thoughtworks.xstream.io.xml.XStream11NameCoder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SaveStep extends BaseUtil {

    private BaseUtil base;
    private List<String> titleList = new ArrayList<>();
    private List<String> titleListWithKorona = new ArrayList<>();

    public SaveStep(BaseUtil base) {
        this.base = base;
    }

    @And("^I enter to the sport page$")
    public void iEnterToTheSportPage() {
        WebDriverWait wait = new WebDriverWait(webDriver, 100);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kat_naslovnica\"]/header/div[1]/nav/ul[1]/li[4]/div/a")));
        element.click();
    }

    @And("^I enter to the basketball page$")
    public void iEnterToTheBasketballPage() {
        WebDriverWait wait = new WebDriverWait(webDriver, 100);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kat_naslovnica\"]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/a[2]")));
        element.click();
    }

    @And("^I get all titles of articles and save them to the document$")
    public void iGetAllTitlesOfArticlesAndSaveThemToTheDocument() throws IOException {

        WebDriverWait wait = new WebDriverWait(webDriver, 100);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kat_naslovnica\"]/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/article")));

        List<WebElement> elements = webDriver.findElements(By.xpath("//*[@id=\"kat_naslovnica\"]/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/article"));

        for (WebElement we : elements){
            String title = we.findElement(By.cssSelector("h1")).getText();
            titleList.add(title);
            if (title.contains("koronavirus")) {
                titleListWithKorona.add(title);
            }
        }

        SaveData.SaveToFile("Svi naslovi", titleList);
        SaveData.SaveToFile("Svi naslovi sa koronavirus", titleListWithKorona);

    }
}
