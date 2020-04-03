package Pages;

import Base.BaseUtil;
import Transformation.SaveData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BasketballPage extends BaseUtil {

    @FindAll({@FindBy(xpath = "/html/body/div[2]/div[2]/div/div[1]/div[2]/div[2]/div/article")})
    private List<WebElement> articles;
    private BaseUtil base;
    private List<String> titleList = new ArrayList<>();
    private List<String> titleListWithKorona = new ArrayList<>();

    public BasketballPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public BasketballPage(BaseUtil base) {
        this.base = base;
    }

    private void collectAllTitles() {
        for (WebElement we : articles) {
            String title = we.findElement(By.cssSelector("h1")).getText();
            titleList.add(title);
        }
    }

    private void collectAllTitlesWithWordKorona() {
        for (WebElement we : articles) {
            String title = we.findElement(By.cssSelector("h1")).getText();
            if (title.contains("koronavirus")) {
                titleListWithKorona.add(title);
            }
        }
    }

    public void saveAllTitles() throws IOException {
        collectAllTitles();
        SaveData.SaveToFile("Svi naslovi", titleList);
    }

    public void saveAllTitlesWithWordKorona() throws IOException {
        collectAllTitlesWithWordKorona();
        SaveData.SaveToFile("Svi naslovi sa koronavirus", titleListWithKorona);
    }

}
