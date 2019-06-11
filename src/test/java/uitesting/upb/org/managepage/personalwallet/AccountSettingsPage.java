package uitesting.upb.org.managepage.personalwallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AccountSettingsPage extends BasePage {
    @FindBy(xpath = "//div[@id='app']//*[@class='form-group']//input[@placeholder='Account name']")
    private WebElement accountNameInput;

    @FindBy(css = "#changeNameButton")
    private WebElement changeNameButton;

    @FindBy(css = "#deleteAccountButton")
    private WebElement deleteAccountButton;

    @FindBy(css = "#exit")
    private WebElement exitButton;

    public AccountSettingsPage writeNewAccountName(String name) {
        Events.fillField(accountNameInput, name);
        return this;
    }

    public AccountSettingsPage clickChangeNameButton() {
        Events.click(changeNameButton);
        return this;
    }
    public AccountHomeMenu clickDeleteAccountButton() {
        Events.click(deleteAccountButton);
        return new AccountHomeMenu();
    }
    public AccountHomeMenu clickExitButton() {
        Events.click(exitButton);
        return new AccountHomeMenu();
    }
}
