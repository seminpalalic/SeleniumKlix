package Steps;

import Base.BaseUtil;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base){
        this.base = base;
    }

    @Before
    public void Initialize() {

        System.setProperty("webdriver.chrome.driver", "/Users/semin.palalic/Desktop/chromedriver");
        //System.setProperty("apiKey", "401b3e7cb096b0d20e1ff33226e2551a");
        //System.setProperty("googleKey", "6Lc_kYwUAAAAANuWMnAnP6pMKlkChb888UuRayO2");
        //System.setProperty("pageUrl", "https://www.klix.ba/registracija?invisible=false");
        webDriver = new ChromeDriver();

    }

}