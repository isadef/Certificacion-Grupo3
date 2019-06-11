package uitesting.upb.org.webdrivermanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uitesting.upb.org.managefile.PropertyAccesor;

/**
 * @autor Marcelo Garay
 */
public class DriverManager {
    private WebDriver webDriver;
    private WebDriverWait wait;
    private static DriverManager ourInstance = new DriverManager();

    public static DriverManager getInstance() {
        return ourInstance;
    }

    private DriverManager() {
        webDriver = DriverFactory.getWebDriver(BrowserType.valueOf(PropertyAccesor.getInstance().getBrowser()));
        wait = new WebDriverWait(webDriver, 10);
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }

    public WebElement waitForElement (By by) {
        WebElement webElement = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        return webElement;
    }
}
