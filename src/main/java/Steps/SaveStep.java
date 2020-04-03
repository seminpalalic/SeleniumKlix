package Steps;

import Base.BaseUtil;
import Pages.BasketballPage;
import Pages.HomePage;
import Pages.SportPage;
import cucumber.api.java.en.And;

import java.io.IOException;

public class SaveStep extends BaseUtil {

    private BaseUtil base;

    public SaveStep(BaseUtil base) {
        this.base = base;
    }

    @And("^I enter to the sport page$")
    public void iEnterToTheSportPage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickSportButton();
    }

    @And("^I enter to the basketball page$")
    public void iEnterToTheBasketballPage() {
        SportPage sportPage = new SportPage(webDriver);
        sportPage.clickOnBasketballButton();
    }

    @And("^I get all titles of articles and save them to the document$")
    public void iGetAllTitlesOfArticlesAndSaveThemToTheDocument() throws IOException {
        BasketballPage basketballPage = new BasketballPage(webDriver);
        basketballPage.saveAllTitles();
        basketballPage.saveAllTitlesWithWordKorona();
    }
}
