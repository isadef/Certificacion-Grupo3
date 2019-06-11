package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;

public class Header {

    @FindBy(xpath = "//*[@id='exit']")
    private WebElement exitButton;

    public Header clickExitButton() {
        Events.click(exitButton);
        return this;
    }
}
