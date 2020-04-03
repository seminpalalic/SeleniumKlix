package Steps;

import Base.BaseUtil;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void Initialize() {

        System.setProperty("webdriver.chrome.driver", "/Users/semin.palalic/Desktop/chromedriver");
        System.setProperty("java.net.preferIPv4Stack", "true");
        webDriver = new ChromeDriver();

    }

}