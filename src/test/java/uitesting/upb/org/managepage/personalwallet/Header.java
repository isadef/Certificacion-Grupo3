package uitesting.upb.org.managepage.personalwallet;

import cucumber.api.java.it.Ma;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.webdrivermanager.DriverManager;

public class Header {

    @FindBy(css = "#exit")
    private WebElement exitButton;

    public AccountHomeMenu clickExitButton() {
        Events.click(exitButton);
        return new AccountHomeMenu();
    }
}
