package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AccountHomeMenu extends BasePage {
    @FindBy(css = "#accountNameInput")
    private WebElement accountNameInput;

    @FindBy(css = "#addAccountButton")
    private WebElement addAccountButton;

    public AccountHomeMenu writeAccountName(String name) {
        Events.fillField(accountNameInput, name);
        return this;
    }

    public AccountHomeMenu clickAddButton() {
        Events.click(addAccountButton);
        return this;
    }

    public MainMenu clickButtonById(String id) {
        Events.click(Events.GetWebElementById(id));
        return new MainMenu();
    }
    public String getButtonNameById(String id) {
        WebElement button = Events.GetWebElementById(id);
        return button.getText();
    }
    public int getNumberOfButtons() {
        return Events.GetNumberOfElements("//*[@id='app']/div/div[2]");
    }
}
